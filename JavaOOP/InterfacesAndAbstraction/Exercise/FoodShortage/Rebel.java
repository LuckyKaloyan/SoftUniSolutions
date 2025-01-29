package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.FoodShortage;

public class Rebel implements Person, Buyer {

    String name;
    int age;
    String group;
    int food;

    public Rebel(String name, int age, String group){
        this.name = name;
        this.age = age;
        this.group = group;
        food = 0;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public void buyFood() {
        food=food+5;
    }
}
