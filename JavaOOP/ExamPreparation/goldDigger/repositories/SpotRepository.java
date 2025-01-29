package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SpotRepository implements Repository<Spot> {
    private Map<String, Spot> spots;

    public SpotRepository() {
        this.spots = new HashMap<>();
    }

    @Override
    public Collection<Spot> getCollection() {
        return spots.values();
    }

    @Override
    public void add(Spot spot) {
        spots.put(spot.getName(), spot);
    }

    @Override
    public boolean remove(Spot spot) {
        return spots.remove(spot.getName()) != null;
    }

    @Override
    public Spot byName(String name) {
        return spots.get(name);
    }
}
