package softuni.exam.service.impl;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.ForecastImportDto;
import softuni.exam.models.dto.ForecastImportRootDto;
import softuni.exam.models.entity.Forecast;
import softuni.exam.models.enums.DayOfWeek;
import softuni.exam.repository.CityRepository;
import softuni.exam.repository.ForecastRepository;
import softuni.exam.service.ForecastService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Time;
import java.util.List;


@Service
public class ForecastServiceImpl implements ForecastService {
    private final static String FILE_PATH = "src/main/resources/files/xml/forecasts.xml";
    XmlParserImpl xmlParser;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    ForecastRepository forecastRepository;
    CityRepository cityRepository;

    public ForecastServiceImpl(ModelMapper modelMapper, XmlParserImpl xmlParser, CityRepository cityRepository, ValidationUtil validationUtil, ForecastRepository forecastRepository) {
        this.modelMapper = modelMapper;
        this.xmlParser = xmlParser;
        this.cityRepository = cityRepository;
        this.validationUtil = validationUtil;
        this.forecastRepository = forecastRepository;
    }

    @Override
    public boolean areImported() {
        return forecastRepository != null && forecastRepository.count() > 0 ;
    }

    @Override
    public String readForecastsFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importForecasts() throws  JAXBException {


        StringBuilder sb = new StringBuilder();
        ForecastImportRootDto forecastImportRootDto = xmlParser.fromFile(FILE_PATH, ForecastImportRootDto.class);

        for(ForecastImportDto forecastImportDtos:forecastImportRootDto.getForecastImportDtoList()){
            boolean   ALIENS_EXIST = false;
            if(!this.validationUtil.isValid(forecastImportDtos) || (forecastImportDtos.getDay_of_week() == null ||
                    this.cityRepository.findById(forecastImportDtos.getCity()).isEmpty() || forecastImportDtos.getSunset() == null ||
                    forecastImportDtos.getSunrise() ==null || forecastImportDtos.getMax_temperature() == 0 || forecastImportDtos.getMin_temperature() == 0)
            ){
                sb.append("Invalid forecast2").append(System.lineSeparator());
                continue;
            }
            for(Forecast forecast : this.cityRepository.findAllById(forecastImportDtos.getCity()).getForecasts()){
                if(forecast.getDayOfWeek()==forecastImportDtos.getDay_of_week()){
                    sb.append("Invalid forecast1").append(System.lineSeparator());
                    ALIENS_EXIST = true;
                }
            }
            if(ALIENS_EXIST){
                continue;
            }
            Forecast forecast = modelMapper.map(forecastImportDtos, Forecast.class);
            forecast.setCity(this.cityRepository.findAllById(forecastImportDtos.getCity()));
            forecast.setSunrise(Time.valueOf(forecastImportDtos.getSunrise()));
            forecast.setSunset(Time.valueOf(forecastImportDtos.getSunset()));
            forecast.setMinTemperature(forecastImportDtos.getMin_temperature());
            forecast.setMaxTemperature(forecastImportDtos.getMax_temperature());
            sb.append(String.format("Successfully import forecast %s - %.2f", forecastImportDtos.getDay_of_week(), forecastImportDtos.getMax_temperature())).append(System.lineSeparator());
            this.forecastRepository.saveAndFlush(forecast);
        }


        return sb.toString();
    }

    @Override
    public String exportForecasts() {
        StringBuilder sb = new StringBuilder();
        List<Forecast> forecasts = this.forecastRepository.findAllByDayOfWeekOrderByMaxTemperatureDescIdAsc(DayOfWeek.SUNDAY);

        for (Forecast forecast : forecasts) {
            if (forecast.getCity().getPopulation() < 150000) {
                sb.append(String.format("• City: %s:\n" +
                                "   -min temperature: %.2f\n" +
                                "   --max temperature: %.2f\n" +
                                "   ---sunrise: %s\n" +
                                "   ----sunset: %s\n",
                        forecast.getCity().getCityName(),
                        forecast.getMinTemperature(),
                        forecast.getMaxTemperature(),
                        forecast.getSunrise(),
                        forecast.getSunset()));
            }
        }

        return sb.toString();
    }

}
