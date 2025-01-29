package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.repositories.interfaces;

public interface DelicacyRepository<T> extends Repository<T> {
    T getByName(String name);
}
