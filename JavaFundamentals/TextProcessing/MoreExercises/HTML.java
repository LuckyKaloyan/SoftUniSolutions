package FundamentalsModule.TextProcessing.MoreExercises;

import java.util.Scanner;
public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleName = scanner.nextLine();
        String acrticle = scanner.nextLine();

        String comments = "";
        System.out.println("<h1>");
        System.out.printf("    %s",articleName);
        System.out.println();
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.printf("    %s", acrticle);
        System.out.println();
        System.out.println("</article>");


        while(!comments.equals("end of comments")){
            comments = scanner.nextLine();
            if(!comments.equals("end of comments")){
                System.out.println("<div>");
                System.out.printf("    %s",comments);
                System.out.println();
                System.out.println("</div>");
            }


        }



    }
}
