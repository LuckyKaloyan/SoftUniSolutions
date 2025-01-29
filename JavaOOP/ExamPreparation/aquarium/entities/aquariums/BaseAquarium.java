package SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.aquariums;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.common.ConstantMessages;
import SoftUniJavaOOP.ExamPreparationOOP.aquarium.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.decorations.Decoration;
import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
    }

    @Override
    public int calculateComfort() {
        return decorations.stream().mapToInt(Decoration::getComfort).sum();
    }

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.AQUARIUM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public void addFish(Fish fish) {
        if (this.fish.size() < capacity) {
            this.fish.add(fish);
        } else {
            throw new IllegalStateException(ConstantMessages.NOT_ENOUGH_CAPACITY);
        }
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove(fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
        decorations.add(decoration);
    }

    @Override
    public void feed() {
        fish.forEach(Fish::eat);
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("%s (%s):%n", getName(), this.getClass().getSimpleName()));
        info.append("Fish: ");
        if (fish.isEmpty()) {
            info.append("none");
        } else {
            fish.forEach(f -> info.append(f.getName()).append(" "));
        }
        info.append(String.format("%nDecorations: %d%nComfort: %d", decorations.size(), calculateComfort()));
        return info.toString();
    }

    @Override
    public Collection<Fish> getFish() {
        return Collections.unmodifiableCollection(fish);
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return Collections.unmodifiableCollection(decorations);
    }
}