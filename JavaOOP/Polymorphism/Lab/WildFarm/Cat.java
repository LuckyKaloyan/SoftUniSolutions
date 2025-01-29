package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String catBreed;
    public Cat(String animalType,String animalName, Double animalWeight, String livingRegion, String catBreed){
        super(animalType,  animalName,  animalWeight, livingRegion);
        this.catBreed = catBreed;
    }
    void makeSound(){
        System.out.println("Meowwww");
    }
    void eat(Food food){
        this.foodEaten=foodEaten+food.getQuantity();

    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",animalType,animalName,catBreed,decimalFormat.format(animalWeight),livingRegion,foodEaten);
    }
}
