
public class JSONMessage extends MensajeBuilder {

	
	
	public JSONMessage() {
		super.mensaje = new Mensaje();
	}

	@Override
	public void buildEncabezado(String encabezado) {
mensaje.setEncabezado("{\n 'Encabezado' : '"+encabezado+"',");		
	}

	@Override
	public void buildCuerpo(String cuerpo) {
		mensaje.setCuerpo("\n 'Cuerpo' : '"+cuerpo+"' \n }");		
	}

	@Override
	protected void buildAsunto(String asunto) {
		mensaje.setAsunto("\n 'Asunto' : '"+asunto+"',");		
		
	}



}
