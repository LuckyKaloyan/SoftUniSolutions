package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.discoverer.Discoverer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DiscovererRepository implements Repository<Discoverer> {
    private Map<String, Discoverer> discoverers;

    public DiscovererRepository() {
        this.discoverers = new HashMap<>();
    }

    @Override
    public Collection<Discoverer> getCollection() {
        return discoverers.values();
    }

    @Override
    public void add(Discoverer discoverer) {
        discoverers.put(discoverer.getName(), discoverer);
    }

    @Override
    public boolean remove(Discoverer discoverer) {
        return discoverers.remove(discoverer.getName()) != null;
    }

    @Override
    public Discoverer byName(String name) {
        return discoverers.get(name);
    }
}
