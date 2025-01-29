package SoftUniJavaOOP.OOP.Inheritance.Exercise.Animals;

public abstract class  Animal {
    private String name;
    private String gender;
    private int age;

    public Animal(){}
    public Animal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String produceSound(){
        return "Sound";
    }
}
