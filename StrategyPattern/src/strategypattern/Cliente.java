/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import LlavePrivada.AES;
import LlavePrivada.DES;
import LlavePrivada.TRESDES;
import LlavePublica.ELGamal;
import LlavePublica.RSA;

/**
 *
 * @author ingenierias
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contexto contexto = new Contexto(new DES());
        String cifrado= contexto.cifrar("Hola Mundo");
        System.out.println(cifrado);
        String descifrar = contexto.descifrar(cifrado);
        System.out.println(descifrar);
        
 
        
        contexto = new Contexto(new AES());
         cifrado= contexto.cifrar("Hola Mundo");
        System.out.println(cifrado);
         descifrar = contexto.descifrar(cifrado);
        System.out.println(descifrar);
        
          contexto = new Contexto(new TRESDES());
         cifrado= contexto.cifrar("Hola Mundo");
        System.out.println(cifrado);
         descifrar = contexto.descifrar(cifrado);
        System.out.println(descifrar);
        
        contexto = new Contexto(new RSA());
         cifrado= contexto.cifrar("Hola Mundo");
        System.out.println(cifrado);
         descifrar = contexto.descifrar(cifrado);
        System.out.println(descifrar);
        
           
        

        
    }
    
}
