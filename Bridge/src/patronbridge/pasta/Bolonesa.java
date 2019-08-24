/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.pasta;

import patronbridge.IProcesar;

public class Bolonesa implements Pasta{

    @Override
    public void procesar() {
        cocinarEnBañoMaria();
        System.out.println("Pasta de Boloñesa PREPARADA");
    }

    @Override
    public void cocinarEnBañoMaria() {
        System.out.println("\n Cocinando al baño de maria");
    }
}
