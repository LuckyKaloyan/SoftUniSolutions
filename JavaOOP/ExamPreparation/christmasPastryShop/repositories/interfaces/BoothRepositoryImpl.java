package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.booths.interfaces.Booth;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BoothRepositoryImpl implements BoothRepository<Booth> {
    private Map<Integer, Booth> booths;

    public BoothRepositoryImpl() {
        this.booths = new HashMap<>();
    }

    @Override
    public void add(Booth model) {
        if (model == null) {
            throw new IllegalArgumentException(ExceptionMessages.BOOTH_EXIST);
        }
        booths.put(model.getBoothNumber(), model);
    }

    @Override
    public Collection<Booth> getAll() {
        return booths.values();
    }

    @Override
    public Booth getByNumber(int boothNumber) {
        return booths.get(boothNumber);
    }
}

