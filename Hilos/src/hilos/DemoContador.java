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
public class DemoContador {

    public static void main(String[] args) {
////         Contador Hilo1 = new Contador(1, 10, "HILO 1");
////         Contador Hilo2 = new Contador(10, 20, "HILO 2");
////         System.out.println("Inicio multitarea");
////         Hilo1.start();
////         Hilo2.start();
        Contador2 cont = new Contador2(10,20, "Contador 1");
        Contador2 cont2 = new Contador2(10,20, "Contador 2");
        Contador2 cont3 = new Contador2(0,150, "Contador 3");
        
        Thread Hilo1 = new Thread(cont);
        Thread Hilo2 = new Thread(cont2);
        Thread Hilo3 = new Thread(cont3);
        
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
    }

}
