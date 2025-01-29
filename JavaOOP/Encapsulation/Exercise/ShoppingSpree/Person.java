package SoftUniJavaOOP.OOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if(null==name ||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }else{
            this.name = name;
        }
    }

    private void setMoney(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = cost;
        }
    }

    public String getName() {
        return name;
    }
    public void buyProduct(Product product){
        if(money>=product.getCost()) {
            products.add(product);
            money=money-product.getCost();
            System.out.println(getName()+" bought "+product.getName());
        }else{
            System.out.println(getName() + " can't afford "+product.getName());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
