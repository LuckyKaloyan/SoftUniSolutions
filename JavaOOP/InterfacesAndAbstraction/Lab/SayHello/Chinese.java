package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.SayHello;

public class Chinese implements Person {

    private String name;

    public Chinese(String name){
        this.name = name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

    @Override
    public String getName() {
        return name;
    }
}
