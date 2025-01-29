package SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.Mountain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MountainRepositoryImpl implements MountainRepository {
    private final Set<Mountain> mountains;

    public MountainRepositoryImpl() {
        this.mountains = new HashSet<>();
    }

    @Override
    public void add(Mountain mountain) {
        mountains.add(mountain);
    }

    @Override
    public boolean remove(Mountain mountain) {
        return mountains.remove(mountain);
    }

    @Override
    public Mountain byName(String name) {
        for (Mountain mountain : mountains) {
            if (mountain.getName().equals(name)) {
                return mountain;
            }
        }
        return null;
    }

    @Override
    public Collection<Mountain> getCollection() {
        return Collections.unmodifiableSet(mountains);
    }
}
