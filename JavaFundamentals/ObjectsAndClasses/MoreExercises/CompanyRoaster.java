package FundamentalsModule.ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class CompanyRoaster {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;
    public CompanyRoaster(String name, double salary, String position, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        List<CompanyRoaster> list = new ArrayList<>();
        int trytest = 1;
        String HighestAverageSalary = "";
        double highest = 0.0;
        double currentaverage = 0.0;
        int count = 0;

        int times = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<times; i++){
            word = scanner.nextLine();
            String[]wordarr = word.split(" ");

            if(wordarr.length>=4){
                try{
                    String firststring = wordarr[0];
                    double seconddouble = Double.parseDouble(wordarr[1]);
                    String thirdstring = wordarr[2];
                    String fourthstring = wordarr[3];}catch(Exception e){
                    continue;
                }

            }


            String[]wordarrr = new String[6];
            System.arraycopy(wordarr, 0, wordarrr, 0, wordarr.length);

            if(wordarr.length==5) {
                if(wordarr[4].contains("@")){wordarrr[5]="-1";}else{wordarrr[5]=wordarr[4]; wordarrr[4]="n/a";}
            }
            if(wordarr.length==4){
                wordarrr[4]="n/a";
                wordarrr[5]="-1";
            }

            try{trytest = Integer.parseInt(wordarrr[5])+1;}catch(Exception oo){wordarrr[5]="-1";}



            try{CompanyRoaster person = new CompanyRoaster(wordarrr[0],Double.parseDouble(wordarrr[1]),wordarrr[2],wordarrr[3],wordarrr[4],Integer.parseInt(wordarrr[5]));
                list.add(person);}catch(Exception ignored){}
        }

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){

                if(list.get(i).getDepartment().equals(list.get(j).getDepartment())){
                    currentaverage = currentaverage+ list.get(j).getSalary();
                    count++;

                }

                if(j==list.size()-1){
                    currentaverage=currentaverage/count;
                    if(currentaverage>highest){highest=currentaverage;
                        HighestAverageSalary=list.get(i).getDepartment();}

                    count=0;
                    currentaverage=0;
                }
            }
        }

        System.out.println("Highest Average Salary: "+HighestAverageSalary);

        for(int i=0; i<list.size()-1; i++){
            for(int j=0; j<list.size()-1; j++){
                for(int h=0; h<list.size()-1; h++){

                    if(list.get(i).getSalary()>list.get(i+1).getSalary()){
                        list.add(list.get(i));
                        list.remove(i);

                    }
                }
            }
        }

        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i).getDepartment().equals(HighestAverageSalary)){
                try{
                    System.out.printf("%s %.2f %s %d", list.get(i).getName(), list.get(i).getSalary(), list.get(i).getEmail(), list.get(i).getAge());
                    System.out.println();
                }catch(Exception o){System.out.printf("%s %.2f %s -1", list.get(i).getName(), list.get(i).getSalary(), list.get(i).getEmail());
                    System.out.println();}

            }
        }
    }
}
