package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.Ferrari;

public class Ferrari implements Car{
    private String driverName;

    private static final String model = "488-Spider";

    public Ferrari(String driverName){
        this.driverName = driverName;
    }

    public String brakes(){
        return ("Breaks!");
    }
    public String gas(){
        return ("brum-brum-brum-brrrrr");
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",model,brakes(),gas(),getDriverName());
    }
}
