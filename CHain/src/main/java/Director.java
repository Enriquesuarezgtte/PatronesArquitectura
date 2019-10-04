
public class Director implements PermisoNormal{
	private PermisoNormal next;
	
	@Override
	public void setNextNOrmal(PermisoNormal permiso) {
		this.next = permiso;
	}

	@Override
	public PermisoNormal getNext() {
		return this.next;
	}

	@Override
	public void aprobarNormal(int dias) {
		if(dias<=3){
			System.out.println("AProbado por director");
		}else{
			this.next.aprobarNormal(dias);
		}
	}
	
}