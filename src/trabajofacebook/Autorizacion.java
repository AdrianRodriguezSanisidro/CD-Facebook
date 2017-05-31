/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacebook;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.conf.ConfigurationBuilder;

/**
 * Clase con el metodo autorizar
 * @author Adry
 */
class Autorizacion {
    /**
     * Usa las keys y los tokens para poder acceder a mi cuenta
     * @return facebook
     */
    public static Facebook autorizar(){
    Facebook facebook;
    ConfigurationBuilder conFace=new ConfigurationBuilder();
    conFace.setDebugEnabled(true)
            .setOAuthAppId("215286388959243")
            .setOAuthAppSecret("74d40cd6826e23d3fb19074b85f92580")
            .setOAuthAccessToken("EAADDzUS9KAsBAHUzmoRM9d4d2SuRfDTem5bKCemsLYDxZA2WMRUXhJfAF9v1TyZBxiJO6x1HC8LytGGZAQ5vZB9tbnvCWdWQvpAoyGZBrFiZCG2XQHjeSQKq9XR2PoZCSHfYRhZAG2yndn2eDn8H0FI7dCdj80e69N4ZD")
            .setOAuthPermissions("email,publish_stream,publish_actions");
    FacebookFactory faceFact=new FacebookFactory(conFace.build());
    facebook =faceFact.getInstance();
    return facebook;
}
}