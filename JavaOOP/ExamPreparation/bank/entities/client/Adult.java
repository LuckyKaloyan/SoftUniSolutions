package SoftUniJavaOOP.ExamPreparationOOP.bank.entities.client;

public class Adult extends BaseClient{
    private static int DEFAULT_INTEREST = 4;

    public Adult(String name, String ID, double income){
        super(name,ID,DEFAULT_INTEREST,income);
    }

    @Override
    public void increase() {
        setInterest(getInterest()+2);
    }

}
