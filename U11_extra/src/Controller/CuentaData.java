package Controller;

import Controller.ConexionMySql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class CuentaData {

    public static ResultSet buscarCuentaByNumber(Integer id) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM `cuentas` WHERE number = '" + id + "'";
        return consulta.executeQuery(sql);
    }

    public static ResultSet buscarClienteID(Integer id) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM `cliente` WHERE id_cliente = '" + id + "'";
        return consulta.executeQuery(sql);
    }

    public static ResultSet buscarClienteCID(Integer id) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM `cliente` WHERE cedula = '" + id + "'";
        return consulta.executeQuery(sql);
    }

    static ResultSet buscarCuentaCliente(int id) throws SQLException, ClassNotFoundException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM `cuentacliente`WHERE accountID = '" + id + "'";
        return consulta.executeQuery(sql);
    }

    static int removeCuentaCliente(int idCuenta, int idCliente) throws SQLException, ClassNotFoundException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "DELETE FROM `cuentacliente` WHERE holderID = '" + idCliente + "' AND accountID = '" + idCuenta + "'";
        return consulta.executeUpdate(sql);
    }

    static ResultSet buscarCuentaClienteByIDs(int cuentaID, int clienteID) throws ClassNotFoundException, SQLException {
        ConexionMySql conecta = new ConexionMySql();
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM `cuentacliente` WHERE holderID = '" + clienteID + "' AND accountID = '" + cuentaID + "'";
        return consulta.executeQuery(sql);
    }
}
