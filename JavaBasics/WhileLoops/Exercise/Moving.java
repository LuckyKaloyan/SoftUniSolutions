package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width*length*height;
        int fulled = 0;

        while(volume>fulled){
            String input = scanner.nextLine();
            if(input.equals("Done")){
                System.out.printf("%d Cubic meters left.",(volume-fulled));
                break;}
            else{
                int kiufte = Integer.parseInt(input);
                fulled=fulled+kiufte;}
            if(fulled>volume){
                System.out.printf("No more free space! You need %d Cubic meters more.",(fulled-volume));
                break;
            }
        }




    }
}
