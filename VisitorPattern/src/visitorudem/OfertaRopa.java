package visitorudem;

public class OfertaRopa implements OfertaElement{

	@Override
	public void accept(CreditCarVisitor visitor) {
		visitor.ofertaRopa(this);
	}

}
