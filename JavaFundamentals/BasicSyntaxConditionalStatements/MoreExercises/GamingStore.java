package FundamentalsModule.BasicSyntaxConditionalStatements.MoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double input2 = input;
        String word;
        double sum = 0;

        while(input>0){
            word = scanner.nextLine();
            if(word.equals("Game JavaMoreBasics.ForLoopMoreExcercises.Time")){break;}

            switch(word){
                case "OutFall 4" :
                    if(input>=39.99){System.out.println("Bought OutFall 4");
                        sum=sum+39.99;
                        input=input-39.99;}else{System.out.println("Too Expensive");}
                    break;
                case"CS: OG":
                    if(input>=15.99){System.out.println("Bought CS: OG");
                        sum=sum+15.99;
                        input=input-15.99;}else{System.out.println("Too Expensive");}
                    break;
                case"Zplinter Zell":
                    if(input>=19.99){System.out.println("Bought Zplinter Zell");
                        sum=sum+19.99;
                        input=input-15.99;}else{System.out.println("Too Expensive");}
                    break;
                case"Honored 2":
                    if(input>=59.99){System.out.println("Bought Honored 2");
                        sum=sum+59.99;
                        input=input-59.99;}else{System.out.println("Too Expensive");}
                    break;
                case"RoverWatch":
                    if(input>=29.99){System.out.println("Bought RoverWatch");
                        sum=sum+29.99;
                        input=input-29.99;}else{System.out.println("Too Expensive");}
                    break;
                case"RoverWatch Origins Edition":
                    if(input>=39.99){System.out.println("Bought RoverWatch Origins Edition");
                        sum=sum+39.99;
                        input=input-39.99;}else{System.out.println("Bought Too Expensive");}
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }
        }
        if((input2-sum)>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, (input2-sum));}
        else {
            System.out.println("Out of money!");
        }

    }
}
