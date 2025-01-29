package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices.GenericArrayCreator;


import java.lang.reflect.Array;

public class ArrayCreator <T> {

   static <T> T[] create(int length, T item){
       T[] array = (T[]) Array.newInstance(item.getClass(),length);
       for(int i=0; i<length; i++){
           array[i]=item;
       }
       return array;
   }

    static <T> T[] create(Class<T> clazz, int length, T item){
        T[] array = (T[]) Array.newInstance(clazz,length);
        for(int i=0; i<length; i++){
            array[i]=item;
        }
        return array;
    }


}