package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.FoodShortage;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       List<Rebel> rebels = new ArrayList<>();
       List<Citizen> citizens = new ArrayList<>();


        int people = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<people; i++){
            String[] splitted = scanner.nextLine().split(" ");
            if(splitted.length==3){
                Rebel rebel = new Rebel(splitted[0],Integer.parseInt(splitted[1]),splitted[2]);
                rebels.add(rebel);
            }else if(splitted.length==4){
                Citizen citizen = new Citizen(splitted[0],Integer.parseInt(splitted[1]),splitted[2],splitted[3]);
                citizens.add(citizen);
            }
        }


        String name = scanner.nextLine();
        int totalFood = 0;

        while(!name.equals("End")){
             for(Rebel rebel:rebels){
                 if(rebel.getName().equals(name)){
                     rebel.buyFood();
                     totalFood=totalFood+5;
                 }
             }

            for(Citizen citizen:citizens){
                if(citizen.getName().equals(name)){
                    citizen.buyFood();
                    totalFood=totalFood+10;
                }
            }

            name = scanner.nextLine();
        }

        System.out.println(totalFood);



        }
    }
