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
public class Ahorro extends Cuenta{

    public Ahorro(Date fecha, int numero, Cliente cliente, double saldo) {
        super(fecha, numero, cliente, saldo);
    }
    
    
    @Override
    public String toString() {
        return String.format("\nCuenta de Ahorro\n"
                + "Fecha de creacion: %s\n"
                + "Numero de cuenta: %d\n"
                + "Saldo: %.2f\n"
                + "Cliente: %s\n", this.getFecha(), this.getNumero(), this.getSaldo(), this.getCliente());
    }
    
    
}
