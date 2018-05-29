/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanrosero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir = new Direccion("Azogues", "Cuenca", "10 de Agosto");
        Direccion dir2 = new Direccion("Loja", "Loja", "24 de Mayo");
        
        Cliente persona1 = new Persona(11041205, "Valdez", "Juan", dir);
        Cliente persona2 = new Persona(11012345, "Hurtado", "Jorge", dir2);
        Cliente persona3 = new Persona(13213211, "Ortiz", "Bruno", dir);
        Cliente persona4 = new Persona(12132451, "Carchi", "Luis", dir2);
        Cliente persona5 = new Persona(55313546, "Soto", "Pedro", dir);
        Cliente persona6 = new Persona(12314145, "Rojas", "Andres", dir2);
        
        Cliente empresa1 = new Empresa(1121354654, "Software", persona1, dir);
        Cliente empresa2 = new Empresa(1341432425, "Seguridad", persona3, dir2);
        Cliente empresa3 = new Empresa(1354648494, "Cine", persona5, dir);
        
        Date f = new Date(2018-1900, 5, 8, 9, 53);
        Date f2 = new Date(2018-1900, 5, 29, 4, 43);
        
        Cuenta cuenta1 = new Ahorro(f, 1, persona2, 15);
        Cuenta cuenta2 = new Ahorro(f2, 2, persona4, 100);
        Cuenta cuenta3 = new Ahorro(f, 3, persona6, 200);
        Cuenta cuenta4 = new Corriente(f2, 4, empresa1, 150);
        Cuenta cuenta5 = new Corriente(f, 5, empresa3, 300);
        
        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        lista.add(cuenta1);
        lista.add(cuenta2);
        lista.add(cuenta3);
        lista.add(cuenta4);
        lista.add(cuenta5);
        
        CrearArchivo archivo = new CrearArchivo();
        archivo.abrirArchivo();
        archivo.agregarRegistros(lista);
        archivo.cerrarArchivo();
        
        System.out.println(lista);
    }
    
}
