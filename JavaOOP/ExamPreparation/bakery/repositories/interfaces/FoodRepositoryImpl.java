package SoftUniJavaOOP.ExamPreparationOOP.bakery.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.bakedFoods.interfaces.BakedFood;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class FoodRepositoryImpl implements FoodRepository<BakedFood> {
    private Map<String, BakedFood> foods;

    public FoodRepositoryImpl() {
        this.foods = new LinkedHashMap<>();
    }

    @Override
    public Collection<BakedFood> getAll() {
        return this.foods.values();
    }

    @Override
    public void add(BakedFood food) {
        this.foods.put(food.getName(), food);
    }

    @Override
    public BakedFood getByName(String name) {
        return this.foods.get(name);
    }
}