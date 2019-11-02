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
public class OfertaVuelos implements OfertaElement{

    @Override
    public void accept(CreditCarVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
    
}
