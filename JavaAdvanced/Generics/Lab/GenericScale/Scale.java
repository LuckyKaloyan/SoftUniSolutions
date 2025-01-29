package SoftUniJavaOOP.JavaAdvanced.Generics.Lab.GenericScale;


public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        if (left == null || right == null)
            return null;

        int comparison = left.compareTo(right);
        if (comparison > 0)
            return left;
        else if (comparison < 0)
            return right;
        else
            return null;
    }
}
