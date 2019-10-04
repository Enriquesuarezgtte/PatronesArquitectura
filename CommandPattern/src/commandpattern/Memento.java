/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

public class Memento {
    
    private final String estado;

    public Memento(String estado) {
        this.estado = estado;
    }
    
    public String getSavedState(){
        return estado;
    }
    
}
