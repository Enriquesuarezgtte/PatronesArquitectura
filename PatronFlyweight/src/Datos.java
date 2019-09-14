/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Enrique
 */
public class Datos implements IFlyWeight{
    
    String key = "";
    String value = "";
    
    public Datos(String tipo, String nombre){
        this.key = tipo;
        this.value = nombre;
    }
    
    @Override
    public void mostrar() {
        System.out.println(key + " " + value);
    }

    @Override
    public String ObtenerNombre() {
        return value;
    }

    @Override
    public String obtenerValor() {
        return key;
    }
    
}
