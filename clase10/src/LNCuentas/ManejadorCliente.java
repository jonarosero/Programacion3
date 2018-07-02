/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import DATA.DATCliente;
import clases.Canton;
import clases.Cliente;
import clases.Direccion;
import clases.Provincia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ManejadorCliente {

    public Cliente getCliente(String cedula) throws SQLException, ClassNotFoundException {
        DATCliente clienteCed = new DATCliente();
        ResultSet rs = clienteCed.obtenerClienteCedula(cedula);
        Cliente c = new Cliente();
        while(rs.next()){
            Direccion dirRes = new Direccion(rs.getString("provincia_res"), rs.getString("canton_res"), rs.getString("calle_res"));
            Direccion dirTra = new Direccion(rs.getString("provincia_tra"), rs.getString("canton_tra"), rs.getString("calle_tra"));
            c.setCedula(rs.getString("cedula"));
            c.setApellidos(rs.getString("apellidos"));
            c.setNombres(rs.getString("nombres"));
            c.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            c.setDirRes(dirRes);
            c.setDirTra(dirTra);
        }
        
        
        return c;

    }
    public ArrayList<Provincia> ObtenerProvincia() throws SQLException, ClassNotFoundException{
        ArrayList<Provincia> listProvincias = new ArrayList<Provincia>();
        DATCliente objCliente = new DATCliente();
        ResultSet rs = objCliente.obtenerProvinvia();
        while(rs.next()){
            Provincia objProvincia = new Provincia(rs.getInt(1), rs.getString(2));
            listProvincias.add(objProvincia);
        }
        return listProvincias;
        
    }
    public ArrayList<Canton> ObtenerCanton(int IdProvincia) throws SQLException, ClassNotFoundException{
        ArrayList<Canton> listCantones = new ArrayList<Canton>();
        DATCliente objCliente = new DATCliente();
        ResultSet rs = objCliente.obtenerCanton(IdProvincia);
        while(rs.next()){
            Canton objCanton = new Canton(rs.getInt("id_canton"), rs.getInt("id"), rs.getString("canton"));
            listCantones.add(objCanton);
        }
        return listCantones;
    }

}
