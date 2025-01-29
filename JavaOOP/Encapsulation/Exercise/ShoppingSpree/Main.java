package SoftUniJavaOOP.OOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleInput = Arrays.stream(scanner.nextLine().split(";")).collect(Collectors.toList());
        List<String> productInput = Arrays.stream(scanner.nextLine().split(";")).collect(Collectors.toList());
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        for(String s:peopleInput){
            String[]ss = s.split("=");
            Person person = new Person(ss[0],Double.parseDouble(ss[1]));
            people.add(person);
        }
        for(String s:productInput){
            String[]ss = s.split("=");
            Product product = new Product(ss[0],Double.parseDouble(ss[1]));
           products.add(product);
        }


        String command = scanner.nextLine();

        while(!command.equals("END")){
            String[] tokens = command.split(" ");
            int productIndex = 0;
            for(int i=0; i<products.size(); i++){
                if(products.get(i).getName().equals(tokens[1])){
                    productIndex=i;
                }

            }
            for(Person x:people){
                if(x.getName().equals(tokens[0])){
                    x.buyProduct(products.get(productIndex));
                }
            }
            command = scanner.nextLine();
        }

        for(Person x:people){
            if(x.getProducts().isEmpty()){
                System.out.println(x.getName()+" - Nothing bought");
            }else if(x.getProducts().size()==1){
                System.out.println(x.getName()+" - "+x.getProducts().get(0).getName());
            }else{
                for(int i=0; i<x.getProducts().size(); i++){
                    if(i==0){
                        System.out.print(x.getName()+" - "+x.getProducts().get(0).getName());
                    }else{
                        System.out.print(", "+x.getProducts().get(i).getName());
                    }
                }
            }
        }
    }
}
