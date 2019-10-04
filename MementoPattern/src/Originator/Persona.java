/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Originator;

import Memento.Memento;

/**
 *
 * @author bryan
 */
public class Persona {

    private String nombre;
    
    private String apellidos;
    private int edad;
    private String carrera;
    private String direccion;
    private String telefono;

    private Persona(Persona p) {
        this.nombre = p.getNombre();
        this.apellidos = p.getApellidos();
        this.edad = p.getEdad();
        this.carrera = p.getCarrera();
        this.direccion = p.getDireccion();
        this.telefono = p.getTelefono();
    }

    public Persona() {
    }

 
    

    public Memento saveToMemento() {
        System.out.println("Originator: Guardando memento...");
        Persona p = new Persona(this);
        
        return new Memento(p);
    }

    public void restoreFromMemento(Memento m) {
        nombre = m.getSavedState().getNombre();
        apellidos = m.getSavedState().getApellidos();
        edad = m.getSavedState().getEdad();
        direccion = m.getSavedState().getDireccion();
        telefono = m.getSavedState().getTelefono();
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", carrera=" + carrera + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
