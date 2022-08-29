
package com.portfolio.gjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class HardSoft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombreHS;
    @NotNull
    private int porcentajeHS;

    public HardSoft() {
    }

    public HardSoft(String nombreHS, int porcentajeHS) {
        this.nombreHS = nombreHS;
        this.porcentajeHS = porcentajeHS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHS() {
        return nombreHS;
    }

    public void setNombreHS(String nombreHS) {
        this.nombreHS = nombreHS;
    }

    public int getPorcentajeHS() {
        return porcentajeHS;
    }

    public void setPorcentajeHS(int porcentajeHS) {
        this.porcentajeHS = porcentajeHS;
    }
}
