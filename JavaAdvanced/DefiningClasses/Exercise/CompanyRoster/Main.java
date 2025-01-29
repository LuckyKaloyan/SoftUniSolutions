package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.CompanyRoster;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Employee>> workers = new TreeMap<>();

        for (int i = 0; i < times; i++) {
            String word = scanner.nextLine();


            String[] splitche = word.split(" ");

            if (splitche.length == 6) {
                Employee worker = new Employee(splitche[0], Double.parseDouble(splitche[1]), splitche[2], splitche[3], splitche[4], Integer.parseInt(splitche[5]));
                creatingAworker(workers, splitche, worker);
            }else
            if (splitche.length == 4) {
                Employee worker = new Employee(splitche[0], Double.parseDouble(splitche[1]), splitche[2], splitche[3]);
                creatingAworker(workers, splitche, worker);
            }else
            if (splitche.length == 5 && splitche[4].contains("@")) {
                Employee worker = new Employee(splitche[0], Double.parseDouble(splitche[1]), splitche[2], splitche[3], splitche[4]);
                creatingAworker(workers, splitche, worker);
            } else {
                Employee worker = new Employee(splitche[0], Double.parseDouble(splitche[1]), splitche[2], splitche[3], Integer.parseInt(splitche[4]));
                creatingAworker(workers, splitche, worker);
            }

        }

        String bestdepartment = "";
        double bestaverageSalary = 0;


        for (Map.Entry<String, List<Employee>> entry : workers.entrySet()) {
            double averageSalary = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                averageSalary = averageSalary + entry.getValue().get(i).getSalary();
            }
            averageSalary = averageSalary / entry.getValue().size();
            if (averageSalary > bestaverageSalary) {
                bestaverageSalary = averageSalary;
                bestdepartment = entry.getKey();
            }
        }




        System.out.println("Highest Average Salary: "+bestdepartment);
        List<Employee> bestpaiddepartmentlist = new ArrayList<>();

        for(Map.Entry<String,List<Employee>> entry: workers.entrySet()){
            if(entry.getKey().equals(bestdepartment)){
                for(int i=0; i<entry.getValue().size(); i++){
                  bestpaiddepartmentlist.add(entry.getValue().get(i));
                }
            }
        }

        bestpaiddepartmentlist.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        for(Employee pachanga:bestpaiddepartmentlist){
            System.out.printf("%s %.2f %s %d%n",pachanga.getName(),pachanga.getSalary(),pachanga.getEmail(),pachanga.getAge());
        }


    }



    private static void creatingAworker(TreeMap<String, List<Employee>> workers, String[] splitche, Employee worker) {
        if(workers.containsKey(splitche[3])){
            workers.get(splitche[3]).add(worker);

        }else{
            List<Employee> listche = new ArrayList<>();
            listche.add(worker);
            workers.put(splitche[3],listche);
        }
    }
}
