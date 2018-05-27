/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u8_extraclase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Lectura {

    private Scanner scan;

    public void abrir() {

        try {
            scan = new Scanner(new File("datos.csv"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }

    }
    
    public ArrayList<String> obtenerData() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            while (scan.hasNext()) {
                String cadena = scan.nextLine();
                ArrayList<String> registro = new ArrayList<>(Arrays.asList(cadena.split("\\|")));
                lista.add(registro.get(0));
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            scan.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
        return lista;
    }
    
    public void cerrarArchivo(){
        if (scan != null)
            scan.close();
    }

}
