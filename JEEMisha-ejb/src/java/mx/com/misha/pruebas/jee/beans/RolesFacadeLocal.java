/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.misha.pruebas.jee.beans;

import java.util.List;
import javax.ejb.Local;
import mx.com.misha.pruebas.jee.model.Roles;

/**
 *
 * @author Munek
 */
@Local
public interface RolesFacadeLocal {

    void create(Roles roles);

    void edit(Roles roles);

    void remove(Roles roles);

    Roles find(Object id);

    List<Roles> findAll();

    List<Roles> findRange(int[] range);

    int count();
    
}
