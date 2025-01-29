package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.planets;

import java.util.Collection;
import java.util.Collections;

public class PlanetImpl implements Planet {
    private String name;
    private Collection<String> items;

    public PlanetImpl(String name) {
        this.name = name;
        this.items = Collections.emptyList();
    }

    @Override
    public Collection<String> getItems() {
        return items;
    }

    @Override
    public String getName() {
        return name;
    }
}
