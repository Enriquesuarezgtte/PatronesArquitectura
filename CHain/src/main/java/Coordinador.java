
public class Coordinador implements PermisoNormal{
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
		if(dias==1){
			System.out.println("AProbado por coordinador");
		}else{
			this.next.aprobarNormal(dias);
		}
	}
	
}