package AdapterPackage;

public class CarrozaAdapter implements Vehiculo{
	final Carroza carroza = new Carroza();
	@Override
	public void frenar() {
		System.out.println("Frenar carroza:" );
		carroza.halarRiendas();
		System.out.println("");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar carroza:" );
		carroza.moverRiendas();
		carroza.arrearCaballos();
		System.out.println("");

	}

	
	
}
