package com.mycompany.bibliotecafei.modelo;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {
    private static Connection connection;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE="jdbc:mysql://bibliotecafeei.ciogmkftr3wb.us-east-1.rds.amazonaws.com:3306/biblioteca";
    private static final String USUARIO="admin";
    private static final String PASSWORD="admin123";
    
    public static Connection getConnection() throws SQLException{
        connect();
        return connection;
    }
    
    private static void connect() throws SQLException{
        try {
            Class.forName(DRIVER);
            connection=DriverManager.getConnection(DATABASE,USUARIO,PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(){
        if(connection!=null){
            try {
                if(!connection.isClosed()){
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}