package visitorudem;

public class OfertaParqueadero implements OfertaElement{

	@Override
	public void accept(CreditCarVisitor visitor) {
		visitor.ofertaParqueadero(this);
	}

}
