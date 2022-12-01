package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RangeWithStepTest {
    @Test
    void testRangeWithStep() {
        RangeWithStep rangeWithStep = new RangeWithStep(-10, 10, 3);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for (var elem : rangeWithStep) {
            System.out.println(elem);
        }

        Iterator rangeIterator = rangeWithStep.iterator();
        while (rangeIterator.hasNext()) {
            System.out.println(rangeIterator.next());
        }

        assertEquals("-10\r\n-7\r\n-4\r\n-1\r\n2\r\n5\r\n8\r\n" + "-10\r\n-7\r\n-4\r\n-1\r\n2\r\n5\r\n8\r\n",
                outContent.toString());
    }
}