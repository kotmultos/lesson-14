package org.example;

import org.example.comparator.CarEngineCapacityComparator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testSortListByYearOfProduction() {
        Car a = new Car(2025, 36.0);
        Car b = new Car(2005, 41.5);
        Car c = new Car(2000, 21.5);
        Car d = new Car(2008, 21.35);

        List<Car> list = Arrays.asList(a, b, c, d);

        List<Car> expected = Arrays.asList(c, b, d, a);
        Collections.sort(list);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    void testSortTreeSetByEngineCapacity() {
        Car a = new Car(2025, 36.0);
        Car b = new Car(2005, 41.5);
        Car c = new Car(2000, 21.5);
        Car d = new Car(2008, 21.35);

        Set<Car> carSet = new TreeSet<>(new CarEngineCapacityComparator());
        carSet.add(a);
        carSet.add(b);
        carSet.add(c);
        carSet.add(d);

        double [] expectedSequence = {21.35, 21.5, 36.0, 41.5};
        int i = 0;

        for(Car elem: carSet)
        {
            assertEquals(expectedSequence[i], elem.getEngineCapacity());
            i++;
        }
    }

}