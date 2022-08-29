
package com.portfolio.gjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloE;
    private String lugarE;
    private String anioIE;
    private String anioEE;
    private String descripcionE;
    
    public Educacion() { }

    public Educacion(String tituloE, String lugarE, String anioIE, String anioEE, String descripcionE) {
        this.tituloE = tituloE;
        this.lugarE = lugarE;
        this.anioIE = anioIE;
        this.anioEE = anioEE;
        this.descripcionE = descripcionE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
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
}
