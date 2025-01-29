package SoftUniJavaOOP.ExamPreparationOOP.bakery.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces.Drink;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class DrinkRepositoryImpl implements DrinkRepository<Drink> {
    private Map<String, Drink> drinks;

    public DrinkRepositoryImpl() {
        this.drinks = new LinkedHashMap<>();
    }

    @Override
    public Collection<Drink> getAll() {
        return this.drinks.values();
    }

    @Override
    public void add(Drink drink) {
        this.drinks.put(drink.getName(), drink);
    }


    public Drink getByName(String name) {
        return this.drinks.get(name);
    }

    @Override
    public Drink getByNameAndBrand(String drinkName, String drinkBrand) {
        return this.drinks.get(drinkName + " " + drinkBrand);
    }
}