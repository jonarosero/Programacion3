/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "cuentacliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentacliente.findAll", query = "SELECT c FROM Cuentacliente c")
    , @NamedQuery(name = "Cuentacliente.findById", query = "SELECT c FROM Cuentacliente c WHERE c.id = :id")
    , @NamedQuery(name = "Cuentacliente.findByHolderID", query = "SELECT c FROM Cuentacliente c WHERE c.holderID = :holderID")
    , @NamedQuery(name = "Cuentacliente.findByAccountID", query = "SELECT c FROM Cuentacliente c WHERE c.accountID = :accountID")})
public class Cuentacliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "holderID")
    private int holderID;
    @Basic(optional = false)
    @Column(name = "accountID")
    private int accountID;

    public Cuentacliente() {
    }

    public Cuentacliente(Integer id) {
        this.id = id;
    }

    public Cuentacliente(Integer id, int holderID, int accountID) {
        this.id = id;
        this.holderID = holderID;
        this.accountID = accountID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHolderID() {
        return holderID;
    }

    public void setHolderID(int holderID) {
        this.holderID = holderID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentacliente)) {
            return false;
        }
        Cuentacliente other = (Cuentacliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cuentacliente[ id=" + id + " ]";
    }
    
}
