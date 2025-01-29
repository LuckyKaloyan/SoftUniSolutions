package SoftUniJavaOOP.ExamPreparationOOP.bank.entities.bank;

import SoftUniJavaOOP.ExamPreparationOOP.bank.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.bank.entities.client.Client;
import SoftUniJavaOOP.ExamPreparationOOP.bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class BaseBank implements Bank{
    private Collection<Loan> loans;
    private Collection<Client> clients;
    private int capacity;
    private String name;

    public BaseBank(String name, int capacity){
        setName(name);
        this.capacity = capacity;
        this.loans = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public int sumOfInterestRates(){
        int sum = 0;
        for(Loan loan:loans){
            sum = sum + loan.getInterestRate();
        }
        return sum;
    }
    public void addClient(Client client){
        if(capacity==clients.size()){
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT);
        }
        else {
        clients.add(client);
    }}

    public void removeClient(Client client){
        clients.remove(client);
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }

    @Override
    public String getStatistics() {
      StringBuilder clientsList;
      if(!clients.isEmpty()){
          Iterator<Client> iterator = clients.iterator();
          clientsList = new StringBuilder(iterator.next().getName());
          for(Client client:clients) {clientsList.append(", ").append(iterator.next().getName());}
      }else{
          clientsList = new StringBuilder("none");
      }

      return String.format("Name: %s, Type: %s"+System.lineSeparator()
      + "Clients: "+clientsList + System.lineSeparator()
              +"Loans: %d, Sum of interest rates: %d",name,getClass().getSimpleName(),loans.size(),sumOfInterestRates());
    }

    @Override
    public void setName(String name) {
        if(name==null && name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Client> getClients() {
        return clients;
    }

    @Override
    public Collection<Loan> getLoans() {
        return loans;
    }

    @Override
    public String getName() {
        return name;
    }
}
