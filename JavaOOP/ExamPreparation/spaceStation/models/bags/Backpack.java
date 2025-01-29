package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.bags;

import java.util.Collection;
import java.util.Collections;

public class Backpack implements Bag {
    private Collection<String> items;

    public Backpack() {
        this.items = Collections.emptyList();
    }

    @Override
    public Collection<String> getItems() {
        return items;
    }
}
