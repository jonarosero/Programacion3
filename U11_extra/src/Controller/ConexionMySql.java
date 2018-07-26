package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySql {
    private final String base = "data";
    private final String usuario = "root";
    private final String clave = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
            
    public Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.clave);
        return con;
    }
}
