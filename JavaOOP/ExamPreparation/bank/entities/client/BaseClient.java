package SoftUniJavaOOP.ExamPreparationOOP.bank.entities.client;

import SoftUniJavaOOP.ExamPreparationOOP.bank.common.ExceptionMessages;

public abstract class BaseClient implements Client{
    private String name;
    private String ID;
    private int interest;
    private double income;

    public BaseClient(String name, String ID, int interest, double income){
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        if(ID==null || ID.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_ID_CANNOT_BE_NULL_OR_EMPTY);
        }
        if(income<=0){
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_INCOME_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        this.name = name;
        this.ID = ID;
        this.interest = interest;
        this.income = income;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getInterest() {
        return interest;
    }

    @Override
    public double getIncome() {
        return income;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
}
