
public class Gerente implements PermisoNormal{
	private PermisoNormal next;
	
	@Override
	public void setNextNOrmal(PermisoNormal pJerarca) {
		this.next = pJerarca;
	}

	@Override
	public PermisoNormal getNext() {
		return this.next;
	}

	@Override
	public void aprobarNormal(int dias) {
		if(dias<=5){
			System.out.println("aprobado  normal por el gerente");
		}else{
			this.next.aprobarNormal(dias);
		}
	}
	
}
