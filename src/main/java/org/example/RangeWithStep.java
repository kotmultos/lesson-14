package org.example;

import java.util.Iterator;

public class RangeWithStep implements Iterable{
    private final int start;
    private final int end;
    private final int step;

    public RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator iterator() {
        return new RangeWithStepIterator();
    }

    public class RangeWithStepIterator implements Iterator {
        private int current = start;

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() {
            int res = current;
            current += step;
            return res;
        }
    }
}
