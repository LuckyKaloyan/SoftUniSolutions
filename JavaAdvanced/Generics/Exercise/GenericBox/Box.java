package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.GenericBox;

class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() + ": " + data.toString();
    }
}


