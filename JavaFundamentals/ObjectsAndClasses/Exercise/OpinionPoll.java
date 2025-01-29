package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class OpinionPoll {
    String name;
    int age;

    public OpinionPoll(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        OpinionPoll[] people = new OpinionPoll[times];

        for(int i=0; i<times; i++){
            OpinionPoll person  = new OpinionPoll(scanner.next(), scanner.nextInt());
            people[i]=person;
        }
        for(int i=0; i<times; i++){
            if(people[i].getAge()>30){
                System.out.println(people[i].getName()+" - "+people[i].getAge());
            }
        }





    }
}
