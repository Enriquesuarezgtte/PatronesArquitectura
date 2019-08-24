/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;


public class PatronComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente();
        cliente.loadBox();
        
        cliente.showWeight();
    }
    
}
