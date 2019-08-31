/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.interno;

import decoratorpattern.VentaAuto;

public class RadioDVD extends Radios {
	// Constructor se envia el paramatrea al metodo
	public RadioDVD(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tRadio DVD";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 150000;
	}

}
