
public class EmailMessage extends MensajeBuilder{

	
	
	public EmailMessage() {
		super.mensaje = new Mensaje();
	}

	@Override
	public void buildEncabezado(String encabezado) {
		mensaje.setEncabezado("To: "+ encabezado);
	}

	@Override
	public void buildCuerpo(String cuerpo) {
		mensaje.setCuerpo("\n"+cuerpo);
	}

	@Override
	public void buildAsunto(String asunto) {
		mensaje.setAsunto("\nSubject: "+ asunto);
	}



}
