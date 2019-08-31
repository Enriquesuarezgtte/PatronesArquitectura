package decorator.externo;

import decoratorpattern.VentaAuto;

public class VidriosElectricos extends DecoradoresExternos {
	// Constructor se envia el paramatrea al metodo
	public VidriosElectricos(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tVidrios Eléctricos";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 220000;
	}

}
