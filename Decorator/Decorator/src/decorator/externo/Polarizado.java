
package decorator.externo;

import decoratorpattern.VentaAuto;

public class Polarizado extends DecoradoresExternos {
	// Constructor se envia el paramatrea al metodo
	public Polarizado(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tPolarizado";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 750000;
	}

}
