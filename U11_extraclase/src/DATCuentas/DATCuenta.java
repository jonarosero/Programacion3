/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class DATCuenta {

    private ConexionMysql conecta = new ConexionMysql();

    public ResultSet ObtenerRecursos() throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT dc.id_detCatalogo, dc.detalle "
                + "FROM catalogo ca, detcatalogo dc "
                + "WHERE ca.id_catalogo = dc.id_catalogo "
                + "AND ca.catalogo = 'TIPOCUENTA'";
        return consulta.executeQuery(sql);
    }

    public ResultSet ObtenerCuenta(String NumeroCta) throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT c.numero, dc.detalle tipo, c.fecha, dce.detalle estado, c.saldo"
                + "FROM cuenta c, detcatalogo dc, detcatalogo dce"
                + "WHERE c.numero = '" + NumeroCta + "' "
                + "and c.tipo = dc.id_detCatalogo"
                + "AND c.estado_cta = dce.id_detCatalogo";
        return consulta.executeQuery(sql);

    }

    public ResultSet ObtenerResponsables(String NumeroCta) throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT cl.cedula, cl.apellidos, cl.nombres"
                + "FROM cuenta cu, cuentacliente cc, cliente cl"
                + "WHERE cu.numero = '" + NumeroCta + "'"
                + "AND cu.id_cuenta = cc.id_cuenta"
                + "AND cc.id_cliente = cl.id_cliente";
        return consulta.executeQuery(sql);
    }

}
