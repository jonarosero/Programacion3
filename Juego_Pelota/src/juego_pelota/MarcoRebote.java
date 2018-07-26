/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_pelota;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class MarcoRebote extends JFrame {

    private LaminaPelota lamina;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Lanzar", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego();
            }
        });
        ponerBoton(laminaBotones, "SALIR", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                System.exit(0);
            }
        });
        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void ponerBoton(Container c, String Titulo, ActionListener oyente) {
        JButton boton = new JButton(Titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }
    
    public void comienza_el_juego(){
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        Runnable r = new PelotaHilos(pelota, lamina);
        Thread t = new Thread(r);
        t.start();
    }

}
