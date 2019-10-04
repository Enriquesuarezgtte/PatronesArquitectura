
public class Aprobacion {

	public static void main(String[] args) {
		Facultad facultad = new Facultad();
		
		/*
		 * Suponiendo que los archivos se clasifican de la siguiente forma
		 * 1. Clasificado
		 * 2. Secreto
		 * 3. Muy Secreto
		 */
		
		facultad.aprobarNormal(5);
		facultad.aprobarNormal(1);
		facultad.aprobarNormal(3);
                facultad.aprobarNormal(7);
                facultad.aprobarEspecial(5);
                facultad.aprobarEspecial(6);
                
                

	}

}
