package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.RawData;

public class Cars {

    String model;
    Engine engine;
    Cargo cargo;
    Tires tires;

    public String getModel() {
        return model;
    }

    public Cars(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType,
                double tireOnePressure, double tireOneAge, double tireTwoPressure, double tireTwoAge,
                double tireThreePressure, double tireThreeAge, double tireFourPressure, double tireFourAge){
        this.model = model;
        this.engine = new Engine(engineSpeed,enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new Tires(tireOnePressure, tireOneAge, tireTwoPressure, tireTwoAge, tireThreePressure,tireThreeAge, tireFourPressure, tireFourAge);

    }

}
class Engine {
    int engineSpeed;
    int enginePower;

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Engine(int engineSpeed, int enginePower){

        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;

    }
}

class Cargo{
    int cargoWeight;
    String cargoType;

    public Cargo(int cargoWeight, String cargoType){
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

}
class Tires{
    double tireOnePressure;
    double tireOneAge;
    double tireTwoPressure;

    public double getTireOnePressure() {
        return tireOnePressure;
    }

    public double getTireTwoPressure() {
        return tireTwoPressure;
    }

    public double getTireThreePressure() {
        return tireThreePressure;
    }

    public double getTireFourPressure() {
        return tireFourPressure;
    }

    double tireTwoAge;
    double tireThreePressure;
    double tireThreeAge;
    double tireFourPressure;
    double tireFourAge;

    public Tires(double tireOnePressure, double tireOneAge, double tireTwoPressure, double tireTwoAge,
                 double tireThreePressure, double tireThreeAge, double tireFourPressure, double tireFourAge ){
        this.tireOnePressure = tireOnePressure;
        this.tireOneAge = tireOneAge;
        this.tireTwoPressure = tireTwoPressure;
        this.tireTwoAge = tireTwoAge;
        this.tireThreePressure = tireThreePressure;
        this.tireThreeAge = tireThreeAge;
        this.tireFourPressure = tireFourPressure;
        this.tireFourAge = tireFourAge;
    }


}
