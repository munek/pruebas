/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.misha.pruebas.jee.beans;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.misha.pruebas.jee.model.Usuarios;

/**
 *
 * @author Munek
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {
    @PersistenceContext(unitName = "JEEMisha-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
}
