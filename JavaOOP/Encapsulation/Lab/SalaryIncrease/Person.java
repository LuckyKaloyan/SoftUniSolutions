package SoftUniJavaOOP.OOP.Encapsulation.Lab.SalaryIncrease;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;


    public Person(String firstname, String lastname, int age, double salary){

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %.2f leva",firstname,lastname,salary);
    }
    public void increaseSalary(double percentage) {
        if (this.getAge() >= 30) {
            salary = salary * (1 + (percentage / 100));
        } else {
            salary = salary * (1 + (percentage / 200));
        }
    }

}