package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces;

public interface CocktailRepository<T> extends Repository<T> {
    T getByName(String name);
}
