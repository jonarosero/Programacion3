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
@Table(name = "cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")
    , @NamedQuery(name = "Cuentas.findById", query = "SELECT c FROM Cuentas c WHERE c.id = :id")
    , @NamedQuery(name = "Cuentas.findByDate", query = "SELECT c FROM Cuentas c WHERE c.date = :date")
    , @NamedQuery(name = "Cuentas.findByTypeID", query = "SELECT c FROM Cuentas c WHERE c.typeID = :typeID")
    , @NamedQuery(name = "Cuentas.findByStateID", query = "SELECT c FROM Cuentas c WHERE c.stateID = :stateID")
    , @NamedQuery(name = "Cuentas.findByNumber", query = "SELECT c FROM Cuentas c WHERE c.number = :number")
    , @NamedQuery(name = "Cuentas.findByBalance", query = "SELECT c FROM Cuentas c WHERE c.balance = :balance")})
public class Cuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "typeID")
    private int typeID;
    @Basic(optional = false)
    @Column(name = "stateID")
    private int stateID;
    @Basic(optional = false)
    @Column(name = "number")
    private int number;
    @Basic(optional = false)
    @Column(name = "balance")
    private long balance;

    public Cuentas() {
    }

    public Cuentas(Integer id) {
        this.id = id;
    }

    public Cuentas(Integer id, Date date, int typeID, int stateID, int number, long balance) {
        this.id = id;
        this.date = date;
        this.typeID = typeID;
        this.stateID = stateID;
        this.number = number;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
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
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cuentas[ id=" + id + " ]";
    }
    
}
