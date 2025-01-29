package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Lab.BankAccount;
public class BankAccount {
    int id;
    double balance;
    private static double interestRate = 0.02;
    private static int idCounter = 1;

    public int getId() {
        return id;
    }

    public BankAccount(){
        this.id = idCounter;
        idCounter++;
    }
    public double getInterest(int years){
        return interestRate*years*balance;
    }
    public void deposit(double amount){
        balance +=amount;
    }
    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }


}
