package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Lab.PointInRectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<PointsInRectangle> list = new ArrayList<>();

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = array[0];
        int bottomLeftY = array[1];
        int topRightX = array[2];
        int topRightY = array[3];

        int times = Integer.parseInt(scanner.nextLine());

        for(int x=bottomLeftX; x<=topRightX; x++){
            for(int y=bottomLeftY; y<=topRightY; y++){
                list.add(new PointsInRectangle(x,y));
            }
        }

        for(int i=0; i<times; i++){
            int[]tokens = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean contains = false;

            for(PointsInRectangle pointed:list){
                if(pointed.getX()==tokens[0] && pointed.getY()==tokens[1]){
                    contains = true;
                    break;
                }
            }
            if(contains){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


        }

    }
}
