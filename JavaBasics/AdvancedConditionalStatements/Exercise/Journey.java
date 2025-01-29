package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination= "";
        String place = "";

        double ratio = 1;

        if(budget<=100){
            destination="Bulgaria";
            if(season.equals("summer")){ratio=0.3;
                place="Camp";
            }else if(season.equals("winter")){ratio=0.7;
                place="Hotel";}
        }
        if(budget>100 && budget<=1000){
            destination="Balkans";
            if(season.equals("summer")){ratio=0.4;
                place="Camp";
            }else if(season.equals("winter")){ratio=0.8;
                place="Hotel";}
        }
        if(budget>1000){
            destination="Europe";
            if(season.equals("summer")){ratio=0.9;
                place="Hotel";
            }else if(season.equals("winter")){ratio=0.9;
                place="Hotel";}
        }

        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", place, budget*ratio);




    }
}
