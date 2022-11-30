/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecafei.modelo.dao;

import com.mycompany.bibliotecafei.modelo.DataBaseConnection;
import com.mycompany.bibliotecafei.modelo.pojo.UsuarioBiblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zinedinne
 */
public class UsuarioBibliotecaDAO {
    public boolean registrarUsuario(UsuarioBiblioteca usuarioRegistrado){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = null;
        boolean registroRealizado = false;
        int columnasAfectadas = 0;
        try{
            connection = dataBaseConnection.getConnection();
            String query = "Insert into usuario_biblioteca(id_usuario, nombre, genero, telefono, domicilio, tipo_usuario, correo,periodo) values (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement statement = connection.prepareStatement(query); 
            statement.setString(1, usuarioRegistrado.getIdUsuarioBiblioteca());
            statement.setString(2, usuarioRegistrado.getNombreCompleto());
            statement.setString(3, usuarioRegistrado.getGenero());
            statement.setString(4, usuarioRegistrado.getTelefono());
            statement.setString(5, usuarioRegistrado.getDomicilio());
            statement.setString(6, usuarioRegistrado.getTipoUsuario());
            statement.setString(7, usuarioRegistrado.getCorreo());
            statement.setString(8, "2022-2023");
            columnasAfectadas = statement.executeUpdate();
        }
        catch(SQLException ex){
            Logger.getLogger(UsuarioBibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
          if(connection != null){
            try{
                if(!connection.isClosed()){
                  connection.close();
                }
            }
            catch (SQLException ex){
                Logger.getLogger(UsuarioBibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
          }  
        } 
        if (columnasAfectadas > 0){
            registroRealizado = true;
        }
        return registroRealizado;   
    }
}
