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
public class UndoCommand implements Command{

    
    private ITexto iTexto;

    public UndoCommand(ITexto iTexto) {
        this.iTexto = iTexto;
    }
    
   

    @Override
    public void execute(Caretaker c, int pos) {
        iTexto.modifyText(c.getMemento(pos).getSavedState());
        
    }
    
}
