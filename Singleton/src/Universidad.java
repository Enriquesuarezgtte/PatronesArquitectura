
public class Universidad {
	String nombre ="Fundación Universitaria Konrad Lorenz";
	
	private static Universidad instance;
private Universidad() {
}


public static Universidad getInstance() {
	if(instance == null) {
		instance = new Universidad();
}
	return instance;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public String toString() {
	return "Universidad [nombre=" + nombre + "]";
}

}
