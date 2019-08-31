package decorator.interno;

import decoratorpattern.VentaAuto;

public class Mp4Player extends Radios {

	public Mp4Player(VentaAuto ventaAuto) {
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tReproductor Mp4";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 400000;
	}
}
