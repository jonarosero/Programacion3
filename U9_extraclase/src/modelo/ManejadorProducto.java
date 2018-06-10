/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author USUARIO
 */
public class ManejadorProducto extends Conexiones{
    public boolean Guardar(Producto prod){
        PreparedStatement ps = null;
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)";
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
    
    public String Buscar(String codigo){
        PreparedStatement ps = null;
        String sql = "SELECT * FROM `producto` WHERE `producto`.`codigo` = ?";
        Connection con = getConexion();
        String result = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String cod = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt ("cantidad");
                result = String.format("\nid: %d\n"
                        + "codigo: %s\n"
                        + "nombre: %s\n"
                        + "precio: %.2f\n"
                        + "cantidad: %d\n", id, cod, nombre, precio, cantidad);
            }
            return result;
        }catch(Exception e){
            System.err.println(e);
            return result;
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.err.println(e);
            }
        }
    }
    
    public boolean Elmininar(String codigo){
        PreparedStatement ps = null;
        String sql = "DELETE FROM `producto` WHERE `producto`.`codigo` = ?";
        Connection con = getConexion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
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
    public boolean Actualizar(Producto prod, int id){
        PreparedStatement ps = null;
        String sql = "UPDATE `producto` SET `codigo` = ?, `nombre` = ?, `precio` = ?, `cantidad` = ? WHERE `producto`.`id` = "+ id;
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
