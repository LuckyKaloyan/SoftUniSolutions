package SoftUniJavaOOP.OOP.Encapsulation.Exercise.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age){
       setAge(age);
       setName(name);
    }

    private void setAge(int age) {

        if(age<0 || age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }else {
            this.age = age;
        }
    }

    private void setName(String name){
        if(null == name || name.isEmpty() || name.isBlank()){ throw new IllegalArgumentException("Name cannot be empty.");}
        else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    private double calculateProductPerDay(){
        if(getAge()<6){
            return 2;
        }else if(getAge()<12){
            return 1;
        }else{
            return 0.75;
        }
    }
    public double productPerDay(){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name,age,productPerDay());
    }
}
