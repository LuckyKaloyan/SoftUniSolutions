package softuni.exam.service.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.DeviceImportDto;
import softuni.exam.models.dto.DeviceImportRootDto;
import softuni.exam.models.entity.Device;
import softuni.exam.models.enums.DeviceType;
import softuni.exam.repository.DeviceRepository;
import softuni.exam.repository.SaleRepository;
import softuni.exam.service.DeviceService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParser;


import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceRepository deviceRepository;
    XmlParser xmlParser;
    ValidationUtil validationUtil;
    ModelMapper modelMapper;
    SaleRepository saleRepository;

      public DeviceServiceImpl(DeviceRepository deviceRepository,XmlParser xmlParser, ValidationUtil validationUtil,ModelMapper modelMapper,SaleRepository saleRepository) {
          this.deviceRepository = deviceRepository;
          this.xmlParser = xmlParser;
          this.validationUtil = validationUtil;
          this.modelMapper = modelMapper;
          this.saleRepository = saleRepository;
      }

    private final static String FILE_PATH = "src/main/resources/files/xml/devices.xml";

    @Override
    public boolean areImported() {
        if(deviceRepository.count() == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String readDevicesFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importDevices() throws JAXBException {
        StringBuilder sb = new StringBuilder();
        DeviceImportRootDto deviceImportRootDto = this.xmlParser.fromFile(FILE_PATH, DeviceImportRootDto.class);
        for(DeviceImportDto deviceImportDto : deviceImportRootDto.getDevices()){
            if(!this.validationUtil.isValid(deviceImportDto) ||
                    this.deviceRepository.findByBrandAndModel(deviceImportDto.getBrand(), deviceImportDto.getModel()).isPresent()
                   || !this.saleRepository.findById(deviceImportDto.getSaleId()).isPresent()){
                sb.append("Invalid device").append(System.lineSeparator());
                continue;
            }
            Device device = this.modelMapper.map(deviceImportDto, Device.class);
            device.setSale(this.saleRepository.findSaleById(deviceImportDto.getSaleId()));
            device = this.deviceRepository.save(device);
            sb.append(String.format("Successfully imported device of type %s with brand %s",device.getDeviceType(),device.getBrand())).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String exportDevices() {
        StringBuilder sb = new StringBuilder();
        List<Device> devices = this.deviceRepository.findByDeviceTypeAndPriceLessThanAndStorageIsGreaterThanEqual(DeviceType.SMART_PHONE,1000, 128);
        devices.sort(Comparator.comparing(device -> device.getBrand().toLowerCase()));
        for(Device device : devices){
            sb.append(String.format("Device brand: %s\n" +
                    "   *Model: %s\n" +
                    "   **Storage: %d\n" +
                    "   ***Price: %.2f",device.getBrand(),device.getModel(),device.getStorage(),device.getPrice())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
