package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DelicacyRepositoryImpl implements DelicacyRepository<Delicacy> {
    private Map<String, Delicacy> delicacies;

    public DelicacyRepositoryImpl() {
        this.delicacies = new HashMap<>();
    }

    @Override
    public void add(Delicacy model) {
        if (model == null) {
            throw new IllegalArgumentException(ExceptionMessages.FOOD_OR_DRINK_EXIST);
        }
        delicacies.put(model.getName(), model);
    }

    @Override
    public Collection<Delicacy> getAll() {
        return delicacies.values();
    }

    @Override
    public Delicacy getByName(String name) {
        return delicacies.get(name);
    }
}

