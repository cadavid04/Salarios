/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import CDI.Salario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author itmanager
 */
@Stateless
public class salarioManager {

    @PersistenceContext(unitName = "SalariosPU")
    private EntityManager em;

      public List<Salario> fetchSalarios() {
        Query query = em.createNamedQuery("Salario.findAll");
        return query.getResultList();
    }
     
     public Salario update (Salario salario){
         return em.merge(salario);
     }
   
      public void insert (Salario salario){
          em.persist(salario);
     }
      
    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
