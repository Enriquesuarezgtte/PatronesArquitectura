package AdapterPackage;

public class TricicloAdapter implements Vehiculo {
	final Triciclo triciclo = new Triciclo();

	@Override
	public void frenar() {
		System.out.println("Frenar Triciclo:" );
		triciclo.bajarPies();
		triciclo.rozarPies();
		System.out.println("");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar triciclo:" );
		triciclo.pedalear();
		System.out.println("");

	}
	
	
	
}
