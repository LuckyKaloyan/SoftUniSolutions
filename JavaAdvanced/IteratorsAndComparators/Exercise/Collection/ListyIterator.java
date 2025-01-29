package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.Collection;


import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;



class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(List<String> elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    public boolean move() {
        if (currentIndex < elements.size() - 1) {
            currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }

    public void print() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(currentIndex));
    }

    public void printAll() {
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new ListyIteratorIterator();
    }

    private class ListyIteratorIterator implements Iterator<String> {
        private int iteratorIndex;

        public ListyIteratorIterator() {
            this.iteratorIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return iteratorIndex < elements.size();
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements.get(iteratorIndex++);
        }
    }
}
