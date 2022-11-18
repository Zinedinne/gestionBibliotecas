/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecafei.modelo.dao;

import com.mycompany.bibliotecafei.modelo.DataBaseConnection;
import com.mycompany.bibliotecafei.modelo.pojo.RecursoDocumental;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author super
 */
public class RecursoDocumentalDAO {
    public static ArrayList<RecursoDocumental> busquedaRecursoPorNombre(String titulo) throws SQLException{
        ArrayList<RecursoDocumental> recursosEncontrados = null;
        Connection conexionBD = DataBaseConnection.getConnection();
//        try {
//            
//        } catch (SQLException e) {
//        }
        return recursosEncontrados;
    }
    
    public static boolean registroRecurso(RecursoDocumental nuevoRecurso) throws SQLException{
        boolean seInserto = false;
        Connection conexionBD = DataBaseConnection.getConnection();
        if (conexionBD != null){
            try {
                String idRecurso = generarFolio(nuevoRecurso);
                if(validarNuevoID(idRecurso)){
                    String insercion = "INSERT INTO recursoDocumental (idRecursoDocumental, "
                            + "nombre, tipoRecurso, seccion, procedencia, estado, descripcion, "
                            + "autor) VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement consultaPreparada = conexionBD.prepareStatement(insercion);
                    consultaPreparada.setString(1, nuevoRecurso.getIdRecursoDocumental());
                    consultaPreparada.setString(2, nuevoRecurso.getNombre());
                    consultaPreparada.setString(3, nuevoRecurso.getTipoRecurso());
                    consultaPreparada.setString(4, nuevoRecurso.getSeccion());
                    consultaPreparada.setString(5, nuevoRecurso.getProcedencia());
                    consultaPreparada.setString(6, "disponible");
                    consultaPreparada.setString(7, nuevoRecurso.getDescripcion());
                    consultaPreparada.setString(8, nuevoRecurso.getAutor());
                    consultaPreparada.execute();
                    seInserto = true;
                }else{
                    throw new SQLException("Ya hay un registro del recurso documental");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                conexionBD.close();
            }
        }
        return seInserto;
    }
    
    public static ArrayList<RecursoDocumental> recuperarCatalogoGeneral(){
        ArrayList<RecursoDocumental> catalogo = null;
        
        return catalogo;
    }
    
    public static String generarFolio(RecursoDocumental nuevoRecurso){
        String folio = "";
        folio = primeraLetraTitulo(nuevoRecurso.getNombre());
        folio = folio + primeraLetraAutor(nuevoRecurso.getAutor());
        folio = folio + letrasTipoRecurso(nuevoRecurso.getTipoRecurso());
        folio = folio + letrasDeSeccion(nuevoRecurso.getSeccion());
        return folio;
    }
    
    public static String primeraLetraTitulo(String titulo){
        String codigo = "";
        String [] aux= titulo.split(" ");
        for (int i =0; i<aux.length; i++){
            codigo =  codigo + aux[i].charAt(0);
        }
        return codigo;
    }
    
    public static String primeraLetraAutor(String autor){
        String codigo = "";
        autor.charAt(0);
        return codigo;
    }
    
    public static String letrasTipoRecurso (String tipoRecurso){
        String codigo = tipoRecurso.substring(0, 2);
        return codigo;
    }
    
    public static String letrasDeSeccion(String seccion){
        String codigo = seccion.substring(0, 2);
        return codigo;
    }
    
    public static boolean validarNuevoID(String idRecurso) throws SQLException{
        boolean valido = false;
        Connection conexionBD = DataBaseConnection.getConnection();
        if (conexionBD != null){
            try {
                String consulta = "SELECT idRecursoDocumental from WHERE "
                + "idRecursoDocumental = ?";
                PreparedStatement consultaObtenerId = conexionBD.prepareStatement(consulta);
                consultaObtenerId.setString(1, idRecurso);
                ResultSet resultadoConsulta = consultaObtenerId.executeQuery();
                if(resultadoConsulta.next() == false){
                    valido = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                conexionBD.close();
            }
        }
        return valido;
    }
}
