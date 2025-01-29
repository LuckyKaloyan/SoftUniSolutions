package SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.tables.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.bakedFoods.interfaces.BakedFood;
import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces.Drink;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTable implements Table {
    private int tableNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved;
    private List<BakedFood> foodOrders;
    private List<Drink> drinkOrders;

    protected BaseTable(int tableNumber, int capacity, double pricePerPerson) {
        this.setTableNumber(tableNumber);
        this.setCapacity(capacity);
        this.setPricePerPerson(pricePerPerson);
        this.foodOrders = new ArrayList<>();
        this.drinkOrders = new ArrayList<>();
    }

    private void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
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
    public int getTableNumber() {
        return this.tableNumber;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double getPricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReserved() {
        return this.isReserved;
    }

    @Override
    public double getPrice() {
        return this.numberOfPeople * this.pricePerPerson;
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
    public void orderFood(BakedFood food) {
        this.foodOrders.add(food);
    }

    @Override
    public void orderDrink(Drink drink) {
        this.drinkOrders.add(drink);
    }

    @Override
    public double getBill() {
        double foodBill = this.foodOrders.stream().mapToDouble(BakedFood::getPrice).sum();
        double drinkBill = this.drinkOrders.stream().mapToDouble(Drink::getPrice).sum();
        return foodBill + drinkBill;
    }

    @Override
    public void clear() {
        this.foodOrders.clear();
        this.drinkOrders.clear();
        this.numberOfPeople = 0;
        this.isReserved = false;
    }

    @Override
    public String getFreeTableInfo() {
        return String.format("Table: %d%nType: %s%nCapacity: %d%nPrice per Person: %.2f",
                this.getTableNumber(), this.getClass().getSimpleName(), this.getCapacity(), this.getPricePerPerson());
    }
}