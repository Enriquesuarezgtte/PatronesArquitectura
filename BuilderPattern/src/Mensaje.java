
public class Mensaje {
 private String encabezado;
 private String cuerpo;
 private String asunto;
 
public String getEncabezado() {
	return encabezado;
}
public void setEncabezado(String encabezado) {
	this.encabezado = encabezado;
}

public void setCuerpo(String cuerpo) {
	this.cuerpo = cuerpo;
}

public void setAsunto(String asunto) {
	this.asunto = asunto;
}
@Override
public String toString() {
	return encabezado+ asunto + cuerpo;
}

 
 
}
