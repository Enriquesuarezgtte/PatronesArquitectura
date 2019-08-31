/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.interno;

import decoratorpattern.AutomovilDecorator;
import decoratorpattern.VentaAuto;

public abstract class DecoradoresInternos extends AutomovilDecorator {

	public DecoradoresInternos(VentaAuto ventaAuto) {
		super(ventaAuto);
	}

}
