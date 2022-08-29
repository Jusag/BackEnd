/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author LaC-I7
 */
public class dtoEducacion {
    @NotBlank
    private String tituloE;
    @NotBlank
    private String anioIE;
    @NotBlank
    private String anioEE;
    @NotBlank
    private String lugarE;
    @NotBlank
    private String descripcionE;
    
    
    
    public dtoEducacion() {
    }

    public dtoEducacion(String tituloE, String anioIE, String anioEE, String lugarE, String descripcionE) {
        this.tituloE = tituloE;
        this.lugarE = lugarE;
        this.anioIE = anioIE;
        this.anioEE = anioEE;
        this.descripcionE = descripcionE;
    }
    

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String nombreE) {
        this.tituloE = nombreE;
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

    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
    }
    
    
    
}
