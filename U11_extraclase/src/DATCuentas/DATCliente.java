/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import Clases.Cliente;
import Clases.Cuenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class DATCliente {
    private ConexionMysql conecta = new ConexionMysql();
    
    public ResultSet obtenerClienteCedula(String cedula) throws SQLException, ClassNotFoundException{
        String sql = "SELECT c.id_cliente, c.cedula, c.apellidos, c.nombres, c.fecha_nacimiento, "
                + "pr.id provincia_res, cr.canton canton_res, c.calle_residencia calle_res, "
                + "pt.id provincia_tra, ct.id_canton canton_tra, c.calle_trabajo calle_tra "
                + "FROM cliente c, provincia pr, canton cr, provincia pt, canton ct "
                + "WHERE c.provincia_residencia = pr.id "
                + "AND c.canton_residencia = cr.id_canton "
                + "AND c.provincia_trabajo = pt.id "
                + "AND c.canton_trabajo = ct.id_canton "
                + "AND c.cedula = "+cedula;
        Statement consulta = conecta.getConexion().createStatement();
        return consulta.executeQuery(sql);
    }
    
    public ResultSet obtenerProvinvia() throws SQLException, ClassNotFoundException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM provincia";
        return consulta.executeQuery(sql);
    }
    
    public ResultSet obtenerCanton(int IdProvincia) throws SQLException, ClassNotFoundException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT * FROM canton WHERE id = "+IdProvincia;
        return consulta.executeQuery(sql);
    }
    
}
