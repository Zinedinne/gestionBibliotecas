package com.mycompany.bibliotecafei.modelo.pojo;

/**
 *
 * @author franz
 */
public class RecursoDocumental {
    private String idRecursoDocumental;
    private String nombre;
    private String tipoRecurso;
    private String seccion;
    private String procedencia;
    private String estado;
    private String descripcion;
    private String autor;

    public RecursoDocumental() {
    }

    public RecursoDocumental(String idRecursoDocumental, String nombre, String tipoRecurso, String seccion, String procedencia, String estado, String descripcion, String autor) {
        this.idRecursoDocumental = idRecursoDocumental;
        this.nombre = nombre;
        this.tipoRecurso = tipoRecurso;
        this.seccion = seccion;
        this.procedencia = procedencia;
        this.estado = estado;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public String getIdRecursoDocumental() {
        return idRecursoDocumental;
    }

    public void setIdRecursoDocumental(String idRecursoDocumental) {
        this.idRecursoDocumental = idRecursoDocumental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
