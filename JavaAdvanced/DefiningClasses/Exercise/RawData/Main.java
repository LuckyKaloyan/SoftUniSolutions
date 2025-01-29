package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.RawData;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        List<Cars> cars = new ArrayList<>();

        for(int i=0; i<numbers; i++){

            String word = scanner.nextLine();
            String[] splitche = word.split(" ");
            Cars car = new Cars(splitche[0],Integer.parseInt(splitche[1]),Integer.parseInt(splitche[2]),Integer.parseInt(splitche[3]),
                    splitche[4],Double.parseDouble(splitche[5]),Double.parseDouble(splitche[6]),Double.parseDouble(splitche[7]),Double.parseDouble(splitche[8]),
                    Double.parseDouble(splitche[9]),Double.parseDouble(splitche[10]),Double.parseDouble(splitche[11]),Double.parseDouble(splitche[12]));

            cars.add(car);

        }

        String command = scanner.nextLine();

        for(int i=0; i<cars.size(); i++){

            if(command.equals("fragile")){
                if(cars.get(i).tires.getTireFourPressure()<1 ||cars.get(i).tires.getTireOnePressure()<1 ||
                        cars.get(i).tires.getTireTwoPressure()<1 || cars.get(i).tires.getTireThreePressure()<1){
                    System.out.println(cars.get(i).getModel());
                }
            }else{
                if(cars.get(i).engine.enginePower>250){
                    System.out.println(cars.get(i).getModel());
                }

            }

        }








    }
}
