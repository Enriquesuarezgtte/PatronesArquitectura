/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class FlyPattern{ 
    public List<IFlyWeight> lista = new ArrayList<>();
    boolean done = false;
    public void add(String clave, String nombre){
        lista.stream().filter((f) -> ( f.ObtenerNombre().equalsIgnoreCase(nombre))).forEachOrdered((_item) -> {
            done = true;
        });
        if(!done){
            IFlyWeight listas = new Datos(clave, nombre);
            lista.add(listas);
        }else{
        System.out.println("Try Again");

        }
    }
    
    public void show(String tipo){
        lista.stream().filter((f) -> ( f.obtenerValor().equals(tipo))).forEachOrdered((f) -> {
            f.mostrar();
        });
    }
}
