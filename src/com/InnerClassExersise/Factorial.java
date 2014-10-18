package com.InnerClassExersise;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Olga on 17.10.2014.
 */
public class Factorial implements Iterable<Integer> {
    private int lowerLimit;
    private int upperLimit;

    public Factorial(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public Factorial() {
        this(1, 1);
    }

    public Iterator<Integer> iterator() {
        return new MyIterator(this);
    }

    static class MyIterator implements Iterator<Integer> {
        private Factorial factorial;
        private int current;
        private int currentNumber;

        public MyIterator(Factorial factorial) {
            this.factorial = factorial;
            this.current = factorial.lowerLimit;
            this.currentNumber = factorial.lowerLimit;
        }

        @Override
        public boolean hasNext() {
            if (current <= factorial.upperLimit)
                return true;
            else
                return false;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            this.currentNumber = currentNumber * (current++);
            return currentNumber;
        }
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial(1, 5);

        for (int f : fact) {
            System.out.print(" " + f);
        }
    }
}
