package SoftUniJavaOOP.JavaAdvanced.Generics.Lab.ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        return Collections.max(list);
    }
}

