package SoftUniJavaOOP.ExamPreparationOOP.bank.entities.client;

public class Student extends BaseClient{

    private static int DEFAULT_INTEREST = 2;
    public Student(String name, String ID, double income){
        super(name,ID,DEFAULT_INTEREST,income);
    }
    public void increase(){
        setInterest(getInterest()+1);
    }

}
