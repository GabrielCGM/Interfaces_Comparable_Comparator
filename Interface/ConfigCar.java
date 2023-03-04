package Interface;

import Entities.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface ConfigCar {
    default List<Car> marcaFavorit(List<Car> obj, String marcaFavorita){
        List<Car> newListMarca = new ArrayList<>();
        for(Car c: obj){
            if(c.getMarca() == marcaFavorita){
                newListMarca.add(c);
            }
        }
        if(!(newListMarca.isEmpty())){
            return newListMarca;
        }
        return null;
    };


}
