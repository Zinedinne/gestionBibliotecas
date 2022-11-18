package com.mycompany.bibliotecafei.modelo.pojo;

/**
 *
 * @author franz
 */
public class UsuarioStaff {
    
    private int idUsuarioStaff;
    private String nombreUsuarioStaff;
    private String tipoUsuario;
    private String nombreUsuario;
    private String password;

    public UsuarioStaff() {
    }        

    public UsuarioStaff(String nombreUsuarioStaff, String nombreUsuario, String password) {
        this.nombreUsuarioStaff = nombreUsuarioStaff;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuarioStaff() {
        return nombreUsuarioStaff;
    }

    public void setNombreUsuarioStaff(String nombreUsuarioStaff) {
        this.nombreUsuarioStaff = nombreUsuarioStaff;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
