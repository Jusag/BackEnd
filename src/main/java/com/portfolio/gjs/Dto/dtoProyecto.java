package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotNull;

public class dtoProyecto {
    @NotNull
    private String nombreP;
    @NotNull
    private String descripcionP;
    @NotNull
    private String linkImgP;
    
    private String linkExtP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String linkImgP, String linkExtP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkImgP = linkImgP;
        this.linkExtP = linkExtP;
    }

    

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getLinkImgP() {
        return linkImgP;
    }

    public void setLinkImgP(String linkImgP) {
        this.linkImgP = linkImgP;
    }

    public String getLinkExtP() {
        return linkExtP;
    }

    public void setLinkExtP(String linkExtP) {
        this.linkExtP = linkExtP;
    }
    
}
