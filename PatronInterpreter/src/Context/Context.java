package Context;

public class Context {
	public String entrada;
	public String salida;
	
	public Context( String s ) {
		entrada = s;
		salida="";
	}

	public String getEntrada() {
		return entrada;
	}

	public String getSalida() {
		return salida;
	}
}
