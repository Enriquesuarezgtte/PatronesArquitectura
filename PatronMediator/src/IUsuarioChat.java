
public interface IUsuarioChat {

	public void recibirMensaje(String from, String msg);
	public void enviarMensaje(String to, String msg);
	public void aceptarInvitaciones();
	public void rechazarInvitacion();
}
