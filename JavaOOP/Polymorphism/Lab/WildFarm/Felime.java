package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;

public class Felime extends Animal{

    protected String livingRegion;
    public Felime(String animalType, String animalName, Double animalWeight, String livingRegion){
        super(animalType,animalName,animalWeight);
        this.livingRegion = livingRegion;
    }


}
