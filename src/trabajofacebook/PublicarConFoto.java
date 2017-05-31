package trabajofacebook;

import facebook4j.FacebookException;
import facebook4j.PostUpdate;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 * Clase con el metodo PublicarConFoto
 * @author Adry
 */
public class PublicarConFoto {
    /**
     * Publica un comentario con una foto
     * @throws MalformedURLException
     * @throws FacebookException 
     */
    public static void publicarFoto() throws MalformedURLException, FacebookException{
        String url=JOptionPane.showInputDialog("Pon la url de la foto");
        String mensaje=JOptionPane.showInputDialog("Escribe el mensaje");
        PostUpdate post=new PostUpdate(new URL("http://facebook4j.org"))
                .message(mensaje)
                .picture(new URL(url));
                Autorizacion.autorizar().postFeed(post);
            }
    }
