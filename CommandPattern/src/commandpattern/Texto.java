/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;


/**
 *
 * @author enrique
 */
public class Texto implements ITexto{
    String texto;

    public Texto() {
        this.texto = "";
    }

    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public void modifyText(String t) {
        texto =t;
    }

    @Override
    public void deleleteText() {
        texto="";
    }

    @Override
    public void addText(String t) {
        texto +=t;
    }
    public Memento saveToMemento() {
        System.out.println("Originator: Guardando memento...");
        
        return new Memento(texto);
    }

    public void restoreFromMemento(Memento m) {
        texto = m.getSavedState();
                       
    }

    
}
