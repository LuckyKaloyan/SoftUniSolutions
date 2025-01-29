package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces.Cocktail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CocktailRepositoryImpl implements CocktailRepository<Cocktail> {
    private Map<String, Cocktail> cocktails;

    public CocktailRepositoryImpl() {
        this.cocktails = new HashMap<>();
    }

    @Override
    public void add(Cocktail model) {
        if (model == null) {
            throw new IllegalArgumentException(ExceptionMessages.FOOD_OR_DRINK_EXIST);
        }
        cocktails.put(model.getName(), model);
    }

    @Override
    public Collection<Cocktail> getAll() {
        return cocktails.values();
    }

    @Override
    public Cocktail getByName(String name) {
        return cocktails.get(name);
    }
}

