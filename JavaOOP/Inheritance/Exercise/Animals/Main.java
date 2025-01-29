package SoftUniJavaOOP.OOP.Inheritance.Exercise.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
         String inputAnimal = scanner.nextLine();
        while(!inputAnimal.equals("Beast!")){
            String[] splittedProperties = scanner.nextLine().split(" ");
            switch (inputAnimal) {
                case "Cat":
                    Cat cat = new Cat(splittedProperties[0], Integer.parseInt(splittedProperties[1]), splittedProperties[2]);
                    animals.add(cat);
                    break;
                case "Kitten":
                    if (splittedProperties.length == 2) {
                        Kitten kitten = new Kitten(splittedProperties[0], Integer.parseInt(splittedProperties[1]));
                        animals.add(kitten);
                    } else {
                        Kitten kitten = new Kitten(splittedProperties[0], Integer.parseInt(splittedProperties[1]), splittedProperties[2]);
                        animals.add(kitten);
                    }
                    break;
                case "Tomcat":
                    if (splittedProperties.length == 2) {
                        Tomcat tomcat = new Tomcat(splittedProperties[0], Integer.parseInt(splittedProperties[1]));
                        animals.add(tomcat);
                    } else {
                        Tomcat tomcat = new Tomcat(splittedProperties[0], Integer.parseInt(splittedProperties[1]), splittedProperties[2]);
                        animals.add(tomcat);
                    }
                    break;
                case "Dog":
                    Dog dog = new Dog(splittedProperties[0], Integer.parseInt(splittedProperties[1]), splittedProperties[2]);
                    animals.add(dog);
                    break;
                case "Frog":
                    Frog frog = new Frog(splittedProperties[0], Integer.parseInt(splittedProperties[1]), splittedProperties[2]);
                    animals.add(frog);
                    break;
            }
            inputAnimal = scanner.nextLine();
        }

        for(Animal animal:animals){
            System.out.println(  animal.getClass().getSimpleName()+System.lineSeparator()+animal.getName()+" "+animal.getAge()+" "+animal.getGender()+System.lineSeparator()+animal.produceSound());
        }


    }
}
