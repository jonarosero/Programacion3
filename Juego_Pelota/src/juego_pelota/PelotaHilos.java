/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_pelota;

import java.awt.Component;

public class PelotaHilos implements Runnable{
    private Pelota pelota;
    private Component  componente;

    public PelotaHilos(Pelota pelota, Component componente) {
        this.pelota = pelota;
        this.componente = componente;
    }
    
     public void run(){
         for (int i = 0; i <= 3000; i++) {
            pelota.MuevePelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            try{
                Thread.sleep(4);
            }catch(Exception e){
                
            }
            
        }
     }
}
