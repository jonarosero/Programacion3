/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion residencia;
    private Direccion trabajo;

    public Cliente(String cedula, String nombre, String apellido, Direccion residencia, Direccion trabajo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.residencia = residencia;
        this.trabajo = trabajo;
    }
    

    
    
}
