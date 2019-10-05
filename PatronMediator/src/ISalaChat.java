
public interface ISalaChat {
	public abstract void registrarUsuario(Usuario participante);
	public abstract void enviarMensaje(String from, String to, String msg);
}
