/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u8_extraclase;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class U8_extraclase {

    /**
     * @param args the command line arguments
     */
    public static void escribir(){
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        aplicacion.abrirArchivo();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Azuay");
        lista.add("Bolivar");
        lista.add("Cañar");
        lista.add("Carchi");
        lista.add("Chimborazo");
        lista.add("Cotopaxi");
        lista.add("El Oro");
        lista.add("Esmeraldas");
        lista.add("Galapagos");
        lista.add("Guayas");
        lista.add("Imbabura");
        lista.add("Loja");
        lista.add("Los Ríos");
        lista.add("Manabí");
        lista.add("Morona Santiago");
        lista.add("Napo");
        lista.add("Orellana");
        lista.add("Pastaza");
        lista.add("Pichincha");
        lista.add("Santa Elena");
        lista.add("Santo Domingo");
        lista.add("Sucumbíos");
        lista.add("Tungurahua");
        lista.add("Zamora Chinchipe");
        
        aplicacion.agregarRegistros(lista);
        aplicacion.cerrarArchivo();
        
    }
     
    public static String[] transformar_array(ArrayList<String> l) {
        String arreglo[] = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arreglo[i] = l.get(i);
        }
        return arreglo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        escribir();
        Lectura m = new Lectura();
        m.abrir();
        ArrayList<String> array = m.obtenerData();
        
        
        GestionCliente cliente = new GestionCliente(transformar_array(array));
        cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cliente.setVisible(true);    
        
        m.cerrarArchivo();
    }
    
}


