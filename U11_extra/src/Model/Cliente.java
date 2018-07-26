/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByCedula", query = "SELECT c FROM Cliente c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Cliente.findByApellidos", query = "SELECT c FROM Cliente c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Cliente.findByNombres", query = "SELECT c FROM Cliente c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Cliente.findByFechaNacimiento", query = "SELECT c FROM Cliente c WHERE c.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Cliente.findByProvinciaResidencia", query = "SELECT c FROM Cliente c WHERE c.provinciaResidencia = :provinciaResidencia")
    , @NamedQuery(name = "Cliente.findByCantonResidencia", query = "SELECT c FROM Cliente c WHERE c.cantonResidencia = :cantonResidencia")
    , @NamedQuery(name = "Cliente.findByCalleResidencia", query = "SELECT c FROM Cliente c WHERE c.calleResidencia = :calleResidencia")
    , @NamedQuery(name = "Cliente.findByProvinciaTrabajo", query = "SELECT c FROM Cliente c WHERE c.provinciaTrabajo = :provinciaTrabajo")
    , @NamedQuery(name = "Cliente.findByCantonTrabajo", query = "SELECT c FROM Cliente c WHERE c.cantonTrabajo = :cantonTrabajo")
    , @NamedQuery(name = "Cliente.findByCalleTrabajo", query = "SELECT c FROM Cliente c WHERE c.calleTrabajo = :calleTrabajo")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "provincia_residencia")
    private int provinciaResidencia;
    @Basic(optional = false)
    @Column(name = "canton_residencia")
    private int cantonResidencia;
    @Basic(optional = false)
    @Column(name = "calle_residencia")
    private String calleResidencia;
    @Basic(optional = false)
    @Column(name = "provincia_trabajo")
    private int provinciaTrabajo;
    @Basic(optional = false)
    @Column(name = "canton_trabajo")
    private int cantonTrabajo;
    @Basic(optional = false)
    @Column(name = "calle_trabajo")
    private String calleTrabajo;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String cedula, String apellidos, String nombres, Date fechaNacimiento, int provinciaResidencia, int cantonResidencia, String calleResidencia, int provinciaTrabajo, int cantonTrabajo, String calleTrabajo) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.provinciaResidencia = provinciaResidencia;
        this.cantonResidencia = cantonResidencia;
        this.calleResidencia = calleResidencia;
        this.provinciaTrabajo = provinciaTrabajo;
        this.cantonTrabajo = cantonTrabajo;
        this.calleTrabajo = calleTrabajo;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getProvinciaResidencia() {
        return provinciaResidencia;
    }

    public void setProvinciaResidencia(int provinciaResidencia) {
        this.provinciaResidencia = provinciaResidencia;
    }

    public int getCantonResidencia() {
        return cantonResidencia;
    }

    public void setCantonResidencia(int cantonResidencia) {
        this.cantonResidencia = cantonResidencia;
    }

    public String getCalleResidencia() {
        return calleResidencia;
    }

    public void setCalleResidencia(String calleResidencia) {
        this.calleResidencia = calleResidencia;
    }

    public int getProvinciaTrabajo() {
        return provinciaTrabajo;
    }

    public void setProvinciaTrabajo(int provinciaTrabajo) {
        this.provinciaTrabajo = provinciaTrabajo;
    }

    public int getCantonTrabajo() {
        return cantonTrabajo;
    }

    public void setCantonTrabajo(int cantonTrabajo) {
        this.cantonTrabajo = cantonTrabajo;
    }

    public String getCalleTrabajo() {
        return calleTrabajo;
    }

    public void setCalleTrabajo(String calleTrabajo) {
        this.calleTrabajo = calleTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
