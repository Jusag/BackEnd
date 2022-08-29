package com.portfolio.gjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String anioIE;
    private String anioEE;
    private String cargoE;
    private String descripcionE;
    
    //Constructores

    public Experiencia() { }

    public Experiencia(String nombreE, String anioIE, String anioEE, String cargoE, String descripcionE) {
        this.nombreE = nombreE;
        this.anioIE = anioIE;
        this.anioEE = anioEE;
        this.cargoE = cargoE;
        this.descripcionE = descripcionE;
    }
    
    /*
    public Experiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    */
    //Getter Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getAnioIE() {
        return anioIE;
    }

    public void setAnioIE(String anioIE) {
        this.anioIE = anioIE;
    }

    public String getAnioEE() {
        return anioEE;
    }

    public void setAnioEE(String anioEE) {
        this.anioEE = anioEE;
    }

    public String getCargoE() {
        return cargoE;
    }

    public void setCargoE(String cargoE) {
        this.cargoE = cargoE;
    }
    
    
}
