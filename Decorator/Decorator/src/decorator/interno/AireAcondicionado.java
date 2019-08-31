package decorator.interno;

import decoratorpattern.VentaAuto;

public class AireAcondicionado extends DecoradoresInternos {
	// Constructor se envia el paramatrea al metodo
	public AireAcondicionado(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tAire Acondicionado";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 850000;
	}
}
