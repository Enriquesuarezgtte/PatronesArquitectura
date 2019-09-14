/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author ingenierias
 */
public class Contexto implements ICifrado{
    private ICifrado cifrado;

    public Contexto(ICifrado cifrado) {
        this.cifrado = cifrado;
    }

    @Override
    public String cifrar(String msj) {
        return cifrado.cifrar(msj);
    }

    @Override
    public String descifrar(String msj) {
        return cifrado.descifrar(msj);
    }
   
    
    
    
    
    
}
