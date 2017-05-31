/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacebook;

import facebook4j.FacebookException;
import facebook4j.User;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase con el metodo busqueda
 * @author Adry
 */
public class Busqueda {
    /**
     * Busca el nombre de los usuarios por un mensaje
     * @throws FacebookException 
     */
    public static void buscarUsuario() throws FacebookException{
        String mensaje=JOptionPane.showInputDialog("Mensaje a buscar: ");
        List<User>listaUsuario;
        listaUsuario=Autorizacion.autorizar().getUsers(mensaje);
        for(int i=0;i<listaUsuario.size();i++){
            System.out.println(listaUsuario.get(i).getName());
        }
        
    }
}
