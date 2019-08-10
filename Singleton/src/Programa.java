
public class Programa {

	String nombrePrograma;
	String codigo;
	
	protected Programa() {
		// TODO Auto-generated constructor stub
	}
	

	public String getNombrePrograma() {
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Programa [nombrePrograma=" + nombrePrograma + ", codigo=" + codigo + "]";
	}
	
	
}
