/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.externo;

import decoratorpattern.VentaAuto;

public class Blindaje extends DecoradoresExternos {

	public Blindaje(VentaAuto ventaAuto) {
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tBlindaje";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 250000;
	}

}
