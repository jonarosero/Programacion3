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
        if (e.getSource() == frm.btnBuscar){
            String codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto a buscar");
            String result = manejador.Buscar(codigo);
            if(result != null){
                JOptionPane.showMessageDialog(null, "Encontrado el registro: " + result);
            }else{
                JOptionPane.showMessageDialog(null, "No encontrado");
            }
            limpiar();
        }
        if(e.getSource() == frm.btnEliminar){
            String codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto a eliminar");
            if(manejador.Elmininar(codigo)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            limpiar();
        }
        if (e.getSource() == frm.btnModificar){
            prod.setCodigo(frm.textCodigo.getText());
            prod.setNombre(frm.txtNombre.getText());
            prod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
            prod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el id del producto a modificar"));
            if(manejador.Actualizar(prod, id)){
                JOptionPane.showMessageDialog(null, "Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
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
