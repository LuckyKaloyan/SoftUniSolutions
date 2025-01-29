package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Generate")){
            String[] splitted = command.split(">>>");
            if(splitted[0].equals("Contains")){
                if(input.contains(splitted[1])){
                    System.out.println(input + " contains "+splitted[1]);
                }else{
                    System.out.println("Substring not found!");
                }
            }
            if(splitted[0].equals("Flip")){
                if(splitted[1].equals("Upper")){
                    input = input.substring(0,Integer.parseInt(splitted[2]))+ input.substring(Integer.parseInt(splitted[2]),Integer.parseInt(splitted[3])).toUpperCase()+input.substring(Integer.parseInt(splitted[3]));
                    System.out.println(input);
                }else{
                    input = input.substring(0,Integer.parseInt(splitted[2]))+   input.substring(Integer.parseInt(splitted[2]),Integer.parseInt(splitted[3])).toLowerCase()+input.substring(Integer.parseInt(splitted[3]));
                    System.out.println(input);
                }
            }
            if(splitted[0].equals("Slice")){
                input = input.substring(0,Integer.parseInt(splitted[1]))+input.substring(Integer.parseInt(splitted[2]));
                System.out.println(input);
            }
            command= scanner.nextLine();
            if(command.equals("Generate")){
                System.out.println("Your activation key is: "+input);
                break;
            }
        }
    }
}
