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
    
    public ResultSet ObtenerCuenta(int numero)throws ClassNotFoundException, SQLException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT c.id_cuenta c.numero, c.tipo, c.fecha, t.cedula, t.nombre, t.apellido FROM cuenta c, titular t WHERE c.id_cuenta = t.id_cuenta AND c.id_cuenta = '"+numero+"'";
        return consulta.executeQuery(sql);
    }
    
    public ResultSet ObtenerTitular(int cedula)throws ClassNotFoundException, SQLException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "SELECT t.cedula, t.nombre, t.apellido FROM titular t WHERE t.cedula = '"+cedula+"'";
        return consulta.executeQuery(sql);
    }
    
    public boolean NuevaCuenta(Cuenta cuenta)throws ClassNotFoundException, SQLException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "INSERT INTO cuenta(numero, tipo, fecha) VALUES ('"+cuenta.getNumero()+"', '"+cuenta.getTipo()+"', "+cuenta.getFecha()+"')";
        return consulta.execute(sql);
    }
    
    public boolean AgregarCliente(Cliente cliente, int id)throws ClassNotFoundException, SQLException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "INSERT INTO titular(id_cuenta, cedula, nombre, apellido) VALUES ('"+id+"', '"+cliente.getCedula()+"', '"+cliente.getNombres()+"', '"+cliente.getApellidos()+"' )";
        return consulta.execute(sql);
    }
    
}
