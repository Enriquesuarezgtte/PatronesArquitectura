public interface PermisoNormal {
	/* Asigna el siguiente jerarca en la cadena de responsabilidad*/
	public void setNextNOrmal (PermisoNormal pJerarca);
	
	/*Retorna el siguiente Jerarca en la cadena de responsabilidad*/
	public PermisoNormal getNext();
	
	/*permite ver el documento dependiendo del acceso que tenga el Jerarca*/
	public void aprobarNormal(int dias);

}