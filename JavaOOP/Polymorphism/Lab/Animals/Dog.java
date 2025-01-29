package SoftUniJavaOOP.OOP.Polymorphism.Lab.Animals;

public class Dog extends Animal{

    public Dog(String name, String food){
        super(name, food);
    }
    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s DJAAF",getName(),getFavouriteFood());
    }
}
