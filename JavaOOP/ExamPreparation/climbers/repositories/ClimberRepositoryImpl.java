package SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber.Climber;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClimberRepositoryImpl implements ClimberRepository {
    private final Map<String, Climber> climbers;

    public ClimberRepositoryImpl() {
        this.climbers = new HashMap<>();
    }

    @Override
    public Collection<Climber> getCollection() {
        return climbers.values();
    }

    @Override
    public void add(Climber climber) {
        if (climbers.containsKey(climber.getName())) {
            throw new IllegalArgumentException("Climber with this name already exists.");
        }
        climbers.put(climber.getName(), climber);
    }

    @Override
    public boolean remove(Climber climber) {
        return climbers.remove(climber.getName()) != null;
    }

    @Override
    public Climber byName(String name) {
        return climbers.get(name);
    }
}
