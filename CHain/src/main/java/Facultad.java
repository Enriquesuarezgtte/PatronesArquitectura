
public class Facultad implements PermisoNormal, PermisoEspecial{

	private PermisoNormal next;
        	private PermisoEspecial especial;

	
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
		/* Se crean los integrantes de la cadena */
		Coordinador coordinador = new Coordinador();
		Director d = new Director();
                Gerente g = new Gerente();
                
		Presidente presidente = new Presidente();
		
		/* Se asigna el primer encargado en la cadena */
		this.next = coordinador;
		
		/* Se asignan la jerarquia en la cadena de responsabilidades */
		coordinador.setNextNOrmal(d);
		d.setNextNOrmal(g);
                g.setNextNOrmal(presidente);
		
		/* Se inicia la cadena */
		this.next.aprobarNormal(dias);
	}

    @Override
    public void setNextEspecial(PermisoEspecial pJerarca) {
        		this.especial = pJerarca;

    }

    @Override
    public PermisoEspecial getNextEspecial() {
        		return this.especial;

    }

    @Override
    public void aprobarEspecial(int dias) {

        Coordinador coordinador = new Coordinador();
		Vicepresidente v= new Vicepresidente();
                
		Presidente presidente = new Presidente();
		
		/* Se asigna el primer encargado en la cadena */
		this.especial = v;
		
		/* Se asignan la jerarquia en la cadena de responsabilidades */
		v.setNextEspecial(presidente);
		
		/* Se inicia la cadena */
		this.especial.aprobarEspecial(dias);
    }
}
