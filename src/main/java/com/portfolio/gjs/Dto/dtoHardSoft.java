
package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHardSoft {
    @NotBlank
    private String nombreHS;
    @NotBlank
    private int porcentajeHS;

    public dtoHardSoft() {
    }

    public dtoHardSoft(String nombreHS, int porcentajeHS) {
        this.nombreHS = nombreHS;
        this.porcentajeHS = porcentajeHS;
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
