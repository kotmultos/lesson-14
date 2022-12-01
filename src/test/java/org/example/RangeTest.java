package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    void testRange() {
        Range range = new Range(-10, 10);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for (var elem : range) {
            System.out.println(elem);
        }

        Iterator rangeIterator = range.iterator();
        while (rangeIterator.hasNext()) {
            System.out.println(rangeIterator.next());
        }

        assertEquals("-10\r\n-9\r\n-8\r\n-7\r\n-6\r\n-5\r\n-4\r\n-3\r\n-2\r\n-1\r\n0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n" +
                        "-10\r\n-9\r\n-8\r\n-7\r\n-6\r\n-5\r\n-4\r\n-3\r\n-2\r\n-1\r\n0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n",
                outContent.toString());

    }

}