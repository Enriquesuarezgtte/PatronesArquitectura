
public abstract class MensajeBuilder {
	
	protected Mensaje mensaje;

	public Mensaje getMensaje() {
		return mensaje;
	}
	
	public abstract void buildEncabezado(String encabezado);
	public abstract void buildCuerpo(String cuerpo);
	protected abstract void buildAsunto(String asunto);
	

}
