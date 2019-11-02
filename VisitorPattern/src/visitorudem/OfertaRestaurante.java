package visitorudem;

public class OfertaRestaurante implements OfertaElement{

	@Override
	public void accept(CreditCarVisitor visitor) {
		visitor.ofertaRestaurante(this);
		
	}

}
