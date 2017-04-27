package trabajofacebook;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;

/**
 *
 * @author Adry
 */
public class Autorizacion {
    public static Facebook autorizar(){  
    Facebook facebook = new FacebookFactory().getInstance();
    return facebook;
}
}