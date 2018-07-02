package DATCuentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class ConexionMySql {
    private final String base = "datos";
    private final String usuario = "usuario";
    private final String clave = "usuario01";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
            
    public Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.clave);
        return con;
    }
}
