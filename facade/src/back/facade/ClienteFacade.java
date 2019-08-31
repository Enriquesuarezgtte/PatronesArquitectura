/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.facade;

import back.ClienteController;
import back.ventas.Venta;

public class ClienteFacade {

	private ClienteController clienteController;

	public ClienteFacade(ClienteController cliente) {
		this.clienteController = cliente;
	}

	public void crearPQR(String mesaje, String tipo) {
		clienteController.crearPQR(mesaje, tipo);
	}

	public Venta crearVenta(int valorVenta, String numeroVenta) {
		return clienteController.crearVenta(valorVenta, numeroVenta);
	}

	public void crearOportunidad(String oportunidad, int valorVenta, String numeroVenta) {
		clienteController.crearOportunidad(oportunidad, valorVenta, numeroVenta);
	}

	public void verHistoriaCredito() {
		clienteController.verHistoriaCredito();
	}
	public void verPQR() {
		clienteController.verPQR();
	}
	

	public ClienteController getCliente() {
		return clienteController;
	}

	public void setCliente(ClienteController cliente) {
		this.clienteController = cliente;
	}

}
