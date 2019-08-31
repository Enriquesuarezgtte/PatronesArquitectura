/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.interno;

import decoratorpattern.VentaAuto;

public class RadioBasico extends Radios {
	public RadioBasico(VentaAuto ventaAuto) {
		// permite acumular
		super(ventaAuto);
	}

	// Metodos que retornan del componente y del decorador concreto
	@Override
	public String getDescription() {
		return getVentaAuto().getDescription() + "\n\tRadio Básico";
	}

	@Override
	public double getPrice() {
		return getVentaAuto().getPrice() + 150000;
	}

}