/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorudem;

/**
 *
 * @author David
 */
public class VisitorUdem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OfertaElement ofertaElement = new OfertaGasolina();
        ofertaElement.accept(new BlackCreditCardVisitor());
        
        ofertaElement.accept(new ClassicCreditCardVisitor());
        
        ofertaElement = new OfertaVuelos();
        ofertaElement.accept(new ClassicCreditCardVisitor());
    }
    
}
