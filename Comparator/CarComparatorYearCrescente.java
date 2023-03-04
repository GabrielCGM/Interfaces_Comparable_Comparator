package Comparator;

import Entities.Car;

import java.util.Comparator;

public class CarComparatorYearCrescente implements Comparator<Car> {

    // ORDEM CRESCENTE
    @Override
    public int compare(Car c1, Car c2) {
        if(c1.getAno().compareTo(c2.getAno()) > 0){
            return 1;
        }
        return -1;

    }
}
