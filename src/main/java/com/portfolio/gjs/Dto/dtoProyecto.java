package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotNull;

public class dtoProyecto {
    @NotNull
    private String nombreP;
    @NotNull
    private String descripcionP;
    @NotNull
    private String linkImg;
    
    private String linkExt;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String linkImg, String linkExt) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkImg = linkImg;
        this.linkExt = linkExt;
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

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public String getLinkExt() {
        return linkExt;
    }

    public void setLinkExt(String linkExt) {
        this.linkExt = linkExt;
    }
    
}
