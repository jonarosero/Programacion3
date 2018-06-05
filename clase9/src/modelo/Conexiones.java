/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Conexiones {
    private final String base = "datos";
    private final String usuario = "utpl";
    private final String clave = "utpl01";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
        }catch(Exception e){
            System.err.print(e);
        }
        return con;
    }
}
