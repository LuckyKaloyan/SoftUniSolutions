package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<String> dates =new ArrayList<>();

        while(!command.equals("End")){
            String[] tokens = command.split(" ");
            if(tokens[0].equals("Pet")){
                Pet pet = new Pet(tokens[1],tokens[2]);
                dates.add(pet.getBirthDate());
            }if(tokens[0].equals("Citizen")){
                Citizen citizen = new Citizen(tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
                dates.add(citizen.getBirthDate());
            }
            command = scanner.nextLine();
        }
        int year = Integer.parseInt(scanner.nextLine());
        for(String birthday:dates){
            if(birthday.endsWith("/"+year)){
                System.out.println(birthday);
            }

        }
    }
}