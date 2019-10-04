/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Originator.Persona;

/**
 *
 * @author bryan
 */
public class Memento {
    
    private final Persona estado;

    public Memento(Persona estado) {
        this.estado = estado;
    }
    
    public Persona getSavedState(){
        return estado;
    }
    
}
