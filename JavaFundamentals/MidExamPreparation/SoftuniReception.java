package FundamentalsModule.MidExamPreparation;

import java.util.Scanner;
public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int total = first + second + third;
        int students = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int workinghours = 0;
        while (students > 0) {
            students = students - total;
            count++;
            workinghours++;
            if(students<=0){break;}
            if(count%3==0){
                workinghours++;
            }
        }

        System.out.printf("Time needed: %dh.", workinghours);

    }}
