/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.misha.pruebas.jee.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mx.com.misha.pruebas.jee.beans.UsuariosFacadeLocal;
import mx.com.misha.pruebas.jee.model.Usuarios;

/**
 *
 * @author Munek
 */
@WebService
@Stateless
public class UsuariosServices {

   @EJB
   private UsuariosFacadeLocal usuariosFacade;

    
    public Usuarios obtenerUsuario(Integer i) {
        try {
            return usuariosFacade.find(i);
        } catch (Exception e) {
        }

        return null;
    }
}
