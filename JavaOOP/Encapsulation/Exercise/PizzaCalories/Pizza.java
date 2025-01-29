package SoftUniJavaOOP.OOP.Encapsulation.Exercise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, Dough dough, List<Topping> toppings){
        setName(name);
        setDough(dough);
        if(toppings.size()>10 || toppings.isEmpty()){
            throw new IllegalArgumentException(" Number of toppings should be in range [0..10].");
        }else {
            setToppings(toppings);
        }

    }

    private void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    private void setName(String name) {
        if(name.trim().isEmpty() || name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        else { this.name = name; }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping topping){
        toppings.add(topping);
    }
    public double getOverallCalories(){
        double caloriesToppings = 0;
        for(Topping toppingg:toppings){
           caloriesToppings=caloriesToppings+ toppingg.calculateCalories();
        }
        return caloriesToppings+ dough.calculateCalories();
    }
}
