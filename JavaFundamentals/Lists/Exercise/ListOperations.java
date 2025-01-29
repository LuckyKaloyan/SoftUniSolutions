package FundamentalsModule.Lists.Exercise;

import java.util.*;



public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        String word = scanner.nextLine();
        String[] insert;
        int index;
        int element;

        if(word.startsWith("Add")){
            try {
                myList.add(Integer.parseInt(word.substring(4)));
            }catch(Exception e){
                System.out.println("Invalid index");
            }
        }else if(word.startsWith("Remove")){
            try{myList.remove(Integer.parseInt(word.substring(7)));}catch(Exception e){
                System.out.println("Invalid index");
            }

        }else if(word.startsWith("Shift l")){
            try{
                for(int i=0; i<Integer.parseInt(word.substring(11)); i++) {
                    myList.add(myList.get(0));
                    myList.remove(0);

                }}catch(Exception e){
                System.out.println("Invalid index");
            }

        }else if(word.startsWith("Shift r")){
            try{
                for(int j=0; j<Integer.parseInt(word.substring(12)); j++) {
                    myList.add(0);
                    for (int i = myList.size() - 1; i > 0; i--) {
                        myList.set(i, myList.get(i - 1));
                    }
                    myList.set(0, myList.get(myList.size() - 1));
                    myList.remove(myList.size() - 1);
                }}catch(Exception e){
                System.out.println("Invalid index");
            }

        }else if(word.startsWith("Insert")){
            try {

                insert = word.split("\\s+");
                element = Integer.parseInt(insert[1]);
                index = Integer.parseInt(insert[2]);

                myList.add(index, element);
            }catch(Exception e){
                System.out.println("Invalid index");
            }
        }
        while(!word.equals("End")){
            word= scanner.nextLine();
            if(word.equals("End")){break;}
            if(word.startsWith("Add")){
                try {
                    myList.add(Integer.parseInt(word.substring(4)));
                }catch(Exception e){
                    System.out.println("Invalid index");
                }
            }else if(word.startsWith("Remove")){
                try{myList.remove(Integer.parseInt(word.substring(7)));}catch(Exception e){
                    System.out.println("Invalid index");
                }


            }else if(word.startsWith("Shift l")){
                try {
                    for (int i = 0; i < Integer.parseInt(word.substring(11)); i++) {
                        myList.add(myList.get(0));
                        myList.remove(0);

                    }
                }catch(Exception e){
                    System.out.println("Invalid index");
                }

            }else if(word.startsWith("Shift r")){
                try{
                    for(int j=0; j<Integer.parseInt(word.substring(12)); j++) {
                        myList.add(0);
                        for (int i = myList.size() - 1; i > 0; i--) {
                            myList.set(i, myList.get(i - 1));
                        }
                        myList.set(0, myList.get(myList.size() - 1));
                        myList.remove(myList.size() - 1);
                    }}catch(Exception e){
                    System.out.println("Invalid index");
                }

            }else if(word.startsWith("Insert")){
                try{

                    insert = word.split("\\s+");
                    element = Integer.parseInt(insert[1]);
                    index = Integer.parseInt(insert[2]);

                    myList.add(index, element);
                }catch(Exception e){
                    System.out.println("Invalid index");
                }
            }
        }
        for(int i=0; i<myList.size(); i++){
            System.out.print(myList.get(i)+" ");
        }
    }
}
