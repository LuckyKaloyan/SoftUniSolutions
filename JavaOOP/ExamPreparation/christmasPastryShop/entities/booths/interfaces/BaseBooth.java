package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.booths.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseBooth implements Booth {
    private List<Delicacy> delicacyOrders;
    private List<Cocktail> cocktailOrders;
    private int boothNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved;

    protected BaseBooth(int boothNumber, int capacity, double pricePerPerson) {
        this.delicacyOrders = new ArrayList<>();
        this.cocktailOrders = new ArrayList<>();
        setBoothNumber(boothNumber);
        setCapacity(capacity);
        setPricePerPerson(pricePerPerson);
    }

    private void setBoothNumber(int boothNumber) {
        this.boothNumber = boothNumber;
    }

    private void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }

    private void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
        this.isReserved = true;
    }

    @Override
    public double getBill() {
        return numberOfPeople * pricePerPerson;
    }

    @Override
    public void clear() {
        delicacyOrders.clear();
        cocktailOrders.clear();
        numberOfPeople = 0;
        isReserved = false;
    }

    @Override
    public int getBoothNumber() {
        return boothNumber;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public double getPrice() {
        return pricePerPerson * numberOfPeople;
    }
}

