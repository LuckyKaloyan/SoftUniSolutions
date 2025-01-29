package SoftUniJavaOOP.OOP.Encapsulation.Exercise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInput = scanner.nextLine().split(" ");
        if(Integer.parseInt(pizzaInput[2])>10 || Integer.parseInt(pizzaInput[2])<0){
        throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        String[] doughInput = scanner.nextLine().split(" ");
        Dough dough = new Dough(doughInput[1],doughInput[2],Double.parseDouble(doughInput[3]));

        List<Topping> toppings = new ArrayList<>();

        String command = scanner.nextLine();
        while(!command.equals("END")){
            String[] tokens = command.split("\\s+");
            Topping topping1 = new Topping(tokens[1],Double.parseDouble(tokens[2]));
            toppings.add(topping1);
            command= scanner.nextLine();
        }

        Pizza pizza = new Pizza(pizzaInput[1],dough,toppings);
        System.out.println(pizza.getName()+" - "+pizza.getOverallCalories());


    }
}
