/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import back.Cliente;
import back.ClienteController;
import back.facade.ClienteFacade;

public class CanalDistribucion {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Enrique Suárez", 123456);
		ClienteController clienteController = new ClienteController(cliente);
		ClienteFacade clienteFacade = new ClienteFacade(clienteController);
		clienteFacade.crearOportunidad("Compra de articulos importados de España", 800000000, "123456");
		clienteFacade.crearOportunidad("Compra de articulos importados de Amsterdam", 552000000, "789465");
		clienteFacade.crearOportunidad("Compra de articulos importados de Amsterdam", 1000000, "789466");
		clienteFacade.crearOportunidad("Compra de articulos importados de Amsterdam", 80000000, "777888");
		//clienteFacade.crearVenta(800000, "1111");

		clienteFacade.verHistoriaCredito();
		
		//clienteFacade.crearPQR("Realización de un certificado", "P");
		//clienteFacade.crearPQR("Problemas con sistema de autenticación", "Q");
		//clienteFacade.verPQR();
		
	}

}
