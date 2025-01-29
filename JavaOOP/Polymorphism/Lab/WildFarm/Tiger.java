package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;

import java.text.DecimalFormat;

public class Tiger extends Felime{
    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion){
        super(animalType,animalName,animalWeight,livingRegion);
    }
    void makeSound(){
        System.out.println("ROAAR!!!");
    }
    void eat(Food food){
        if(food instanceof Meat) {
            this.foodEaten = foodEaten + food.getQuantity();
        }else{
            System.out.println("Tigers are not eating that type of food!");
        }
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",animalType,animalName,decimalFormat.format(animalWeight),livingRegion,foodEaten);
    }

}
