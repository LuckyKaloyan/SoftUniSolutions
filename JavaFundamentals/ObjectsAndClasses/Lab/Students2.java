package FundamentalsModule.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    String firstname;
    String lastname;
    String age;
    String hometown;
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public Students2(String firstname, String lastname, String age, String hometown){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students2> studentsList = new ArrayList<>();
        while(true){
            String word = scanner.nextLine();
            if(word.equals("end")){
                break;}

            String[] studentData = word.split(" ");
            Students2 student = new Students2(studentData[0], studentData[1], studentData[2], studentData[3]);
            studentsList.add(student);
        }
        String city = scanner.nextLine();
        for(int i=0; i<studentsList.size(); i++){
            for(int j=0; j<studentsList.size(); j++){
                if(studentsList.get(i).getFirstname().equals(studentsList.get(j).getFirstname())
                        && studentsList.get(i).getLastname().equals(studentsList.get(j).getLastname())
                        && j!=i
                ){studentsList.remove(i);}
            }
        }
        for(Students2 student : studentsList){
            if(student.getHometown().equals(city)){
                System.out.printf("%s %s is %s years old", student.getFirstname(), student.getLastname(), student.getAge());
                System.out.println();
            }
        }
    }
}
