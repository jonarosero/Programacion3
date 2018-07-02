package DATCuentas;

import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DATCliente {
    private ConexionMySql conecta = new ConexionMySql();
    
    public ResultSet ObtenerProvincia() throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM Provincia";
        return consulta.executeQuery(sql);
    }
    
    public ResultSet ObtenerCanton(int IdProvincia) throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM canton WHERE id_provincia = " + IdProvincia;
        return consulta.executeQuery(sql);
    }
    
    public ResultSet ObtenerClienteCed(String Cedula) throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT cedula, apellidos, nombres, fecha_nacimiento, " +
                        "pr.provincia provincia_res, cr.canton canton_res, " +
                        "calle_res, pt.provincia provincia_tra, ct.canton canton_tra, " +
                        "calle_tra " +
                    "FROM Cliente c, Provincia pr, Canton cr, Provincia pt, Canton ct " +
                    "WHERE c.provincia_res = pr.id_provincia " +
                    "AND c.canton_res = cr.id_canton " +
                    "AND c.provincia_tra = pt.id_provincia " +
                    "AND c.canton_tra = ct.id_canton " +
                    "AND c.cedula = '" + Cedula + "'";
        return consulta.executeQuery(sql);
    }
    
    public boolean NuevoCliente(Cliente cli, int IdProR, int IdCanR, int IdProT, int IdCanT) throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "INSERT INTO cliente (cedula, apellidos, nombres, " +
                        "fecha_nacimiento, provincia_res, " +
                        "canton_res, calle_res, " +
                        "provincia_tra, canton_tra, calle_tra) " +
                        "VALUES ('" + cli.getCedula() + "', '" +
                        cli.getApellidos() + "', '" + cli.getNombres() + "', '" +
                        cli.getFechaNacimiento() + "', " + IdProR + ", " +
                        IdCanR + ", '" + cli.getLugarResidencia().getCalle() + "', " +
                        IdProT + ", " + IdCanT + ", '" +
                        cli.getLugarTrabajo().getCalle() + "')";
        return consulta.execute(sql);
    }
    
    public boolean ModificarCliente(Cliente cli, int IdProR, int IdCanR, int IdProT, int IdCanT, String Ced) throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "UPDATE cliente SET cedula = '" + cli.getCedula() + "', " +
            "apellidos = '" + cli.getApellidos() + "', " +
            "nombres = '" + cli.getNombres() + "', " +
            "fecha_nacimiento = '" + cli.getFechaNacimiento() + "', " +
            "provincia_res = " + IdProR + ", " +
            "canton_res = " + IdCanR + ", " +
            "calle_res = '" + cli.getLugarResidencia().getCalle() + "', " +
            "provincia_tra = " + IdProT + ", " +
            "canton_tra = " + IdCanT + ", " +
            "calle_tra = '" + cli.getLugarTrabajo().getCalle() + "'" +
            "WHERE cedula = '" + Ced + "'";
        return consulta.execute(sql);
    }
    
    public boolean EliminarCliente(String Cedula) throws ClassNotFoundException, SQLException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "DELETE FROM cliente WHERE cedula = '" + Cedula + "'";
        return consulta.execute(sql);
    }
}
