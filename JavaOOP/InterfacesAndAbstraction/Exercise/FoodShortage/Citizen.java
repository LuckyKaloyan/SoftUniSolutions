package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.FoodShortage;

public class Citizen implements Person, Birthable, Identifiable, Buyer {
    private String name;
    private int age;
    private String birthDate;
    private String id;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
       this.name = name;
       this.age = age;
       this.id = id;
       this.birthDate = birthDate;
        food = 0;
    }


    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public int getFood() {
      return food;
    }

    @Override
    public void buyFood() {
        food=food+10;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}



