package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ids  = new ArrayList<>();

        String command =scanner.nextLine();
        while(!command.equals("End")){

            String[] tokens = command.split(" ");
            if(tokens.length==3){
                Citizen citizen = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
                ids.add(citizen.getId());
            }else{
                Robot robot = new Robot(tokens[0],tokens[1]);
                ids.add(robot.getId());
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        for(String id: ids){
            if(id.endsWith(command)){
                System.out.println(id);
            }
        }
    }
}
