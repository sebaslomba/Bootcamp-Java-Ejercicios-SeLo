package com.roshka.demo.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "postulante")
public class PostulanteModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String nombre;
    private String apellido;
    private int nroCedula;
    private String correo;
    private String telefono;
    private String direccion;
    private boolean estudioUniversitario;
    private boolean notebook;
    private int bootcampId;
    private boolean aceptado;
    private boolean expLaboral;




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

    public int getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstudioUniversitario() {
        return estudioUniversitario;
    }

    public void setEstudioUniversitario(boolean estudioUniversitario) {
        this.estudioUniversitario = estudioUniversitario;
    }

    public boolean isNotebook() {
        return notebook;
    }

    public void setNotebook(boolean notebook) {
        this.notebook = notebook;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public boolean isExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(boolean expLaboral) {
        this.expLaboral = expLaboral;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
