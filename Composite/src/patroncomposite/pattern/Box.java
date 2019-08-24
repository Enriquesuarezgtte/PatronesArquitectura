/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncomposite.pattern;

import java.util.ArrayList;


public class Box implements IBox{
    
    private ArrayList<IBox> content = new ArrayList<IBox>();

    public void addElement(IBox object){
        content.add(object);
    }
    
    @Override
    public int getWeight() {
        int weigthTotal = 0;
        
        for(int x = 0 ; x < content.size() ;x++){
            weigthTotal = weigthTotal + content.get(x).getWeight();
        }
        
        return weigthTotal;
    }
}
