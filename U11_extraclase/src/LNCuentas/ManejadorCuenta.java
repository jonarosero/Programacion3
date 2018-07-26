/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import Clases.Catalogo;
import Clases.Cliente;
import Clases.Cuenta;
import DATCuentas.DATCuenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ManejadorCuenta {
    
    public ArrayList<Catalogo> ObtenerTiposCta()throws ClassNotFoundException, SQLException{
        DATCuenta objCuenta = new DATCuenta();
        ResultSet rs = objCuenta.ObtenerRecursos();
        ArrayList<Catalogo> listCatalogo = new ArrayList<>();
        while(rs.next()){
            Catalogo objCat = new Catalogo(rs.getInt(1), rs.getString(2));
            listCatalogo.add(objCat);
        }
        return listCatalogo;
    }
    public Cuenta ObtenerCuenta(String NumeroCta)throws ClassNotFoundException, SQLException{
        DATCuenta objCuenta = new DATCuenta();
        Cuenta objCtaCli = new Cuenta();
        ResultSet rs = objCuenta.ObtenerCuenta(NumeroCta);
        if(rs.next()){
            ArrayList<Cliente> listCliente = new ArrayList<>();
            ResultSet rsR = objCuenta.ObtenerResponsables(NumeroCta);
            while(rsR.next()){
                Cliente objCliente = new Cliente();
                objCliente.setCedula(rsR.getString(1));
                objCliente.setApellidos(rsR.getString(2));
                objCliente.setNombres(rsR.getString(3));
                listCliente.add(objCliente);
            }
            objCtaCli.setNumeroCta(NumeroCta);
            objCtaCli.setFechaApertura(rs.getDate(2));
            objCtaCli.setTipoCta(rs.getString(3));
            objCtaCli.setEstadoCta(rs.getString(4));
            objCtaCli.setSaldo(rs.getDouble(5));
            objCtaCli.setTitularCta(listCliente);
        }
        return objCtaCli;
    }
    
}
