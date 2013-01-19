/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.misha.pruebas.jee.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.misha.pruebas.jee.model.Roles;

/**
 *
 * @author Munek
 */
@Stateless
public class RolesFacade extends AbstractFacade<Roles> implements RolesFacadeLocal {
    @PersistenceContext(unitName = "JEEMisha-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolesFacade() {
        super(Roles.class);
    }
    
}
