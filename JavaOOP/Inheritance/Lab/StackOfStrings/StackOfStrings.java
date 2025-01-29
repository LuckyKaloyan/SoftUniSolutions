package SoftUniJavaOOP.OOP.Inheritance.Lab.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings extends ArrayList<String> {

    private ArrayList<String> data = new ArrayList<>();

    public void push(String item){
        this.add(item);
    }
    public String pop(){
        String returned = this.get(this.size()-1);
        this.remove(this.size()-1);
        return returned;
    }
    public String peek(){
        return this.get(this.size()-1);
    }

}
