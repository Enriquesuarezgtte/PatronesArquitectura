/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Caretaker.Caretaker;
import Memento.Memento;
import Originator.Persona;


public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Persona persona = new Persona();
        persona.setNombre("Enrique");
        persona.setNombre("Leo");
        persona.setApellidos("Ruiz Suárez");
        persona.setCarrera("Ingenieria de sistemas");
        persona.setDireccion("Kennedy");
        persona.setEdad(22);
        persona.setTelefono("12345");
        caretaker.addMemento(persona.saveToMemento());

        persona.setNombre("Enrique David");
        persona.setApellidos("SUárez Guette");
        persona.setCarrera("Ingenieria de sistemas");
        persona.setDireccion("Engativá");
        persona.setEdad(22);
        persona.setTelefono("3024121291");

        caretaker.addMemento(persona.saveToMemento());

        persona.setNombre("Jorge Camargo");
        Memento memento1 = caretaker.getMemento(0);
        Memento memento2 = caretaker.getMemento(1);

        System.out.println(memento1.getSavedState().toString());
        System.out.println(memento2.getSavedState().toString());
    }

}
