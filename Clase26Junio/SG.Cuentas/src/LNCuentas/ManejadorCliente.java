/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import Clases.Canton;
import Clases.Cliente;
import Clases.Direccion;
import Clases.Provincia;
import DATCuentas.DATCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author mesucunuta
 */
public class ManejadorCliente {
    public ArrayList<Provincia> ObtenerProvincia() throws ClassNotFoundException, SQLException {
        ArrayList<Provincia> listProvincias = new ArrayList<Provincia>();
        DATCliente objCliente = new DATCliente();
        ResultSet rs = objCliente.ObtenerProvincia();
        while (rs.next()) {
            Provincia objProvincia = new Provincia(rs.getInt(1), rs.getString(2));
            listProvincias.add(objProvincia);
        }        
        return listProvincias;
    }
    
    public ArrayList<Canton> ObtenerCanton(int IdProvincia) throws ClassNotFoundException, SQLException {
        ArrayList<Canton> listCanton = new ArrayList<Canton>();
        DATCliente objCliente = new DATCliente();
        ResultSet rs = objCliente.ObtenerCanton(IdProvincia);
        while (rs.next()) {
            Canton objCanton = new Canton(rs.getInt("id_canton"), rs.getInt("id_provincia"), rs.getString("canton"));
            listCanton.add(objCanton)
;        }
        return listCanton;
    } 
    
    
    
    public Cliente ObtenerClienteCed(String Cedula) throws ClassNotFoundException, SQLException {
        DATCliente objClienteCed = new DATCliente();
        Cliente objCliente = new Cliente();       
        
        ResultSet rs = objClienteCed.ObtenerClienteCed(Cedula);
        if (rs.next()) {
            Direccion objDirRes = new Direccion(rs.getString("provincia_res"), rs.getString("canton_res"), rs.getString("calle_res"));
            Direccion objDirTra = new Direccion(rs.getString("provincia_tra"), rs.getString("canton_tra"), rs.getString("calle_tra"));
            objCliente.setCedula(rs.getString("cedula"));
            objCliente.setApellidos(rs.getString("apellidos"));
            objCliente.setNombres(rs.getString("nombres"));
            objCliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            objCliente.setLugarResidencia(objDirRes);
            objCliente.setLugarTrabajo(objDirTra);
            return objCliente;
        }
        return null;
     
    }
    
    public boolean NuevoCliente (Cliente cli, int IdProR, int IdCanR, int IdProT, int IdCanT) throws ClassNotFoundException, SQLException {
        DATCliente objCliente = new DATCliente();
        return objCliente.NuevoCliente(cli, IdProR, IdCanR, IdProT, IdCanT);
    }
    
    public boolean ModificarCliente (Cliente cli, int IdProR, int IdCanR, int IdProT, int IdCanT, String Ced) throws ClassNotFoundException, SQLException {
        DATCliente objCliente = new DATCliente();
        return objCliente.ModificarCliente(cli, IdProR, IdCanR, IdProT, IdCanT, Ced);

    }
    
    public boolean EliminarCliente (String Ced) throws ClassNotFoundException, SQLException {
        DATCliente objCliente = new DATCliente();
        return objCliente.EliminarCliente(Ced);
    }
}