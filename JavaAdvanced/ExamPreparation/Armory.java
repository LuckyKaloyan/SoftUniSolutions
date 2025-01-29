package AdvancedModule.ExamPreparation;
import java.util.Scanner;
public class Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSquares = Integer.parseInt(scanner.nextLine());
        String[][] field = new String[fieldSquares][fieldSquares];

        for(int i=0; i<fieldSquares; i++){
            String line = scanner.nextLine();
            for(int j=0; j<fieldSquares; j++){
                field[i][j]=String.valueOf(line.charAt(j));
            }
        }
        boolean done = false;
        int total = 0;
        while(!done){
            String command = scanner.nextLine();
            int startingRow = Integer.MAX_VALUE;
            int startingCollum =Integer.MAX_VALUE;

            for(int i=0; i<fieldSquares; i++){
                for(int j=0; j<fieldSquares; j++){
                    if(field[i][j].equals("A")){
                        startingRow = i;
                        startingCollum = j;
                    }
                }
            }
            if(command.equals("right")){
                if(startingCollum+1>=fieldSquares){
                    System.out.println("I do not need more swords!");
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("A")){
                                field[i][j]="-";
                            }
                        }
                    }
                    break;
                }
                if(field[startingRow][startingCollum+1].equals("M")){
                    field[startingRow][startingCollum+1]="-";
                    field[startingRow][startingCollum]="-";
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("M")){
                                field[i][j]="A";
                                startingCollum=j;
                                startingRow=i;
                            }
                        }
                    }
                }else if(Character.isDigit(field[startingRow][startingCollum+1].charAt(0))){
                    total = total+Integer.parseInt(field[startingRow][startingCollum+1]);
                    field[startingRow][startingCollum+1]="A";
                    field[startingRow][startingCollum]="-";
                }else{
                    field[startingRow][startingCollum+1]="A";
                    field[startingRow][startingCollum]="-";

                }
            }
            if(command.equals("left")){
                if(startingCollum-1<0){
                    System.out.println("I do not need more swords!");
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("A")){
                                field[i][j]="-";
                            }
                        }
                    }
                    break;
                }
                if(field[startingRow][startingCollum-1].equals("M")){
                    field[startingRow][startingCollum-1]="-";
                    field[startingRow][startingCollum]="-";
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("M")){
                                field[i][j]="A";
                                startingCollum=j;
                                startingRow=i;
                            }
                        }
                    }
                }else if(Character.isDigit(field[startingRow][startingCollum-1].charAt(0))){
                    total = total+Integer.parseInt(field[startingRow][startingCollum-1]);
                    field[startingRow][startingCollum-1]="A";
                    field[startingRow][startingCollum]="-";
                }else{
                    field[startingRow][startingCollum-1]="A";
                    field[startingRow][startingCollum]="-";

                }
            }
            if(command.equals("down")){
                if(startingRow+1>=fieldSquares ){
                    System.out.println("I do not need more swords!");
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("A")){
                                field[i][j]="-";
                            }
                        }
                    }
                    break;
                }
                if(field[startingRow+1][startingCollum].equals("M")){
                    field[startingRow+1][startingCollum]="-";
                    field[startingRow][startingCollum]="-";
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("M")){
                                field[i][j]="A";
                                startingCollum=j;
                                startingRow=i;


                            }
                        }
                    }
                }else if(Character.isDigit(field[startingRow+1][startingCollum].charAt(0))){
                    total = total+Integer.parseInt(field[startingRow+1][startingCollum]);
                    field[startingRow+1][startingCollum]="A";
                    field[startingRow][startingCollum]="-";
                }else{
                    field[startingRow+1][startingCollum]="A";
                    field[startingRow][startingCollum]="-";
                }
            }
            if(command.equals("up")){
                if(startingRow-1<0){
                    System.out.println("I do not need more swords!");
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("A")){
                                field[i][j]="-";
                            }
                        }
                    }
                    break;
                }
                if(field[startingRow-1][startingCollum].equals("M")){
                    field[startingRow-1][startingCollum]="-";
                    field[startingRow][startingCollum]="-";
                    for(int i=0; i<fieldSquares; i++){
                        for(int j=0; j<fieldSquares; j++){
                            if(field[i][j].equals("M")){
                                field[i][j]="A";
                                startingCollum=j;
                                startingRow=i;
                            }
                        }
                    }
                }else if(Character.isDigit(field[startingRow-1][startingCollum].charAt(0))){
                    total = total+Integer.parseInt(field[startingRow-1][startingCollum]);
                    field[startingRow-1][startingCollum]="A";
                    field[startingRow][startingCollum]="-";
                }else{
                    field[startingRow-1][startingCollum]="A";
                    field[startingRow][startingCollum]="-";
                }
            }


            if(total>=65){
                System.out.println("Very nice swords, I will come back for more!");
                done=true;}

        }

        System.out.println("The king paid "+total+" gold coins.");

        for(int i=0; i<fieldSquares; i++){
            for(int j=0; j<fieldSquares; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}