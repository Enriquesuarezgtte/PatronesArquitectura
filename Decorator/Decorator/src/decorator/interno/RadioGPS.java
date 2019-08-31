/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.interno;

import decoratorpattern.VentaAuto;

public class RadioGPS extends Radios {

	public RadioGPS(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tRadioGPS";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 300000;
	}

}