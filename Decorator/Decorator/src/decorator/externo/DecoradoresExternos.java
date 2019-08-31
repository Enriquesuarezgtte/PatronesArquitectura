/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.externo;

import decoratorpattern.AutomovilDecorator;
import decoratorpattern.VentaAuto;

public abstract class DecoradoresExternos extends AutomovilDecorator {

	public DecoradoresExternos(VentaAuto ventaAuto) {
		super(ventaAuto);
	}

}
