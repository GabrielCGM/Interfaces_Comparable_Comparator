package Comparator;

import Entities.Car;

import java.util.Comparator;

public class CarComparatorYearDecrescente implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if(c1.getAno().compareTo(c2.getAno()) > 0){
            return -1;
        }
        return 1;
    }
}
