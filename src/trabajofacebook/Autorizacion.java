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
 *
 * @author Adry
 */
class Autorizacion {
    public static Facebook autorizar(){
    Facebook facebook;
    ConfigurationBuilder conFace=new ConfigurationBuilder();
    conFace.setDebugEnabled(true)
            .setOAuthAppId("*****")//No lo pongo para que otros no puedan usar mi cuenta
            .setOAuthAppSecret("****")//No la pongo para que otros no puedan usar mi cuenta
            .setOAuthAccessToken("")//No lo pongo para que otros no puedan usar mi cuenta
            .setOAuthPermissions("email,publish_stream,publish_actions");
    FacebookFactory faceFact=new FacebookFactory(conFace.build());
    facebook =faceFact.getInstance();
    return facebook;
}
}