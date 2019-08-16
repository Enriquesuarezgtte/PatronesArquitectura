
public class XMLMessage extends MensajeBuilder{

	
	
	public XMLMessage() {
		super.mensaje = new Mensaje();
	}

	@Override
	public void buildEncabezado(String encabezado) {
		mensaje.setEncabezado(
				"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
				+ "<department>\n <employee>\n <name>"+encabezado +"</name> ");
	}

	@Override
	public void buildCuerpo(String cuerpo) {
		mensaje.setCuerpo("\n <message>"+cuerpo + "</message> "
				+ " \n</employee> \n</department>");	
	}

	@Override
	public void buildAsunto(String asunto) {
		mensaje.setAsunto("\n <subject>"+asunto+ "</subject>");
	}


}
