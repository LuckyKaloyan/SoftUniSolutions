package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MountainImpl implements Mountain {
    private final String name;
    private final List<String> peaksList;

    public MountainImpl(String name) {
        this.name = name;
        this.peaksList = new ArrayList<>();
    }

    public MountainImpl(String name, List<String> peaksList) {
        this.name = name;
        this.peaksList = new ArrayList<>(peaksList);
    }

    @Override
    public Collection<String> getPeaksList() {
        return Collections.unmodifiableList(peaksList);
    }

    @Override
    public String getName() {
        return name;
    }
}
