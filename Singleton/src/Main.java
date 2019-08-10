
public class Main {
	
	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		
		Programa programa = new Programa();
		programa.setCodigo("1");
		programa.setNombrePrograma("Ingenieria");
		estudiante.setNombre("Enrique SUarez");
		estudiante.setCodigo("506161049");
		estudiante.setDireccion("Bogota");
		estudiante.setEmail("enriqued.suarez@konradlorenz.edu.co");
		estudiante.setPrograma(programa);
		estudiante.setUniversidad(Universidad.getInstance());
		
		Estudiante estudiante2 = new Estudiante();

		Programa pr2 = new Programa();
		pr2.setCodigo("2");
		estudiante2.setNombre("Laura Rodriguez");

		pr2.setNombrePrograma("Industrial");
		estudiante2.setCodigo("507161038");
		estudiante2.setDireccion("Bogota");
		estudiante2.setEmail("lauraa.rodrigue@konradlorenz.edu.co");
		estudiante2.setPrograma(pr2);
		estudiante2.setUniversidad(Universidad.getInstance());
		
		Estudiante estudiante3 = new Estudiante();

		Programa pr3 = new Programa();
		pr3.setCodigo("2");
		pr3.setNombrePrograma("Psicologia");
		estudiante3.setNombre("Maria Chavez");

		estudiante3.setCodigo("60165105");
		estudiante3.setDireccion("Bogota");
		estudiante3.setEmail("mariaf.chavez@konradlorenz.edu.co");
		estudiante3.setPrograma(pr3);
		estudiante3.setUniversidad(Universidad.getInstance());
		
		System.out.println(estudiante);
		System.out.println(estudiante2);
		System.out.println(estudiante3);
		
	}
}
