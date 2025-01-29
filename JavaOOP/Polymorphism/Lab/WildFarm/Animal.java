package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalType,String animalName, Double animalWeight){
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    void makeSound(){}
    void eat(Food food){}
}
