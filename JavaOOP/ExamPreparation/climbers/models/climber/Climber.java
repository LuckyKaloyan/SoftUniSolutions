package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
