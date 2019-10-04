public interface PermisoEspecial {
	/* Asigna el siguiente jerarca en la cadena de responsabilidad*/
	public void setNextEspecial (PermisoEspecial pJerarca);
	
	/*Retorna el siguiente Jerarca en la cadena de responsabilidad*/
	public PermisoEspecial getNextEspecial();
	
	/*permite ver el documento dependiendo del acceso que tenga el Jerarca*/
	public void aprobarEspecial(int dias);

}