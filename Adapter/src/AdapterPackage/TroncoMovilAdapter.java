package AdapterPackage;

public class TroncoMovilAdapter implements Vehiculo {
	
	final TroncoMovil troncoMovil = new TroncoMovil();
	@Override
	public void frenar() {
		System.out.println("Frenar tronco movil:" );
		troncoMovil.bajarPies();
		troncoMovil.rozarPies();
		System.out.println("");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar tronco movil:" );
		troncoMovil.bajarPies();
		troncoMovil.correr();
		System.out.println("");

	}
	

}
