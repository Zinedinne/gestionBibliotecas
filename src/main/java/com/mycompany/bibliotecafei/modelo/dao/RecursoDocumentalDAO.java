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
    
    public static ArrayList<RecursoDocumental> recuperarRecursos() throws SQLException{
        ArrayList<RecursoDocumental> recursosEncontrados = new ArrayList<>();
        Connection conexionBD = DataBaseConnection.getConnection();
        try {
            if(conexionBD != null){
                String busqueda = "SELECT folio, titulo, autor, estado, seccion, tipo_recurso, "
                        + "procedencia FROM recurso_documental";
                PreparedStatement busquedaPreparada  = conexionBD.prepareStatement(busqueda);
                ResultSet resultados = busquedaPreparada.executeQuery();
                while(resultados.next()){
                    RecursoDocumental recursoResultado = new RecursoDocumental();
                    recursoResultado.setIdRecursoDocumental(resultados.getString("folio"));
                    recursoResultado.setAutor(resultados.getString("autor"));
                    recursoResultado.setNombre(resultados.getString("titulo"));
                    recursoResultado.setEstado(resultados.getString("estado"));
                    recursoResultado.setSeccion(resultados.getString("seccion"));
                    recursoResultado.setTipoRecurso(resultados.getString("tipo_recurso"));
                    recursoResultado.setProcedencia(resultados.getString("procedencia"));
                    
                    recursosEncontrados.add(recursoResultado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recursosEncontrados;
    }
    
    public static boolean registroRecurso(RecursoDocumental nuevoRecurso) throws SQLException{
        boolean seInserto = false;
        Connection conexionBD = DataBaseConnection.getConnection();
        if (conexionBD != null){
            try {
                String idRecurso = generarFolio(nuevoRecurso);
                if(validarNuevoID(idRecurso)){
                    String insercion = "INSERT INTO recurso_documental (folio, "
                            + "titulo, tipo_recurso, seccion, procedencia, estado, descripcion, "
                            + "autor) VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement consultaPreparada = conexionBD.prepareStatement(insercion);
                    consultaPreparada.setString(1, nuevoRecurso.getIdRecursoDocumental());
                    consultaPreparada.setString(2, nuevoRecurso.getNombre());
                    consultaPreparada.setString(3, nuevoRecurso.getTipoRecurso());
                    consultaPreparada.setString(4, nuevoRecurso.getSeccion());
                    consultaPreparada.setString(5, nuevoRecurso.getProcedencia());
                    consultaPreparada.setString(6, "Disponible");
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
                String consulta = "SELECT folio FROM recurso_documental WHERE "
                + "folio = ?";
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
