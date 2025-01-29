package SoftUniJavaOOP.ExamPreparationOOP.bank.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.bank.entities.loan.Loan;

public interface Repository {

    void addLoan(Loan loan);

    boolean removeLoan(Loan loan);

    Loan findFirst(String type);
}
