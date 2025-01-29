package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices.Jar;

import java.util.ArrayDeque;

public class Jar <T>{

    ArrayDeque<T> jar = new ArrayDeque<>();
    public void add(T element){
        jar.push(element);
    }
    public T remove (){
        return jar.pop();
    }
    public ArrayDeque<T> getJar() {
        return jar;
    }
}
