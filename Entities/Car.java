package Entities;

public class Car implements Comparable<Car>{
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer kmRodados;

    // CONSTRUCTORS
    public Car(String marca, String modelo, Integer ano, Integer kmRodados){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kmRodados = kmRodados;
    }

    // GET
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public Integer getKmRodados() {
        return kmRodados;
    }

    // SET
    public void setMarca(String newMarca){
        this.marca = newMarca;
    }
    public void setModelo(String newModelo){
        this.modelo = newModelo;
    }
    public void setAno(Integer newAno){
        this.ano = newAno;
    }
    public void setKmRodados(Integer kmRodados){
        this.kmRodados = kmRodados;
    }

    // METHODS
    @Override
    public String toString() {
        return "MARCA: " + this.marca + " MODELO: " + this.modelo + " KM: " + this.kmRodados +" ANO: " + this.ano;
    }

    // ORDEM CRESCENTE ( MARCA )
    @Override
    public int compareTo(Car c1) {
        if(this.marca.compareTo(c1.getMarca()) > 0){
            return 1;
        }
        return -1;
    }
}
