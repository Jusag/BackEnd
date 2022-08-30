package com.portfolio.gjs.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String linkImgP;
    @NotBlank
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
