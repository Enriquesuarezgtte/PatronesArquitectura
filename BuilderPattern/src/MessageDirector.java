
public class MessageDirector {

	private MensajeBuilder builder;
	
	public void setMessageBuilder(MensajeBuilder mensajeBuilder) {
		builder = mensajeBuilder;
	}
	
	public Mensaje getMensaje() {
		return builder.getMensaje();
	}
	
	public void construirMensaje(String encabezado, String
			asunto, String cuerpo) {
		builder.buildEncabezado(encabezado);
	
		builder.buildAsunto(asunto);
		builder.buildCuerpo(cuerpo);
	}
}
