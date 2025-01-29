package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if(input==1){
            System.out.println("*");
        }else if(input==2){
            System.out.println("**");
        }else {

            if(input%2==1){
                for(int i = 0; i<input; i++){

                    for(int k=0; k<input; k++){
                        if(i==0){if(k==input/2){
                            System.out.print("*");
                        }else{
                            System.out.print("-");
                        }}else if(i<input/2+1){if(k==input/2-i || k==input/2+i){
                            System.out.print("*");
                        }else System.out.print("-");}

                        if(i>input/2){
                            if(i>=input/2+1){if(k==abs(i-input/2) || k==input-abs(i-input/2)-1){
                                System.out.print("*");
                            }else System.out.print("-");}
                        }}
                    System.out.println();
                }
            }else{
                for(int i = 0; i<input-1; i++){

                    for(int k=0; k<input; k++){
                        if(i==0){if(k==input/2 || k==input/2-1){
                            System.out.print("*");
                        }else{
                            System.out.print("-");
                        }}else if(i<input/2){if(k==input/2-1-i || k==input/2+i){
                            System.out.print("*");
                        }else System.out.print("-");}

                        if(i>input/2-1){
                            if(i>=input/2){
                                if(k==abs(i+1-input/2) || k==input-abs(i+1-input/2)-1){
                                    System.out.print("*");
                                }else System.out.print("-");
                            }
                        }
                    }
                    System.out.println();
                }
            }

        }



    }
}
