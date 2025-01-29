package AdvancedModule.StacksAndQueues.Lab;
import java.util.ArrayDeque;
import java.util.Scanner;
public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String command= scanner.nextLine();

        while(!command.equals("print")){


            if(command.equals("cancel")){

                if(printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled "+printerQueue.remove());
                }
            }else{
                printerQueue.offer(command);
            }
            command= scanner.nextLine();
        }

        int kebab = printerQueue.size();
        for(int i=0; i< kebab; i++){
            System.out.println(printerQueue.remove());
        }
    }
}
