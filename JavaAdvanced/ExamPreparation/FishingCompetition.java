package AdvancedModule.ExamPreparation;
import java.util.Scanner;
public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] field = new String[size][size];

        for(int i=0; i<size; i++){
            field[i]=scanner.nextLine().split("");
        }
        boolean sank = false;
        String sankCoordinates = "";
        int total =0;
        String command = "";
        while(!command.equals("collect the nets") || sank){
            command = scanner.nextLine();
            int currentRow = 0;
            int currentColumn = 0;
            int newRow;
            int newColumn;
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(field[i][j].equals("S")){
                        currentRow=i;
                        currentColumn=j;
                    }
                }
            }
            if(command.equals("down")){
                newRow = currentRow+1;
                newColumn = currentColumn;
                if(newRow==size){
                    newRow=0;
                }
                if(Character.isDigit(field[newRow][newColumn].charAt(0))){
                    total = total+Integer.parseInt(field[newRow][newColumn]);
                    field[currentRow][currentColumn]="-";
                    field[newRow][newColumn]="S";
                }else if(field[newRow][newColumn].equals("-")){
                    field[newRow][newColumn]="S";
                    field[currentRow][currentColumn]="-";
                }else if(field[newRow][newColumn].equals("W")){
                    sankCoordinates = "["+newRow+","+newColumn+"]";
                    sank = true;
                    break;
                }
            }
            if(command.equals("up")){
                newRow = currentRow-1;
                newColumn = currentColumn;
                if(newRow<0){
                    newRow=size-1;
                }
                if(Character.isDigit(field[newRow][newColumn].charAt(0))){
                    total = total+Integer.parseInt(field[newRow][newColumn]);
                    field[currentRow][currentColumn]="-";
                    field[newRow][newColumn]="S";
                }else if(field[newRow][newColumn].equals("-")){
                    field[newRow][newColumn]="S";
                    field[currentRow][currentColumn]="-";
                }else if(field[newRow][newColumn].equals("W")){
                    sankCoordinates = "["+newRow+","+newColumn+"]";
                    sank = true;
                    break;
                }
            }
            if(command.equals("left")){
                newRow = currentRow;
                newColumn = currentColumn-1;
                if(newColumn<0){
                    newColumn=size-1;
                }
                if(Character.isDigit(field[newRow][newColumn].charAt(0))){
                    total = total+Integer.parseInt(field[newRow][newColumn]);
                    field[currentRow][currentColumn]="-";
                    field[newRow][newColumn]="S";
                }else if(field[newRow][newColumn].equals("-")){
                    field[newRow][newColumn]="S";
                    field[currentRow][currentColumn]="-";
                }else if(field[newRow][newColumn].equals("W")){
                    sankCoordinates = "["+newRow+","+newColumn+"]";
                    sank = true;
                    break;
                }
            }
            if(command.equals("right")){
                newRow = currentRow;
                newColumn = currentColumn+1;
                if(newColumn==size){
                    newColumn=0;
                }
                if(Character.isDigit(field[newRow][newColumn].charAt(0))){
                    total = total+Integer.parseInt(field[newRow][newColumn]);
                    field[currentRow][currentColumn]="-";
                    field[newRow][newColumn]="S";
                }else if(field[newRow][newColumn].equals("-")){
                    field[newRow][newColumn]="S";
                    field[currentRow][currentColumn]="-";
                }else if(field[newRow][newColumn].equals("W")){
                    sankCoordinates = "["+newRow+","+newColumn+"]";
                    sank = true;
                    break;
                }
            }
        }
        if(sank){
            System.out.println("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: "+sankCoordinates);
        }else{
            if(total>=20){
                System.out.println("Success! You managed to reach the quota!");
            }else{
                System.out.print("You didn't catch enough fish and didn't reach the quota! ");
                System.out.println("You need "+(20-total)+" tons of fish more.");
            }
            if(total>0){
                System.out.println("Amount of fish caught: "+total+" tons.");
            }
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
        }

        




    }
}
