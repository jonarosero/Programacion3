/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    private String NumeroCta;
    private Date FechaApertura;
    private String TipoCta;
    private String EstadoCta;
    private double Saldo;
    private ArrayList<Cliente> TitularCta;

    public String getNumeroCta() {
        return NumeroCta;
    }

    public void setNumeroCta(String NumeroCta) {
        this.NumeroCta = NumeroCta;
    }

    public Date getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Date FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public String getTipoCta() {
        return TipoCta;
    }

    public void setTipoCta(String TipoCta) {
        this.TipoCta = TipoCta;
    }

    public String getEstadoCta() {
        return EstadoCta;
    }

    public void setEstadoCta(String EstadoCta) {
        this.EstadoCta = EstadoCta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public ArrayList<Cliente> getTitularCta() {
        return TitularCta;
    }

    public void setTitularCta(ArrayList<Cliente> TitularCta) {
        this.TitularCta = TitularCta;
    }

    @Override
    public String toString() {
        return this.TipoCta;
    }
    
}
