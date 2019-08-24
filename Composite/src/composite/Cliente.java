/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import patroncomposite.pattern.Box;
import patroncomposite.pattern.CD;
import patroncomposite.pattern.DVD;

public class Cliente {
    
    Box caja1;
    
    public void loadBox(){
        
        caja1 = new Box();
        
        caja1.addElement(new CD());
        caja1.addElement(new DVD());
        caja1.addElement(new DVD());
        caja1.addElement(new CD());
        
        Box caja2 = new Box();
        
        caja2.addElement(new CD());
        caja2.addElement(new DVD());
        caja2.addElement(new DVD());
        caja2.addElement(new CD());
        
        caja1.addElement(caja2);
    }
    
    public void showWeight(){
        System.out.println("El peso total de la caja es " +caja1.getWeight());
    }
}
