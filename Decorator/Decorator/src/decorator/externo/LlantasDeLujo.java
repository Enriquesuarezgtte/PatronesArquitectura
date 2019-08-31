package decorator.externo;

import decoratorpattern.VentaAuto;

public class LlantasDeLujo extends DecoradoresExternos {
	// Constructor se envia el paramatrea al metodo
	public LlantasDeLujo(VentaAuto ventaAuto) {
		super(ventaAuto);
	}

	// Metodos que retornan del componente y del decorador concreto
	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tLlantas de lujo";
	}

	// Metodos que retornan del componente y del decorador concreto
	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 1000000;
	}
}
