
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlavePublica;

import strategypattern.ICifrado;

/**
 *
 * @author ingenierias
 */
public class CiframientoLlavePublica implements  ICifrado{
    
    String llavePrivada;
    String llavePublica;

    @Override
    public String cifrar(String msj) {
        System.err.println("Llave publica cifrado");
        return "";
    }

    @Override
    public String descifrar(String msj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
