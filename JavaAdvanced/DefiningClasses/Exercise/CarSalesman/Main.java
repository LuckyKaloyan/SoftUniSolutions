package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.CarSalesman;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enginesN = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();

        for(int i=0; i<enginesN; i++){
            String[] splitche = scanner.nextLine().split(" ");

            Engine engine;

            if(splitche.length==2){
                 engine = new Engine(splitche[0],Integer.parseInt(splitche[1]));
            }else if(splitche.length==4){
                engine = new Engine(splitche[0],Integer.parseInt(splitche[1]),Integer.parseInt(splitche[2]),splitche[3]);
            }else {
                if(Character.isDigit((splitche[2]).charAt(0))){
                    engine = new Engine(splitche[0],Integer.parseInt(splitche[1]),Integer.parseInt(splitche[2]));
                }else{
                    engine = new Engine(splitche[0],Integer.parseInt(splitche[1]),splitche[2]);
                }
            }
            engines.add(engine);

        }

        Map<String,Engine> mapche = new HashMap<>();

        for(int i=0; i<engines.size(); i++){
            mapche.put(engines.get(i).getModel(), engines.get(i));
        }

        int carsN = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for(int i=0; i<carsN; i++){
            String[]splitche = scanner.nextLine().split(" ");
            Car car;
            Engine engine = mapche.get(splitche[1]);

            if(splitche.length==2){
                car = new Car(splitche[0],engine);
            }else if(splitche.length==4){
                car = new Car(splitche[0],engine,Integer.parseInt(splitche[2]),splitche[3]);
            }else{
                if(Character.isDigit((splitche[2]).charAt(0))){
                    car = new Car(splitche[0],engine,Integer.parseInt(splitche[2]));
                }else{
                    car = new Car(splitche[0],engine,splitche[2]);
                }
            }
            cars.add(car);
        }

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i).getModel()+":");
            System.out.println(cars.get(i).getEngine().getModel()+":");
            System.out.println("Power: "+cars.get(i).getEngine().getPower());

            if(cars.get(i).getEngine().getDisplacement()==Integer.MIN_VALUE){
                System.out.println("Displacement: n/a");
            }else{
                System.out.println("Displacement: "+cars.get(i).getEngine().getDisplacement());
            }

            System.out.println("Efficiency: "+ cars.get(i).getEngine().getEfficiency());
            if(cars.get(i).getWeight()==Integer.MIN_VALUE){
                System.out.println("Weight: n/a");
            }else{
                System.out.println("Weight: "+cars.get(i).getWeight());
            }

            System.out.println("Color: "+cars.get(i).getColor());

        }




    }
}
