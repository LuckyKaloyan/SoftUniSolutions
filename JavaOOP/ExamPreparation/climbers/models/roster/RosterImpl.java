package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.roster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RosterImpl implements Roster {
    private final List<String> peaks;

    public RosterImpl() {
        this.peaks = new ArrayList<>();
    }

    public void addPeak(String peak) {
        peaks.add(peak);
    }

    @Override
    public Collection<String> getPeaks() {
        return Collections.unmodifiableList(peaks);
    }
}
