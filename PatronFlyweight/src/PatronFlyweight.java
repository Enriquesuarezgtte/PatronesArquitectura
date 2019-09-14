/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Enrique
 */
public class PatronFlyweight {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static FlyPattern flyPattern = new FlyPattern();
    
    public static void main(String[] args) throws IOException {
        
        while(true){
            System.out.println(" 1. Add pais");
            System.out.println(" 2. Agregar sedes Konrad");
            System.out.println(" 3. Agregar facultades Konrad");
            System.out.println(" 4. Agregar programas ");
            System.out.println(" 5. Mostrar pais");
             System.out.println(" 6. Mostrar sedes universidad");
            System.out.println(" 7. Mostrar facultades universidad");
            System.out.println(" 8. Mostrar programas academicos");
            System.out.println(" 9. Exit");
            switch (br.readLine()){
                case "1":
                    System.out.println("Ingrese el nombre del pais");
                    addToList("pais");
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la sede");
                    addToList("sede");
                    break;
                case "3":
                    System.out.println("Ingrese el nombre de la facultad");
                    addToList("facultad");
                    
                    break;
                case "4":
                    System.out.println("Ingrese el nombre del programa academico");
                    addToList("programa");
                    break;
                case "5":
                    System.out.println("Mostrar paises");
                    showList("pais");
                    break;
                case "6":
                    System.out.println("Mostrar sedes");
                    showList("sede");                
                    break;
                case "7":
                    System.out.println("Mostrar facultades");
                    showList("facultad");
                    break;
                case "8":
                    System.out.println("Mostrar programas academicos");
                    showList("programa");
                    break;
                case "9":
                    System.exit(0);
                    break;
                    
                 default:
                    System.out.println("Ingrese un número correcto");
                    
            }
        }
        
    }

    private static void addToList(String tipo) throws IOException {
         
        flyPattern.add(tipo,  br.readLine());
        
    }

    private static void showList(String tipo) {
        flyPattern.show(tipo);
    }
    
}
