package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.Iterator;


class Lake implements Iterable<Integer> {
    private int[] numbers;

    public Lake(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int index;
        private boolean even;

        public Frog() {
            index = 0;
            even = true;
        }

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            int num = numbers[index];
            if (even) {
                index += 2;
                if (index >= numbers.length && even) {
                    index = 1;
                    even = false;
                }
            } else {
                index += 2;
            }
            return num;
        }
    }
}
