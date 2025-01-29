package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.Scanner;
public class Students {

    String name;
    double grade;


    public Students(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Students[] students = new Students[times];
        Students blank;


        for(int i=0; i<times; i++){

            String[] studentarr = scanner.nextLine().split(" ");
            Students student = new Students(studentarr[0]+" "+studentarr[1],Double.parseDouble(studentarr[2]));
            students[i]=student;
        }

        for(int i=0; i<times; i++){
            for(int k=0; k<times; k++){
                for(int j=0; j<times-1; j++){
                    if(students[j].getGrade()<students[j+1].getGrade()){
                        blank = students[j];
                        students[j]=students[j+1];
                        students[j+1]=blank;
                    }
                }
            }
        }

        for(int i=0; i<times; i++){
            System.out.printf("%s: %.2f", students[i].getName(), students[i].getGrade());
            System.out.println();
        }
    }
}
