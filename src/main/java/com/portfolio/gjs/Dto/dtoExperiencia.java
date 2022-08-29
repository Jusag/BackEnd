package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String anioIE;
    @NotBlank
    private String anioEE;
    @NotBlank
    private String cargoE;
    @NotBlank
    private String descripcionE;

    
    
    public dtoExperiencia() {
    }
   
    public dtoExperiencia(String nombreE, String anioIE, String anioEE, String cargoE, String descripcionE) {
        this.nombreE = nombreE;
        this.anioIE = anioIE;
        this.anioEE = anioEE;
        this.cargoE = cargoE;
        this.descripcionE = descripcionE;
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
