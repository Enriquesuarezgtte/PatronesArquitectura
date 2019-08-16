import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		MessageDirector director = new MessageDirector();
		MensajeBuilder xmlMessage = new XMLMessage();
		MensajeBuilder jsonMessage = new JSONMessage();
		MensajeBuilder emailMessage = new EmailMessage();
		
		director.setMessageBuilder(emailMessage);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el encabezado");
		String encabezado = sc.nextLine();
		
		System.out.println("Ingrese el asunto");
		String asunto = sc.nextLine();
		
		System.out.println("Ingrese el cuerpo");
		String cuerpo = sc.nextLine();
	
		director.construirMensaje(encabezado, asunto, cuerpo);
		Mensaje mensaje = director.getMensaje();
			
		System.out.println("El mensaje es: EMAIL");
		System.out.println(mensaje+"\n");
		
		director.setMessageBuilder(xmlMessage);
		
		director.construirMensaje(encabezado, asunto, cuerpo);
		Mensaje mensaje1 = director.getMensaje();
		System.out.println("El mensaje es: XML");
		System.out.println(mensaje1+"\n");
		
		director.setMessageBuilder(jsonMessage);
		
		director.construirMensaje(encabezado, asunto, cuerpo);
		Mensaje mensaje2 = director.getMensaje();
		System.out.println("El mensaje es: JSON");
		System.out.println(mensaje2);
	}
}
