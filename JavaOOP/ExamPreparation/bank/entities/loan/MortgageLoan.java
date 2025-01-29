package SoftUniJavaOOP.ExamPreparationOOP.bank.entities.loan;

public class MortgageLoan extends BaseLoan{

    private static int DEFAULT_INTEREST_RATE = 3;
    private static double DEFAULT_AMOUNT = 50000;


    public MortgageLoan(){
        super(DEFAULT_INTEREST_RATE,DEFAULT_AMOUNT);
    }


}
