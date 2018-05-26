/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class InicioGestionCliente {
     public static void main(String[] args) {
         GestionCliente cliente = new GestionCliente();
         cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         cliente.setVisible(true);
     }
    
}
