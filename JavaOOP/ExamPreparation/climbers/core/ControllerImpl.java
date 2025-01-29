package SoftUniJavaOOP.ExamPreparationOOP.climbers.core;


import SoftUniJavaOOP.ExamPreparationOOP.climbers.common.ConstantMessages;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.Climber;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.RockClimber;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.WallClimber;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climbing.Climbing;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climbing.ClimbingImpl;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.Mountain;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.MountainImpl;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories.ClimberRepository;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories.ClimberRepositoryImpl;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories.MountainRepository;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories.MountainRepositoryImpl;

import java.util.Collection;
import java.util.List;

public class ControllerImpl implements Controller {
    private final ClimberRepository climberRepository;
    private final MountainRepository mountainRepository;

    public ControllerImpl() {
        this.climberRepository = new ClimberRepositoryImpl();
        this.mountainRepository = new MountainRepositoryImpl();
    }

    @Override
    public String addMountain(String mountainName, String... peaks) {
        Mountain mountain = new MountainImpl(mountainName, List.of(peaks));
        mountainRepository.add(mountain);
        return String.format(ConstantMessages.MOUNTAIN_ADDED, mountainName);
    }

    @Override
    public String removeClimber(String climberName) {
        Climber climber = climberRepository.byName(climberName);
        if (climber == null) {
            throw new IllegalArgumentException(String.format("Climber %s doesn't exist.", climberName));
        }
        climberRepository.remove(climber);
        return String.format(ConstantMessages.CLIMBER_REMOVE, climberName);
    }

    @Override
    public String getStatistics() {
        StringBuilder statistics = new StringBuilder();
        Collection<Mountain> climbedMountains = mountainRepository.getCollection();
        statistics.append(String.format(ConstantMessages.FINAL_MOUNTAIN_COUNT, climbedMountains.size()));
        statistics.append(System.lineSeparator());
        statistics.append(ConstantMessages.FINAL_CLIMBERS_STATISTICS);
        statistics.append(System.lineSeparator());
        for (Climber climber : climberRepository.getCollection()) {
            statistics.append(String.format(ConstantMessages.FINAL_CLIMBER_NAME, climber.getName()));
            statistics.append(System.lineSeparator());
            statistics.append(String.format(ConstantMessages.FINAL_CLIMBER_STRENGTH, climber.getStrength()));
            statistics.append(System.lineSeparator());
            statistics.append(ConstantMessages.FINAL_CLIMBER_PEAKS);
            statistics.append(climber.getRoster().getPeaks().isEmpty() ? "None" :
                    String.join(ConstantMessages.FINAL_CLIMBER_FINDINGS_DELIMITER, climber.getRoster().getPeaks()));
            statistics.append(System.lineSeparator());
        }
        return statistics.toString();
    }
    @Override
    public String addClimber(String type, String climberName) {
        Climber climber;
        switch (type) {
            case "WallClimber":
                climber = new WallClimber(climberName);
                break;
            case "RockClimber":
                climber = new RockClimber(climberName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.CLIMBER_INVALID_TYPE);
        }
        climberRepository.add(climber);
        return String.format(ConstantMessages.CLIMBER_ADDED, type, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {
        Mountain mountain = mountainRepository.byName(mountainName);
        if (mountain == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.MOUNTAIN_NAME_NULL_OR_EMPTY, mountainName));
        }
        Collection<Climber> climbers = climberRepository.getCollection();
        if (climbers.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_ARE_NO_CLIMBERS);
        }
        int removedClimberCount = 0;
        Climbing climbing = new ClimbingImpl();
        climbing.conqueringPeaks(mountain, climbers);
        for (Climber climber : climbers) {
            if (climber.getStrength() <= 0) {
                climberRepository.remove(climber);
                removedClimberCount++;
            }
        }
        return String.format(ConstantMessages.PEAK_CLIMBING, mountainName, removedClimberCount);
    }
}

