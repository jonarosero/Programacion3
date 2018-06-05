/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import controlador.ControlProducto;
import modelo.ManejadorProducto;
import modelo.Producto;
import vista.frmProducto;

/**
 *
 * @author USUARIO
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto pro = new Producto();
        ManejadorProducto manejador = new ManejadorProducto();
        frmProducto frm = new frmProducto();
        ControlProducto control = new ControlProducto(pro, manejador, frm);
        control.Iniciar();
        frm.setVisible(true);
    }
    
}
