/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ManejadorProducto;
import modelo.Producto;
import vista.frmProducto;

/**
 *
 * @author USUARIO
 */
public class ControlProducto implements ActionListener{
    private Producto prod;
    private ManejadorProducto manejador;
    private frmProducto frm;

    public ControlProducto(Producto prod, ManejadorProducto manejador, frmProducto frm) {
        this.prod = prod;
        this.manejador = manejador;
        this.frm = frm;
        
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        
    }
    public void Iniciar(){
        frm.setTitle("Gestion de Productos");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar){
            prod.setCodigo(frm.textCodigo.getText());
            prod.setNombre(frm.txtNombre.getText());
            prod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
            prod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            if(manejador.Guardar(prod)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            limpiar();
        }
    }
    
    public void limpiar(){
        frm.textCodigo.setText(null);
        frm.txtNombre.setText(null);
        frm.txtPrecio.setText(null);
        frm.txtCantidad.setText(null);
    }
}
