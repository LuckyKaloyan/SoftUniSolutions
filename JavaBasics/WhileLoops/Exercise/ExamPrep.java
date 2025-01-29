package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stops = Integer.parseInt(scanner.nextLine());
        int timestops = 0;
        double average= 0;
        double totalmarks = 0;
        int marks = 0;
        String lastname = "";
        while(stops>timestops){
            String taskname = scanner.nextLine();
            if(taskname.equals("Enough")){
                System.out.printf("Average score: %02.2f",average);System.out.println();
                System.out.println("Number of problems: "+marks);
                System.out.println("Last problem: "+lastname);break;}
            int mark = Integer.parseInt(scanner.nextLine());
            marks++;
            totalmarks = totalmarks+mark;
            average = totalmarks/marks;
            if(mark<=4){timestops++;}
            if(timestops==stops){
                System.out.printf("You need a break, %d poor grades.", stops);
                break;}
            lastname=taskname;
        }
    }
}
