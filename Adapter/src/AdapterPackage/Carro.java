package AdapterPackage;

public class Carro implements Vehiculo{

	@Override
	public void frenar() {
		System.out.println("El carro frenó");
	}

	@Override
	public void acelerar() {
		System.out.println("El carro está acelerando");
	}

}
