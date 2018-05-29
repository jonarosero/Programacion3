/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanrosero;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;

/**
 *
 * @author USUARIO
 */
public class CrearArchivo{

    private Formatter salida; // objeto usado para enviar texto al archivo

    public void abrirArchivo() {
        try {
            // salida = new Formatter("registrosNN.txt");
            salida = new Formatter(new FileWriter("datos.ser"));

        } catch (SecurityException securityException) {
            System.err.println("No se tiene acceso de escritura a este archivo");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear archivo");
            System.exit(1);

        } catch (IOException e) {
            System.err.println("Error al crear archivo");
            System.exit(1);
        }
    }

    public void agregarRegistros(ArrayList<Cuenta> lista) {

        for (int i = 0; i < lista.size(); i++) {

            try {

                salida.format("%s\n", lista.get(i));

            } catch (NoSuchElementException noSuchElementException) {
                System.out.println("Entrada inválida.Intente de nuevo");
            }
        }

    }

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    }
}
