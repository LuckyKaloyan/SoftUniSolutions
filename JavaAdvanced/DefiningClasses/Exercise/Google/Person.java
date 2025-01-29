package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.Google;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println("Company:");
        if (company != null)
            System.out.printf("%s %s %.2f%n", company.getName(), company.getDepartment(), company.getSalary());
        System.out.println("Car:");
        if (car != null)
            System.out.printf("%s %d%n", car.getModel(), car.getSpeed());
        System.out.println("Pokemon:");
        for (Pokemon pokemon : pokemons)
            System.out.printf("%s %s%n", pokemon.getName(), pokemon.getType());
        System.out.println("Parents:");
        for (Parent parent : parents)
            System.out.printf("%s %s%n", parent.getName(), parent.getBirthday());
        System.out.println("Children:");
        for (Child child : children)
            System.out.printf("%s %s%n", child.getName(), child.getBirthday());
    }
}
