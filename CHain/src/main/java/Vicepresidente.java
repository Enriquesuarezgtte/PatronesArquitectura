
public class Vicepresidente implements PermisoEspecial{
	private PermisoEspecial next;
	



	


    @Override
    public void aprobarEspecial(int dias) {
if(dias<=5){
			System.out.println("aprobado  especial por el vicepresidente");
		}else{
			this.next.aprobarEspecial(dias);
		}
    }

 

    @Override
    public void setNextEspecial(PermisoEspecial pJerarca) {
        		this.next = pJerarca;

    }

    @Override
    public PermisoEspecial getNextEspecial() {
        return this.next;
    }
	
}
