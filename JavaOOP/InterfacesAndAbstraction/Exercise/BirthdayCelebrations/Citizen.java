package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.BirthdayCelebrations;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate) {
       this.name = name;
       this.age = age;
       this.id = id;
       this.birthDate = birthDate;
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



