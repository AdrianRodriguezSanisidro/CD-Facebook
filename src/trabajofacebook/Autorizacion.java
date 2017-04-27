/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacebook;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;

/**
 *
 * @author Adry
 */
class Autorizacion {
    public static Facebook autorizar(){
    Facebook facebook = new FacebookFactory().getInstance();
    return facebook;
}
}