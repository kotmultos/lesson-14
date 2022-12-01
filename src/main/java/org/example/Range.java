package org.example;


import java.util.Iterator;

public class Range implements Iterable {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator iterator() {
        return new RangeIterator();
    }

    public class RangeIterator implements Iterator {
        private int current = start;

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() {
            return current++;
        }
    }
}
