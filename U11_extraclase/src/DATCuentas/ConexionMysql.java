/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    private final String base = "datos";
    private final String usuario = "utpl";
    private final String clave = "utpl01";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
            
    public Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.clave);
        return con;
    }
}
