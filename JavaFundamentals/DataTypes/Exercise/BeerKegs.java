package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        String model;
        double radius;
        double height;

        double bestsize=0;
        String bestname = "";




        for(int i=0; i<input; i++){
            model = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Double.parseDouble(scanner.nextLine());


            if(radius*radius*height*Math.PI>bestsize){bestsize=radius*radius*height*Math.PI;
                bestname = model;}

        }
        System.out.println(bestname);

    }
}
