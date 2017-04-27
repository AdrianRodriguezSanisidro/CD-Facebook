/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacebook;

import facebook4j.FacebookException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class PublicarEstado {
    public void publicarEstado() throws FacebookException{
        String mensaje=JOptionPane.showInputDialog("Escribe el estado");
        Autorizacion.autorizar().postStatusMessage(mensaje);
        
    }
}
