package Comparator;

import Entities.Car;

import java.util.Comparator;

public class CarComparatorKmDecrescente implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getKmRodados().compareTo(o2.getKmRodados()) > 0){
            return -1;
        }
        return 1;
    }
}
