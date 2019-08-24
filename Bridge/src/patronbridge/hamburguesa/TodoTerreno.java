/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.hamburguesa;


public class TodoTerreno implements Hamburguesa{

    @Override
    public void preparacionCubierta() {
        System.out.println("Preparando Pan");
    }

    @Override
    public void procesar() {
        preparacionCubierta();
        System.out.println("Hamburguesa Todo Terreno Procesada");
    }
    
}
