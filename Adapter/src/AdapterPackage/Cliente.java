package AdapterPackage;

public class Cliente {

	public static void main(String[] args) {
		
		Carro carro= new Carro();
		System.out.println("Carro : ");

		carro.acelerar();
		carro.frenar();
		
		CarrozaAdapter carroza = new CarrozaAdapter();
		System.out.println("\nCarroza : ");

		carroza.acelerar();
		carroza.frenar();
		
		TricicloAdapter tricicloAdapter = new TricicloAdapter();
		System.out.println("\nTriciclo : ");
		
		tricicloAdapter.acelerar();
		tricicloAdapter.frenar();
		
		TroncoMovilAdapter troncoMovilAdapter = new TroncoMovilAdapter();
		System.out.println("\nTroncoMovil  : ");

		troncoMovilAdapter.acelerar();
		troncoMovilAdapter.frenar();
		
		
	}
}
