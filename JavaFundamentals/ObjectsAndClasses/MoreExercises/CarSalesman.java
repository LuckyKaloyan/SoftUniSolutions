package FundamentalsModule.ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CarSalesman {
    public static class Car{
        String model;
        String power;
        String displacement;
        String Efficiency;

        public Car(String model, String power, String displacement, String Efficiency){
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.Efficiency = Efficiency;
        }

        public String getModel() {
            return model;
        }

        public String getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return Efficiency;
        }
    }
    public static class CarOutside{
        String model;
        String engine;
        String weight;
        String color;

        public CarOutside(String model, String engine, String weight, String color){
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public String getEngine() {
            return engine;
        }

        public String getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Car> list = new ArrayList<>();
        List<CarOutside> listtwo = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            String word = scanner.nextLine();
            String[] arr = word.split(" ");
            String[] arrone = new String[4];

            for (int j = 0; j < arr.length; j++) {
                arrone[j] = arr[j];
            }

            if (arr.length == 3) {
                try {
                    int test = Integer.parseInt(arr[2]);
                    arrone[3] = "n/a";
                } catch (Exception e) {
                    arrone[3] = arrone[2];
                    arrone[2] = "n/a";
                }
            } else if (arr.length == 2) {
                arrone[3] = "n/a";
                arrone[2] = "n/a";
            }

            Car car = new Car(arrone[0], arrone[1], arrone[2], arrone[3]);
            list.add(car);
        }

        int timestwo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < timestwo; i++) {
            String wordtwo = scanner.nextLine();
            String[] arrtwo = wordtwo.split(" ");
            String[] arrtwotwo = new String[4];

            for (int h = 0; h < arrtwo.length; h++) {
                arrtwotwo[h] = arrtwo[h];
            }

            if (arrtwo.length == 3) {
                try {
                    int test = Integer.parseInt(arrtwo[2]);
                    arrtwotwo[3] = "n/a";
                } catch (Exception e) {
                    arrtwotwo[3] = arrtwotwo[2];
                    arrtwotwo[2] = "n/a";
                }
            } else if (arrtwo.length == 2) {
                arrtwotwo[3] = "n/a";
                arrtwotwo[2] = "n/a";
            }

            CarOutside caroutside = new CarOutside(arrtwotwo[0], arrtwotwo[1], arrtwotwo[2], arrtwotwo[3]);
            listtwo.add(caroutside);
        }

        for (CarOutside carOutside : listtwo) {
            System.out.println(carOutside.getModel() + ":");
            System.out.println("  " + carOutside.getEngine()+":");
            System.out.println("    Power: " + findPower(list, carOutside.getEngine()));
            System.out.println("    Displacement: " + findDisplacement(list, carOutside.getEngine()));
            System.out.println("    Efficiency: " + findEfficiency(list, carOutside.getEngine()));
            System.out.println("  Weight: " + carOutside.getWeight());
            System.out.println("  Color: " + carOutside.getColor());
        }
    }

    private static String findPower(List<Car> cars, String engine) {
        for (Car car : cars) {
            if (car.getModel().equals(engine)) {
                return car.getPower();
            }
        }
        return "n/a";
    }

    private static String findDisplacement(List<Car> cars, String engine) {
        for (Car car : cars) {
            if (car.getModel().equals(engine)) {
                return car.getDisplacement();
            }
        }
        return "n/a";
    }

    private static String findEfficiency(List<Car> cars, String engine) {
        for (Car car : cars) {
            if (car.getModel().equals(engine)) {
                return car.getEfficiency();
            }
        }
        return "n/a";
    }
}
