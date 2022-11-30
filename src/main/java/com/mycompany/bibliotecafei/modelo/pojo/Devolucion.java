/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecafei.modelo.pojo;

/**
 *
 * @author super
 */
public class Devolucion {
    private String idPrestamo;
    private String fechaInicio;
    private String fechaEntrega;
    private String folio;
    private String idUsuario;
    private String tipoRecurso;
    private String nombreRecurso;
    private String nombreUsuario;

    public Devolucion() {
    }

    public Devolucion(String idPrestamo, String fechaInicio, String fechaEntrega, String folio, String idUsuario, String tipoRecurso, String nombreRecurso, String nombreUsuario) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.folio = folio;
        this.idUsuario = idUsuario;
        this.tipoRecurso = tipoRecurso;
        this.nombreRecurso = nombreRecurso;
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
    
    
}
