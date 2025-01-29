package SoftUniJavaOOP.OOP.Polymorphism.Lab.WildFarm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] animalInput = scanner.nextLine().split(" ");
        String[] foodInput = scanner.nextLine().split(" ");
        List<Animal> animals = new ArrayList<>();

        while(!animalInput[0].equals("End")){
            if(animalInput.length==5){
                Cat cat = new Cat(animalInput[0],animalInput[1],Double.parseDouble(animalInput[2]),animalInput[3],animalInput[4]);
                if(foodInput[0].equals("Vegetable")){
                    Food vegetable = new Vegetable(Integer.parseInt(foodInput[1]));
                    cat.makeSound();
                    cat.eat(vegetable);
                    System.out.println(cat);
                }else{
                    Food meat = new Meat(Integer.parseInt(foodInput[1]));
                    cat.makeSound();
                    cat.eat(meat);
                    System.out.println(cat);
                    animals.add(cat);
                }
            } else if(animalInput[0].equals("Tiger")){
                Tiger tiger = new Tiger(animalInput[0],animalInput[1],Double.parseDouble(animalInput[2]),animalInput[3]);
                if(foodInput[0].equals("Vegetable")){
                    Food vegetable = new Vegetable(Integer.parseInt(foodInput[1]));
                    tiger.makeSound();
                    tiger.eat(vegetable);
                    System.out.println(tiger);
                }else{
                    Food meat = new Meat(Integer.parseInt(foodInput[1]));
                    tiger.makeSound();
                    tiger.eat(meat);
                    System.out.println(tiger);
                    animals.add(tiger);
                }
            }else if(animalInput[0].equals("Mouse")){
                Mouse mouse = new Mouse(animalInput[0],animalInput[1],Double.parseDouble(animalInput[2]),animalInput[3]);
                if(foodInput[0].equals("Vegetable")){
                    Food vegetable = new Vegetable(Integer.parseInt(foodInput[1]));
                    mouse.makeSound();
                    mouse.eat(vegetable);
                    System.out.println(mouse);
                }else{
                    Food meat = new Meat(Integer.parseInt(foodInput[1]));
                    mouse.makeSound();
                   mouse.eat(meat);
                    System.out.println(mouse);
                    animals.add(mouse);
                }
            }else if(animalInput[0].equals("Zebra")){
                Zebra zebra = new Zebra(animalInput[0],animalInput[1],Double.parseDouble(animalInput[2]),animalInput[3]);
                if(foodInput[0].equals("Vegetable")){
                    Food vegetable = new Vegetable(Integer.parseInt(foodInput[1]));
                    zebra.makeSound();
                    zebra.eat(vegetable);
                    System.out.println(zebra);
                }else{
                    Food meat = new Meat(Integer.parseInt(foodInput[1]));
                    zebra.makeSound();
                   zebra.eat(meat);
                    System.out.println(zebra);
                    animals.add(zebra);
                }
            }
            animalInput = scanner.nextLine().split(" ");
            if(animalInput[0].equals("End")){
                scanner.close();
                break;
            }
            foodInput = scanner.nextLine().split(" ");

        }

    }
}

