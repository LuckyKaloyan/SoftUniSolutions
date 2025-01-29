package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

public class Car {
    String model;
    Engine engine;
    int weight = Integer.MIN_VALUE;
    String color = "n/a";

    public Car(String model,Engine engine,int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }
    public Car(String model, Engine engine, int weight){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }
    public Car(String model, Engine engine, String color){
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }







}
