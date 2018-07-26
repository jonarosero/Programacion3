/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controlador.exceptions.NonexistentEntityException;
import Model.Cuentacliente;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USUARIO
 */
public class CuentaclienteJpaController implements Serializable {

    public CuentaclienteJpaController() {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuentacliente cuentacliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuentacliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuentacliente cuentacliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuentacliente = em.merge(cuentacliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cuentacliente.getId();
                if (findCuentacliente(id) == null) {
                    throw new NonexistentEntityException("The cuentacliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuentacliente cuentacliente;
            try {
                cuentacliente = em.getReference(Cuentacliente.class, id);
                cuentacliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuentacliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuentacliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuentacliente> findCuentaclienteEntities() {
        return findCuentaclienteEntities(true, -1, -1);
    }

    public List<Cuentacliente> findCuentaclienteEntities(int maxResults, int firstResult) {
        return findCuentaclienteEntities(false, maxResults, firstResult);
    }

    private List<Cuentacliente> findCuentaclienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuentacliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cuentacliente findCuentacliente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuentacliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuentaclienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuentacliente> rt = cq.from(Cuentacliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
