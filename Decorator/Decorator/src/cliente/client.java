package cliente;

import components.BMW;
import decorator.externo.Blindaje;
import decorator.externo.LlantasDeLujo;
import decorator.externo.Polarizado;
import decorator.externo.VidriosElectricos;
import decorator.interno.AireAcondicionado;
import decorator.interno.Mp4Player;
import decorator.interno.RadioBasico;
import decorator.interno.RadioDVD;
import decorator.interno.RadioGPS;
import decoratorpattern.VentaAuto;

public class client {
	// Cliente
	public static void main(String[] args) {
		// Vehiculos
		// VentaAuto automovil = new ChevroletSail();
		VentaAuto automovil = new BMW();
		// VentaAuto automovil = new ChevroletSprint();
		// VentaAuto automovil = new Toyota();

		// Decoradores
		automovil = new AireAcondicionado(automovil);
		automovil = new Blindaje(automovil);
		automovil = new LlantasDeLujo(automovil);
		automovil = new Mp4Player(automovil);
		automovil = new Polarizado(automovil);
		automovil = new RadioBasico(automovil);
		automovil = new RadioDVD(automovil);
		automovil = new RadioGPS(automovil);
		automovil = new VidriosElectricos(automovil);
		System.out.println(automovil.getDescription());
		System.out.println("Su precio es: " + automovil.getPrice());

	}

}
