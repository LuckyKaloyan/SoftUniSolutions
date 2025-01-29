package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices.GenericArrayCreator;

public class GenericArrayCreator<T> {

         T[] array;
         int length;
    GenericArrayCreator(int length, T item){
        this.length = length;
        this.array = (T[]) new Object[length];
    }

    public static <T> T[] create(int length, T item){
      T[] newArr = (T[]) new Object[length];
      for(int i=0; i<length; i++){
          newArr[i]=item;
      }
      return newArr;
    }
    public static <T> T[] create(Class<T> clazz,int length, T item){
        T[] newArr = (T[]) new Object[length];
        for(int i=0; i<length; i++){
            newArr[i]=item;
        }
        return newArr;
    }








}
