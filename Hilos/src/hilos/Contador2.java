/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author USUARIO
 */
public class Contador2 implements Runnable{
    private int inicio;
    private int fin;
    private String nombre;

    public Contador2(int inicio, int fin, String nombre) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }
    
    public void run(){
        System.out.println("Contador 2 " + this.nombre + " empieza...");
        for (int i = this.inicio; i < this.fin; i++) {
            System.out.println(this.nombre + "-- act: " + i);
//            try{
//                Thread.sleep(4000);
//            }catch(Exception e){
//                
//            }
            
        }
        System.out.println("Contador 2 Fin --"+ nombre);
    }
    
}
