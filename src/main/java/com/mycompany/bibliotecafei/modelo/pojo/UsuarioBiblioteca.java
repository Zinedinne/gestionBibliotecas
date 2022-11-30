package com.mycompany.bibliotecafei.modelo.pojo;

/**
 *
 * @author franz
 */
public class UsuarioBiblioteca {
    private String idUsuarioBiblioteca;
    private String nombreCompleto;
    private String genero;
    private String domicilio;
    private String correo;
    private String telefono;
    private String periodo;
    private String tipoUsuario;

    public UsuarioBiblioteca() {
    }

    public UsuarioBiblioteca(String idUsuarioBiblioteca, String nombreCompleto, String genero, String domicilio, String correo, String telefono, String matricula, String numeroPersonal, String carrera, String periodo, String tipoUsuario) {
        this.idUsuarioBiblioteca = idUsuarioBiblioteca;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.periodo = periodo;
        this.tipoUsuario = tipoUsuario;
    }

    public String getIdUsuarioBiblioteca() {
        return idUsuarioBiblioteca;
    }

    public void setIdUsuarioBiblioteca(String idUsuarioBiblioteca) {
        this.idUsuarioBiblioteca = idUsuarioBiblioteca;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "UsuarioBiblioteca{" + "idUsuarioBiblioteca=" + idUsuarioBiblioteca + ", nombreCompleto=" + nombreCompleto + ", genero=" + genero + ", domicilio=" + domicilio + ", correo=" + correo + ", telefono=" + telefono + ", periodo=" + periodo + ", tipoUsuario=" + tipoUsuario + '}';
    }

    
    
    
}
