
package com.portfolio.gjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombreP;
    @NotNull
    private String descripcionP;
    @NotNull
    private String linkImgP;
    
    private String linkExtP;
    
    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String linkImg, String linkExt) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkImgP = linkImg;
        this.linkExtP = linkExt;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
