package SoftUniJavaOOP.OOP.Encapsulation.Exercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight){
           setToppingType(toppingType);
           setWeight(weight);
    }

    public void setWeight(double weight) {
        if(weight>50 || weight<1){
            throw new IllegalArgumentException( toppingType+" weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public void setToppingType(String toppingType) {
        if(!toppingType.equals("Meat") && !toppingType.equals("Veggies")
                && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")){
            throw new IllegalArgumentException("Cannot place "+toppingType+" on top of your pizza.");
        }
        this.toppingType = toppingType;
    }
    public double calculateCalories(){
        double calories = 2;
        switch(toppingType){
            case "Meat" : calories = calories*1.2; break;
            case "Veggies" : calories = calories*0.8; break;
            case "Cheese" : calories = calories*1.1; break;
            case "Sauce" : calories = calories*0.9; break;
        }
        return calories*weight;
    }
}
