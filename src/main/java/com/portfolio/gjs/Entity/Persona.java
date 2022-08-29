package com.portfolio.gjs.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min =1, message = "No cumple con el rango de caracteres img")
    private String img;
    
    @NotNull
    @Size(min =1, message = "No cumple con el rango de caracteres imgProfile")
    private String imgProfile;
    
    @NotNull
    @Size(min =1, max=50, message = "No cumple con el rango de caracteres nombre")
    private String nombre;
    
    @NotNull
    @Size(min =1, max=50, message = "No cumple con el rango de caracteres")
    private String apellido;
    
    @NotNull
    @Size(min =1, max=50, message = "No cumple con el rango de caracteres")
    private String titulo;
    
    @NotNull
    @Size(min =1, max=200, message = "No cumple con el rango de caracteres")
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
