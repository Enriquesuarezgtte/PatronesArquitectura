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
public class BlackCreditCardVisitor implements CreditCarVisitor {

    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 3% en gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 5% en vuelo con tu tarjeta Black");
    }

	@Override
	public void ofertaParqueadero(OfertaParqueadero ofertaParqueader) {
		System.out.println("No hay descuento");
		
	}

	@Override
	public void ofertaRestaurante(OfertaRestaurante ofertaRestaurante) {
		System.out.println("No hay descuento");
		
	}

	@Override
	public void ofertaRopa(OfertaRopa ofertaRopa) {
		System.out.println("No hay descuento");
		
	}

}
