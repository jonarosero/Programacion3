/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author USUARIO
 */
public class ManejadorProducto extends Conexiones{
    public boolean Guardar(Producto prod){
        PreparedStatement ps = null;
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (1, 2, 3, 4)";
        Connection con = getConexion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setDouble(3, prod.getPrecio());
            ps.setInt(4, prod.getCantidad());
            
            ps.execute();
            
            return true;
        }catch(Exception e){
            System.err.println(e);
            return false;
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.err.println(e);
            }
        }
        
    }
    
    
    
}
