package easterRaces.interfaces;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseRepository<T> implements Repository<T> {
    protected Map<String, T> entities;

    public BaseRepository() {
        this.entities = new HashMap<>();
    }

    @Override
    public T getByName(String name) {
        return entities.get(name);
    }

    @Override
    public Collection<T> getAll() {
        return entities.values();
    }

    @Override
    public void add(T model) {
        entities.put(getName(model), model);
    }

    @Override
    public boolean remove(T model) {
        return entities.remove(getName(model)) != null;
    }

    protected abstract String getName(T model);
}
