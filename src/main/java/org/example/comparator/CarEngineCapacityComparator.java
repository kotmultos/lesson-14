package org.example.comparator;

import org.example.Car;

import java.util.Comparator;

public class CarEngineCapacityComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int)( o1.getEngineCapacity() * 100 - o2.getEngineCapacity() * 100);
    }
}
