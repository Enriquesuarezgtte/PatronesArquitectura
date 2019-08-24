/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;

import java.util.Scanner;
import patronbridge.hamburguesa.*;
import patronbridge.pasta.*;
import patronbridge.perro.*;



public class PatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
        Preparacion producto = null;   
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("");
            System.out.println("Seleccione el producto que desea preparar");
            System.out.println("");
            System.out.println("1. Pasta Bolonesa");
            System.out.println("2. Pasta de Espinacas");
            System.out.println("3. Pasta Pesto");
            System.out.println("");
            System.out.println("4. Hamburguesa Doble Carne");
            System.out.println("5. Hamburguesa Todo Terreno");
            System.out.println("6. Hamburguesa Vegetariana");
            System.out.println("");
            System.out.println("7. Choriperro");
            System.out.println("8. Perro caliente Sencillo");
            System.out.println("9. Perro caliente Transmilenio");
            System.out.println("");
            System.out.println("0. Salir");            
            System.out.println("");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    producto = new ElaborarProducto(new Bolonesa());         
                    break;
                case 2:
                    producto = new ElaborarProducto(new Espinacas());         
                    break;
                case 3:
                    producto = new ElaborarProducto(new Pesto());      
                    break;
                case 4:
                    producto = new ElaborarProducto(new DobleCarne());         
                    break;
                case 5:
                    producto = new ElaborarProducto(new TodoTerreno());        
                    break;
                case 6:
                    producto = new ElaborarProducto(new Vegetariana());        
                    break;
                case 7:
                    producto = new ElaborarProducto(new Choriperro());        
                    break;
                case 8:
                    producto = new ElaborarProducto(new Sencillo());        
                    break;
                case 9:
                    producto = new ElaborarProducto(new Transmilenio());        
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("La opción seleccionada no existe");
                    break;
            }
            if(producto != null){
                producto.obtener();
            }
        }
    }

}}
