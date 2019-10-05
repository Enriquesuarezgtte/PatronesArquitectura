
public class Usuario implements IUsuarioChat {

	private String nickName;
	private SalonPrivado salon;
	private boolean invitacion;

	public Usuario(SalonPrivado salonchat) {
		salon = salonchat;
		invitacion=false;
	}

	@Override
	public void recibirMensaje(String de, String msg) {
		String texto = "El usuario " + de + " dice: " + msg;
		System.out.println(nickName + ": " + texto);
	}

	@Override
	public void enviarMensaje(String a, String msg) {
		salon.enviarMensaje(nickName, a, msg);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	

	public boolean isInvitacion() {
		return invitacion;
	}

	public void setInvitacion(boolean invitacion) {
		this.invitacion = invitacion;
	}

	@Override
	public void aceptarInvitaciones() {
		salon.registrarUsuarioPorInvitacion(this);
	}
	@Override
	public void rechazarInvitacion() {
		setInvitacion(false);
		salon.registrarUsuarioPorInvitacion(this);
	}


}
