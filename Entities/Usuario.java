package Entities;
import Interface.ConfigCar;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements ConfigCar {
    private String name;
    private LocalDate nascimento;
    private String marcaFavorita;
    private List<Car> mylist = new ArrayList<>();

    // CONSTRUCTORS
    public Usuario(String name, String nascimento){
        this.name = name;
        this.nascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public Usuario(String name, String nascimento, String marcaFavorita, List <Car> obj){
        this.name = name;
        this.nascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.marcaFavorita = marcaFavorita;
        this.mylist = marcaFavorit(obj,  marcaFavorita);

    };

    // GET
    public String getName(){
        return this.name;
    }
    public LocalDate getNascimento(){
        return this.nascimento;
    }
    public String getMarcaFavorita(){
        return this.marcaFavorita;
    }
    public void getMyList(){
        for(Car c: mylist){
            System.out.println(c);
        }
    }

    // SET
    public void setMarcaFavorita(String newMarca){
        this.marcaFavorita = newMarca;
    }


}
