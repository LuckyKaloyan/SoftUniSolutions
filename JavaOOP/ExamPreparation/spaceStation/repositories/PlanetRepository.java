package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.planets.Planet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlanetRepository implements Repository<Planet> {
    private Map<String, Planet> planets;

    public PlanetRepository() {
        this.planets = new HashMap<>();
    }

    @Override
    public Collection<Planet> getModels() {
        return planets.values();
    }

    @Override
    public void add(Planet planet) {
        planets.put(planet.getName(), planet);
    }

    @Override
    public boolean remove(Planet planet) {
        return planets.remove(planet.getName()) != null;
    }

    @Override
    public Planet findByName(String name) {
        return planets.get(name);
    }
}
