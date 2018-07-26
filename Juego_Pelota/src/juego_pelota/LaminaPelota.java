/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_pelota;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class LaminaPelota extends JPanel{
    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
    
    public void add(Pelota b){
        pelotas.add(b);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for(Pelota b : pelotas){
            g2.fill(b.getShape());
        }
    }
    
}
