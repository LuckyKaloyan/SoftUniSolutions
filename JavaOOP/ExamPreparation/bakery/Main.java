package SoftUniJavaOOP.ExamPreparationOOP.bakery;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.core.interfaces.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.bakedFoods.interfaces.BakedFood;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces.Drink;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.tables.interfaces.Table;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.repositories.interfaces.*;

public class Main {
    public static void main(String[] args) {

        String a = " ";
        int a1 = a.length();
        FoodRepository<BakedFood> foodRepository; // TODO:  new FoodRepositoryImpl<>();
        DrinkRepository<Drink> drinkRepository;  // TODO:  new DrinkRepositoryImpl<>();
        TableRepository<Table> tableRepository; // TODO:  new TableRepositoryImpl<>();

        Controller controller; // TODO: new ControllerImpl(foodRepository, drinkRepository, tableRepository);

        // TODO:OPTIONAL
//        ConsoleReader reader = new ConsoleReader();
//        ConsoleWriter writer = new ConsoleWriter();
//        EngineImpl engine = new EngineImpl(reader, writer, controller);
//        engine.run();
    }
}
