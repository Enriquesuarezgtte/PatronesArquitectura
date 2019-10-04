
public class Presidente implements PermisoNormal, PermisoEspecial{
	private PermisoNormal next;
        	private PermisoEspecial nextEspecial;

	
	@Override
	public void setNextNOrmal(PermisoNormal permiso) {
		this.next = permiso;
	}

	@Override
	public PermisoEspecial getNextEspecial() {
		return this.nextEspecial;
	}
        @Override
	public PermisoNormal getNext() {
		return this.next;
	}

	@Override
	public void aprobarNormal(int dias) {
		if(dias>=5){
			System.out.println("aprobado normal por el presidente");
		}
	}

    @Override
    public void setNextEspecial(PermisoEspecial pJerarca) {
        this.nextEspecial = pJerarca;
    }

    @Override
    public void aprobarEspecial(int dias) {
                if(dias>=5){
			System.out.println("aprobado especial por el presidente");
		}
    }
	
}
