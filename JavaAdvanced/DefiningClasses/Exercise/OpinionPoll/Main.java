package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.OpinionPoll;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for(int i=0; i<times; i++){
            String word = scanner.nextLine();
            String[] splitche = word.split(" ");

            Person person = new Person(splitche[0],Integer.parseInt(splitche[1]));
            personList.add(person);
        }

        personList.sort(Comparator.comparing(Person::getName));

        for(int i=0; i<personList.size(); i++){
            if(personList.get(i).getAge()>=30){
                System.out.println(personList.get(i).getName()+" - "+personList.get(i).getAge());
            }
        }




    }
}
