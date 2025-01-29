package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.roster;

import java.util.Collection;

public interface Roster {
    Collection<String> getPeaks();

    void addPeak(String peak);
}