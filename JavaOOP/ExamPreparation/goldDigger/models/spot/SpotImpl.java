package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.spot;

import java.util.Collection;
import java.util.HashSet;

public class SpotImpl implements Spot {
    private String name;
    private Collection<String> exhibits;

    public SpotImpl(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Invalid name!");
        }
        this.name = name;
        this.exhibits = new HashSet<>();
    }

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    @Override
    public String getName() {
        return name;
    }
}
