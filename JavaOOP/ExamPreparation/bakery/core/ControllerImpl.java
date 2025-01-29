package SoftUniJavaOOP.ExamPreparationOOP.bakery.core;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.core.interfaces.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.bakedFoods.interfaces.BakedFood;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces.Drink;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.tables.interfaces.Table;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.repositories.interfaces.*;

public class ControllerImpl implements Controller {

   public ControllerImpl(FoodRepository<BakedFood> foodRepository, DrinkRepository<Drink> drinkRepository, TableRepository<Table> tableRepository) {

  }


    @Override
    public String addFood(String type, String name, double price) {

        return null;
    }

    @Override
    public String addDrink(String type, String name, int portion, String brand) {

        return null;
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {

        return null;
    }

    @Override
    public String reserveTable(int numberOfPeople) {

        return null;
    }

    @Override
    public String orderFood(int tableNumber, String foodName) {

        return null;
    }

    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {

        return null;

    }

    @Override
    public String leaveTable(int tableNumber) {

        return null;
    }

    @Override
    public String getFreeTablesInfo() {

        return null;
    }

    @Override
    public String getTotalIncome() {
        return null;
    }
}
