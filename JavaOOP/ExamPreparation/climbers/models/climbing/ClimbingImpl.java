package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climbing;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.Climber;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.Mountain;

import java.util.Collection;

public class ClimbingImpl implements Climbing {
    @Override
    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers) {
        for (Climber climber : climbers) {
            // Check if climber can climb
            if (climber.canClimb()) {
                // Get the peaks of the mountain
                Collection<String> peaks = mountain.getPeaksList();

                // Check if there are peaks to conquer
                if (!peaks.isEmpty()) {
                    // Get the first peak
                    String peak = peaks.iterator().next();

                    // Conquer the peak
                    climber.getRoster().addPeak(peak);

                    // Decrease climber's strength
                    climber.climb();

                    // Remove conquered peak from mountain
                    peaks.remove(peak);
                } else {
                    // No peaks left to conquer
                    break;
                }

                // Check if climber's strength dropped to 0
                if (!climber.canClimb()) {
                    // Strength dropped to 0, next climber starts climbing
                    continue;
                }
            } else {
                // Climber's strength is 0 or below, cannot climb
                continue;
            }
        }
    }
}
