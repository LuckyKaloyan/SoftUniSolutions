package SoftUniJavaOOP.OOP.Inheritance.Lab.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement(){
        Random random = new Random();
        int size = this.size();
        int randomIndex = random.nextInt(size);
        T element = this.get(randomIndex);
        this.remove(randomIndex);
        return element;
    }

}
