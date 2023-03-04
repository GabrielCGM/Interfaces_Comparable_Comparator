import Comparator.CarComparatorKmCrescente;
import Comparator.CarComparatorKmDecrescente;
import Comparator.CarComparatorYearCrescente;
import Comparator.CarComparatorYearDecrescente;
import Entities.Car;
import Entities.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // LIST
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Volk","POLO",2020, 20000));
        listCar.add(new Car("Fiat","Strada",2019, 35000));
        listCar.add(new Car("Ford","Ranger",2022,5000));
        listCar.add(new Car("KIA", "Cerato",2015,95000));


        // TYPE USUARIO
        Usuario user01 = new Usuario("Gabriel", "27/06/2004","Volk", listCar);

        Collections.sort(listCar, new CarComparatorYearCrescente());
        System.out.println("ORDEM CRESCENTE POR ANO");
        for(Car c: listCar){
           System.out.println(c);
        }
        System.out.println("---------");


        System.out.println("ORDEM DECRESCENTE POR ANO");
        Collections.sort(listCar, new CarComparatorYearDecrescente());
        for(Car c: listCar){
            System.out.println(c);
        }
        System.out.println("---------");


        System.out.println("ORDEM CRESCENTE POR MARCA");
        Collections.sort(listCar);
        for(Car c: listCar){
            System.out.println(c);
        }
        System.out.println("-----------");


        System.out.print("ORDEM CRESCENTE POR KM ");
        Collections.sort(listCar, new CarComparatorKmCrescente());
        for(Car c: listCar){
            System.out.println(c);
        }
        System.out.println("-----------");


        System.out.print("ORDEM DECRESCENTE POR KM ");
        Collections.sort(listCar, new CarComparatorKmDecrescente());
        for(Car c: listCar){
            System.out.println(c);
        }
        System.out.println("-----------");


    };
}