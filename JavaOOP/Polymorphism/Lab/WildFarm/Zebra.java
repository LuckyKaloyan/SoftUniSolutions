package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;

import java.text.DecimalFormat;

public class Zebra extends Mammal{

    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion){
        super(animalType,animalName,animalWeight,livingRegion);
    }

    void makeSound(){
        System.out.println("Zs");
    }
    void eat(Food food){

        if(food instanceof Vegetable){
            this.foodEaten=foodEaten+food.getQuantity();
        } else{
            System.out.println("Zebras are not eating that type of food!");
        }

    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",animalType,animalName,decimalFormat.format(animalWeight),livingRegion,foodEaten);
    }
}
