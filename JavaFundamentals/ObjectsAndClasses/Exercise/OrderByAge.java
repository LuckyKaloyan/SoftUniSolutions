package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OrderByAge {
    String name;
    String id;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public OrderByAge(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OrderByAge> list = new ArrayList<>();
        String word = "";
        OrderByAge blank;
        while(!word.equals("End")){

            word = scanner.nextLine();
            String[]wordsplit = word.split(" ");
            if(word.equals("End")){break;}
            OrderByAge newperson = new OrderByAge(wordsplit[0],wordsplit[1],Integer.parseInt(wordsplit[2]));
            list.add(newperson);
        }
        for(int i=0; i<list.size()-1; i++){
            for(int j=0; j<list.size()-1; j++){
                for(int h=0; h<list.size()-1; h++){
                    if(list.get(h).getAge()>list.get(h+1).getAge()){
                        blank = list.get(h);

                        list.set(h,list.get(h+1));
                        list.set(h+1,blank);
                    }
                }
            }
        }


        for(int i=0; i<list.size(); i++){
            System.out.printf("%s with ID: %s is %d years old.", list.get(i).getName(),list.get(i).getId(),list.get(i).getAge());
            System.out.println();
        }









    }
}
