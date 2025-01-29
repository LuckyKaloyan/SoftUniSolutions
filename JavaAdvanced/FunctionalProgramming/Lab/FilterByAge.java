package AdvancedModule.FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();
        List<Integer> age = new ArrayList<>();

        for(int i=0; i<input; i++){
            String kiufte = scanner.nextLine();
            String[]splitted = kiufte.split(", ");
            names.add(splitted[0]);
            age.add(Integer.parseInt(splitted[1]));
        }


        String command = scanner.nextLine();
        int median = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();


        for(int i=0; i<age.size(); i++){
            if(type.equals("name")){
                if(command.equals("older")){
                    if(age.get(i)>=median){
                        System.out.println(names.get(i));
                    }
                }else if(command.equals("younger")){
                    if(age.get(i)<=median){
                        System.out.println(names.get(i));
                    }
                }
            }else if(type.equals("age")){
                if(command.equals("older")){
                    if(age.get(i)>=median){
                        System.out.println(age.get(i));
                    }
                }else if(command.equals("younger")){
                    if(age.get(i)<=median){
                        System.out.println(age.get(i));
                    }
                }
            }else if(type.equals("name age")){
                if(command.equals("older")){
                    if(age.get(i)>=median){
                        System.out.println(names.get(i)+" - "+age.get(i));
                    }
                }else if(command.equals("younger")){
                    if(age.get(i)<=median){
                        System.out.println(names.get(i)+" - "+age.get(i));
                    }
                }
            }
        }
    }
}