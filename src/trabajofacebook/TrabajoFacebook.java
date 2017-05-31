package trabajofacebook;

import facebook4j.FacebookException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import static trabajofacebook.Busqueda.buscarUsuario;
import static trabajofacebook.PublicarConFoto.publicarFoto;
import static trabajofacebook.PublicarEstado.publicarEstado;

/**
 * El programa te conecta con facebook para poder postear en tu muro
 * @author Adry
 */
public class TrabajoFacebook {
    /**
     * Main con un menu para seleccionar la accion que quieres
     * @param args
     * @throws FacebookException
     * @throws MalformedURLException 
     */
    public static void main(String[] args) throws FacebookException, MalformedURLException {
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1:Publicar un estado\n2:Publicar un estado con foto\n3:Buscar"));
            switch(opcion){
                case 1:publicarEstado();
                    System.out.println("Estado publicado correctamente");
                    break;
                case 2:publicarFoto();
                    System.out.println("Estado publicado correctamente");
                    break;
                case 3:buscarUsuario();
                    break;
            }
        }while(opcion !=0);
    }
    
}
