package FundamentalsModule.ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RawData {
    String model;
    int EngineSpeed;
    int EnginePower;
    int CargoWeight;
    String CargoType;
    double tire1pressure;
    double tire1age;
    double tire2pressure;
    double tire2age;
    double tire3pressure;
    double tire3age;
    double tire4pressure;
    double tire4age;


    public RawData(String model, int EngineSpeed, int EnginePower, int CargoWeight, String CargoType, double tire1pressure, double tire1age,
                   double tire2pressure, double tire2age, double tire3pressure, double tire3age, double tire4age, double tire4pressure){

        this.model = model;
        this.EngineSpeed = EngineSpeed;
        this.EnginePower = EnginePower;
        this.CargoWeight = CargoWeight;
        this.CargoType = CargoType;
        this.tire1pressure = tire1pressure;
        this.tire1age = tire1age;
        this.tire2pressure = tire2pressure;
        this.tire2age = tire2age;
        this.tire3pressure = tire3pressure;
        this.tire3age = tire3age;
        this.tire4pressure = tire4pressure;
        this.tire4age = tire4age;
    }

    public String getModel() {
        return model;
    }



    public int getEnginePower() {
        return EnginePower;
    }



    public String getCargoType() {
        return CargoType;
    }

    public double getTire1pressure() {
        return tire1pressure;
    }



    public double getTire2pressure() {
        return tire2pressure;
    }



    public double getTire3pressure() {
        return tire3pressure;
    }



    public double getTire4pressure() {
        return tire4pressure;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = parseInt(scanner.nextLine());
        List<RawData> list = new ArrayList<>();

        for(int i=0; i<times; i++){


            String word = scanner.nextLine();
            String[] arr = word.split(" ");
            RawData car = new RawData (arr[0], Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4],
                    Double.parseDouble(arr[5]),Double.parseDouble(arr[6]), Double.parseDouble(arr[7]),
                    Double.parseDouble(arr[8]), Double.parseDouble(arr[9]), Double.parseDouble(arr[10]),
                    Double.parseDouble(arr[11]), Double.parseDouble(arr[12]));

            list.add(car);
        }

        String command = scanner.nextLine();
        if(command.equals("fragile")){
            for(int i=0; i<times; i++){
                if(
                        (list.get(i).getTire1pressure()<1 || list.get(i).getTire2pressure()<1
                                || list.get(i).getTire3pressure()<1 || list.get(i).getTire4pressure()<1

                        ) && list.get(i).getCargoType().equals("fragile") ){
                    System.out.println(list.get(i).getModel());

                }
            }
        }
        if(command.equals("flamable")){
            for(int i=0; i<times; i++){
                if(list.get(i).getEnginePower()>250 && list.get(i).getCargoType().equals("flamable")){
                    System.out.println(list.get(i).getModel());
                }
            }
        }



    }
}
