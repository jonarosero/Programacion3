package DATCuentas;

import LNCuentas.Cuenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class CuentaData {

    public static boolean modificarCliente(Cuenta cuenta, int holderId, String oldID) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "UPDATE `cuentas` SET "
                + "`id`=" + cuenta.getId() + ","
                + "`openningDate`=" + cuenta.getOpenningDate() + ","
                + "`type`='" + cuenta.getType() + "',"
                + "`active`=" + cuenta.getActive() + ","
                + "`holderId`=" + holderId + " "
                + " WHERE id =" + oldID;
        return consulta.execute(sql);
    }

    public static boolean nuevoCliente(Cuenta cuenta, int holderId) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "INSERT INTO `Cuentas`(`id`, `openningDate`, "
                + "`type`, `active`, `holderId`) VALUES ('"
                + cuenta.getId() + "', '" + cuenta.getOpenningDate() + "', '"
                + cuenta.getType() + "', '" + cuenta.getActive() + "', '"
                + holderId + "')";
        return consulta.execute(sql);
    }

    public static ResultSet buscarCliente(String id) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT id, openningDate, type, active, holderId FROM `cuentas` WHERE id = '" + id + "'";
        return consulta.executeQuery(sql);
    }
}
