/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class FlyPattern{ 
        public List<String> lista = new ArrayList<>();
        public HashMap<String, String> hashMap = new HashMap<>();
        
    public void add(String clave, String nombre){
        if(hashMap.containsKey(clave)){
                    System.out.println("Try Again");

        }else{
            hashMap.put(clave, nombre);
            lista.add(clave);
        }
    }
    
    public void show(String tipo){
        for(String s: lista){
            System.out.println(s);
        }
    }
}
