package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 10000;
        int build  = 0;
        int meters = 0;

        while(build<target){
            String step =(scanner.nextLine());
            if(step.equals("Going home")){meters = Integer.parseInt(scanner.nextLine());}
            else{meters = Integer.parseInt(step);}
            build = build+meters;
            if(build>=target) {
                System.out.println("Goal reached! Good job!");
                System.out.println((build - target) + " steps over the goal!");
                break;
            }
            if(step.equals("Going home") && build<target){
                System.out.println((target-build)+" more steps to reach goal.");
                break;
            }
            else if(build>=target && step.equals("Going home")) {
                System.out.println("Goal reached! Good job!");
                System.out.println((build - target) + " steps over the goal!");
                break;
            }
        }
    }
}
