package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climbing;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.Climber;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);
}