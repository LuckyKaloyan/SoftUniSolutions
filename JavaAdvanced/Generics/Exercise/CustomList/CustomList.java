package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public CustomList<T> add(T element) {
        this.data.add(element);
        return this;
    }

    public CustomList<T> remove(int index) {
        checkIndex(index);
        this.data.remove(index);
        return this;
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public CustomList<T> swap(int firstIndex, int secondIndex) {
        checkIndex(firstIndex);
        checkIndex(secondIndex);
        Collections.swap(this.data, firstIndex, secondIndex);
        return this;
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T t : this.data) {
            int result = t.compareTo(element);
            if (result > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        checkEmpty();
        return Collections.max(this.data);
    }

    public T getMin() {
        checkEmpty();
        return Collections.min(this.data);
    }

    public void print() {
        for (T t : this.data) {
            System.out.println(t);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.data.size()) {
            throw new IndexOutOfBoundsException(String.format("Index %d is out of bounds for size %d.", index, this.data.size()));
        }
    }

    private void checkEmpty() {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("List is Empty");
        }
    }
}