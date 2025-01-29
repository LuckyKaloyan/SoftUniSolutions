package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.GenericCountMethodStrings;

class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(Box<T> otherBox) {
        return this.data.compareTo(otherBox.getData());
    }
}
