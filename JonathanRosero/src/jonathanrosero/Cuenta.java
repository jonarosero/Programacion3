/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanrosero;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    private Date fecha;
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Cuenta(Date fecha, int numero, Cliente cliente, double saldo) {
        this.fecha = fecha;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
