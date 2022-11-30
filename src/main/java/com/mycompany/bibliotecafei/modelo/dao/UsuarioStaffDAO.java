package com.mycompany.bibliotecafei.modelo.dao;

import com.mycompany.bibliotecafei.modelo.DataBaseConnection;
import com.mycompany.bibliotecafei.modelo.pojo.UsuarioStaff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Zinedinne
 */
public class UsuarioStaffDAO {
    final String GETONE = "SELECT * FROM usuario_staff WHERE nombre_usuario = ?";
     public UsuarioStaff accederSistema(UsuarioStaff usuario) { 
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        UsuarioStaff usuarioEncontrado = new UsuarioStaff();
        try (Connection connection = dataBaseConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(GETONE);
            statement.setString(1, usuario.getNombreUsuario());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next() == false) {
                throw new SQLException ("No se encontraron registros");
            }
            else {
                String tipoUsuarioEncontrada = "";

                
                usuarioEncontrado.setTipoUsuario(tipoUsuarioEncontrada);
                if(resultSet.getString("password").equals(usuario.getPassword()) && resultSet.getString("nombre_usuario").equals(usuario.getNombreUsuario())){
                    tipoUsuarioEncontrada = resultSet.getString("tipo_usuario");
                    
                    usuarioEncontrado.setTipoUsuario(tipoUsuarioEncontrada);
                  
                    } else {
                           throw new SQLException ("No se encontraron registros");
                        }
                
            }
        }
        catch (SQLException ex){
            java.util.logging.Logger.getLogger(UsuarioStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarioEncontrado;
    }
        
}
