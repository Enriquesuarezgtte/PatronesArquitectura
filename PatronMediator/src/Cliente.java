
public class Cliente {

	public static void main(String[] args) {
		SalonPrivado salonPrivado = new SalonPrivado();
	//	SalonChat salon= new SalonChat();
		Usuario usuario = new Usuario(salonPrivado);
		usuario.setNickName("Ibai");
		salonPrivado.registrarUsuario(usuario);

		Usuario usuario2 = new Usuario(salonPrivado);
		usuario2.setNickName("LeoLeo");
		salonPrivado.registrarUsuario(usuario2);

		Usuario usuario3 = new Usuario(salonPrivado);
		usuario3.setNickName("nnoc");
		
		salonPrivado.invitarUsuario(usuario3);
		usuario3.aceptarInvitaciones();
		//usuario3.rechazarInvitacion();


		usuario2.enviarMensaje(usuario.getNickName(), "Hola");
		usuario3.enviarMensaje(usuario2.getNickName(), "Hola");
		usuario3.enviarMensaje(usuario.getNickName(), "Cómo estas?");
		usuario.enviarMensaje(usuario3.getNickName(), "Idk");
		salonPrivado.addToBlackList(usuario);

		usuario.enviarMensaje(usuario3.getNickName(), "hey");

		salonPrivado.removeFromBlackList(usuario);
		usuario.enviarMensaje(usuario3.getNickName(), "hey");

		usuario2.enviarMensaje(usuario.getNickName(), "again?");
	}

}
