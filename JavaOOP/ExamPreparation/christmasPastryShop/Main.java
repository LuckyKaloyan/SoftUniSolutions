package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.core.interfaces.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.booths.interfaces.Booth;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces.BoothRepository;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces.CocktailRepository;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces.DelicacyRepository;

public class Main {
    public static void main(String[] args) {

        String a = " ";
        int a1 = a.length();
        DelicacyRepository<Delicacy> delicacyRepository; // TODO: new DelicacyRepositoryImpl<>();
        CocktailRepository<Cocktail> cocktailRepository; // TODO: new CocktailRepositoryImpl<>();
        BoothRepository<Booth> boothRepository; // TODO: new BoothRepositoryImpl<>();

        Controller controller; // TODO: new ControllerImpl(delicacyRepository, cocktailRepository, boothRepository);

        // TODO:OPTIONAL

        //  ConsoleReader reader = new ConsoleReader();
        // ConsoleWriter writer = new ConsoleWriter();
        // EngineImpl engine = new EngineImpl(reader, writer, controller);
        // engine.run();

    }
}
