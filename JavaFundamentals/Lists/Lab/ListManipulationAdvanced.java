package FundamentalsModule.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

        String word;
        String word2;
        int kokazako;
        int kokazako2;
        int sum = 0;

        boolean iftrue = true;

        while(iftrue){

            word = scanner.next();
            if(word.equals("Contains")){kokazako= scanner.nextInt();
                for(int i=0; i<numbers.size(); i++)
                {
                    if(i==numbers.size()-1){
                        if(kokazako==numbers.get(i)){
                            System.out.println("Yes");
                            break;
                        }else{System.out.println("No such number");}

                    }
                    if(kokazako==numbers.get(i)){
                        System.out.println("Yes");
                        break;}}

            }
            if(word.equals("Print")){
                word2= scanner.next();

                if(word2.equals("odd")){
                    for(int k=0; k<numbers.size();k++){
                        if(numbers.get(k)%2==1){System.out.print(numbers.get(k)+" ");
                        }
                    }
                    System.out.println();

                }
                if(word2.equals("even")){
                    for(int k=0; k<numbers.size();k++){
                        if(numbers.get(k)%2==0){System.out.print(numbers.get(k)+" ");
                        }
                    }
                    System.out.println();
                }
            }

            if(word.equals("Get")){
                word2= scanner.next();

                if(word2.equals("sum")){
                    for(int g=0; g<numbers.size(); g++){
                        sum=sum+numbers.get(g);}
                    System.out.println(sum);
                    sum = 0;
                }
            }

            if(word.equals("Filter")){
                word2= scanner.next();
                kokazako2= scanner.nextInt();
                if(word2.equals("<")){for(int o=0; o<numbers.size(); o++){if(numbers.get(o)<kokazako2){System.out.print(numbers.get(o)+" ");}}}
                if(word2.equals(">")){for(int o=0; o<numbers.size(); o++){if(numbers.get(o)>kokazako2){System.out.print(numbers.get(o)+" ");}}}
                if(word2.equals("<=")){for(int o=0; o<numbers.size(); o++){if(numbers.get(o)<=kokazako2){System.out.print(numbers.get(o)+" ");}}}
                if(word2.equals(">=")){for(int o=0; o<numbers.size(); o++){if(numbers.get(o)>=kokazako2){System.out.print(numbers.get(o)+" ");}}}
                System.out.println();
            }
            if(word.equals("end")){iftrue=false;}


        }






    }
}
