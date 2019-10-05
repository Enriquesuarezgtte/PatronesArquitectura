import java.util.HashMap;

public class SalonPrivado implements ISalaChat {

	private HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
	private HashMap<String, Usuario> blackList = new HashMap<String, Usuario>();

	@Override
	public void registrarUsuario(Usuario user) {
		usuarios.put(user.getNickName(), user);
	}

	@Override
	public void enviarMensaje(String from, String to, String msg) {
		if (blackList.containsKey(from)) {
			System.out.println("Administrador ha bloqueado a : "+from);
		} else if (blackList.containsKey(to)) {
			System.out.println("No se puede contactar con: "+to+" debido a que está bloqueada");
		} else {
			if (usuarios.containsKey(from) && usuarios.containsKey(to)) {
				usuarios.get(to).recibirMensaje(from, msg);
			} else {
				System.out.println("Usuario Inexistente");
			}
		}
	}
	
	public void registrarUsuarioPorInvitacion(Usuario user) {
		if(user.isInvitacion()) {
			usuarios.put(user.getNickName(), user);
			System.out.println("El usuario ha aceptado la invitacion por parte del Administrador");
		}else {
			System.out.println("EL usuario ha rechazado la invitacion");
		}
	}




	public void invitarUsuario(Usuario user) {
		if(!usuarios.containsKey(user.getNickName())) {
			user.setInvitacion(true);
		}else {
			System.out.println("El usuario ya está en la sala");
		}
	}

	public void BuscarUsuario(Usuario user) {
		if (usuarios.containsKey(user.getNickName())) {
			System.out.println("El usuario: " + usuarios.get(user.getNickName()) + " se encuentra en la sala");
		}
	}
	
	public void addToBlackList(Usuario user) {
		if (usuarios.containsKey(user.getNickName())) {
			if(!blackList.containsKey(user.getNickName())) {
				blackList.put(user.getNickName(), user);
			}else {
				System.out.println("El usuario ya estaba bloqueado");
			}
		} else {
			System.out.println("El usuario no se encuentra en la sala");
		}
	}

	public void removeFromBlackList(Usuario user) {
		if (usuarios.containsKey(user.getNickName()) && blackList.containsKey(user.getNickName())) {
			blackList.remove(user.getNickName(), user);
			System.out.println("El administrador ha debloqueado a :" + user.getNickName());
		} else {
			System.out.println("El usuario que intenta desbloquear no se encuentra en la sala del chat"
					+ "o no se encuentra bloqueado");
		}
	}

}
