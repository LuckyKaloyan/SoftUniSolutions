package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<tabs; i++){
            String site = scanner.nextLine();
            if(site.equals("Facebook")){salary=salary-150;}
            if(site.equals("Instagram")){salary=salary-100;}
            if(site.equals("Reddit")){salary=salary-50;}
            if(salary<=0){
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if(salary>0){
            System.out.println(salary);
        }

    }
}
