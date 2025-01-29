package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.astronauts.Astronaut;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AstronautRepository implements Repository<Astronaut> {
    private Map<String, Astronaut> astronauts;

    public AstronautRepository() {
        this.astronauts = new HashMap<>();
    }

    @Override
    public Collection<Astronaut> getModels() {
        return astronauts.values();
    }

    @Override
    public void add(Astronaut astronaut) {
        astronauts.put(astronaut.getName(), astronaut);
    }

    @Override
    public boolean remove(Astronaut astronaut) {
        return astronauts.remove(astronaut.getName()) != null;
    }

    @Override
    public Astronaut findByName(String name) {
        return astronauts.get(name);
    }
}
