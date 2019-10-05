import java.util.HashMap;

public class SalonChat implements ISalaChat {

	private HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();

	@Override
	public void registrarUsuario(Usuario user) {
		usuarios.put(user.getNickName(), user);
	}

	@Override
	public void enviarMensaje(String from, String to, String msg) {
		if (usuarios.containsKey(from) && usuarios.containsKey(to)) {
			usuarios.get(to).recibirMensaje(from, msg);			
		} else {
			System.out.println("Usuario Inexistente");
		}
	}

}
