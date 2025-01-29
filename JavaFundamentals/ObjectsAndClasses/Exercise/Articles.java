package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.Scanner;
public class Articles {
    String title;
    String content;
    String author;

    public Articles(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");

        Articles begining = new Articles(input[0], input[1], input[2]);

        int times = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<times; i++){
            String[]split = scanner.nextLine().split(":");
            if(split[0].equals("Edit")){
                begining.setContent(split[1]);}
            if(split[0].equals("ChangeAuthor")){
                begining.setAuthor(split[1]);
            }
            if(split[0].equals("Rename")){
                begining.setTitle(split[1].substring(1));
            }
        }

        System.out.println(begining.title+" -"+begining.content+":"+begining.author);

    }
}
