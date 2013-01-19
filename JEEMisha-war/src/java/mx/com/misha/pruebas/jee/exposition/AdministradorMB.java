/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.misha.pruebas.jee.exposition;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.com.misha.pruebas.jee.beans.UsuariosFacadeLocal;
import mx.com.misha.pruebas.jee.model.Usuarios;

/**
 *
 * @author Munek
 */
@ManagedBean
@ViewScoped
public class AdministradorMB {
    @EJB
    private UsuariosFacadeLocal usuariosFacade;
    
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void guardarUsuario(){
        System.out.println("Guardar Usuario");
        System.out.println("Username: " + username);
        
        Usuarios user = new Usuarios();
        user.setUsername(username);
       
        
        usuariosFacade.create(user);
        System.out.println("Usuario Guardado");
        
        
    }

    public void setUsuariosFacade(UsuariosFacadeLocal usuariosFacade) {
        this.usuariosFacade = usuariosFacade;
    }
    
    
    
    
    
}
