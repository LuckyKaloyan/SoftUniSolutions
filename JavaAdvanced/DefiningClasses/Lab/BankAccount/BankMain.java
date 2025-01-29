package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Lab.BankAccount;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bank = new HashMap<>();

        String line = scanner.nextLine();
        while(!line.equals("End")){
            String[] splitted = line.split(" ");
            String command = splitted[0];
            if(command.equals("Create")){
                create(bank);
            } else if(command.equals("Deposit")){
                deposit(splitted, bank);
            } else if(command.equals("SetInterest")){
                setInterest(Double.parseDouble(splitted[1]));
            } else{
                printInterest(bank, splitted);
            }

            line = scanner.nextLine();
        }









    }

    private static void printInterest(Map<Integer, BankAccount> bank, String[] splitted) {
        int id = Integer.parseInt(splitted[1]);
        BankAccount account = bank.get(id);
        if(account != null){
            int years = Integer.parseInt(splitted[2]);

            System.out.printf("%.2f%n",account.getInterest(years));

        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interestRate) {
        BankAccount.setInterestRate(interestRate);
    }

    private static void create(Map<Integer, BankAccount> bank) {
        BankAccount account = new BankAccount();
        bank.put(account.getId(), account);
        System.out.println("Account ID"+account.getId()+" created");
    }

    private static void deposit(String[] splitted, Map<Integer, BankAccount> bank) {
        int id = Integer.parseInt(splitted[1]);
        int amount = Integer.parseInt(splitted[2]);
        BankAccount account = bank.get(id);
        if(account != null){
            account.deposit(amount);
            System.out.println("Deposited "+amount+" to ID"+id);

        }else{
            System.out.println("Account does not exist");
        }
    }
}