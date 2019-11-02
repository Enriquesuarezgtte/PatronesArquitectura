package visitorudem;

public class BlueCreditCardVisitor implements CreditCarVisitor{

	@Override
	public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
		System.out.println("Descuento del 3% en gasolina BlueCreditCard");
		
	}

	@Override
	public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
		System.out.println("Descuento del 3% en vuelos BlueCreditCard");
		
	}

	@Override
	public void ofertaParqueadero(OfertaParqueadero ofertaParqueadero) {
		System.out.println("Descuento del 3% en parqueadero BlueCreditCard");
	}

	@Override
	public void ofertaRestaurante(OfertaRestaurante ofertaRestaurante) {
		System.out.println("Descuento del 3% en restaurante BlueCreditCard");
		
	}

	@Override
	public void ofertaRopa(OfertaRopa ofertaRopa) {
		System.out.println("Descuento del 3% en ropa BlueCreditCard");
		
	}

}
