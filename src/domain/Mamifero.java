package domain;

import java.util.InvalidPropertiesFormatException;

public abstract class Mamifero {
    private int edad;
    private double peso;
    private Especie especie;
    private Sector sector;
    private PaisOficial pais;
    private TipoAlimentacion tipoAlimentacion;


    protected Mamifero(TipoAlimentacion tipoAlimentacion,
                       int edad, double peso, Especie especie, Sector sector, PaisOficial pais) throws IllegalArgumentException, InvalidPropertiesFormatException {
        if(especie == null) throw new IllegalArgumentException();
        if(sector == null) throw  new IllegalArgumentException();
        if(especie.getTipoAlimentacion() != tipoAlimentacion) throw new InvalidPropertiesFormatException("El animal no puede pertenecer a la especie");
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.sector = sector;
        this.pais= pais;
        sector.agregarAnimal(this);
    }

    public abstract double calcularCantidadDeComida();

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public Especie getEspecie() {
        return especie;
    }

    public PaisOficial getPais() {
        return pais;
    }

    public void setPais(PaisOficial pais) {
        this.pais = pais;
    }

    public Sector getSector() {
        return sector;
    }
    public TipoAlimentacion getTipoAlimentacion(){
        return tipoAlimentacion;
    }
    
    public boolean TieneAlimentacion(TipoAlimentacion tipo){
        return tipoAlimentacion == tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
