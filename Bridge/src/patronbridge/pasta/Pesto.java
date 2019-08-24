/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.pasta;

public class Pesto implements Pasta{
    
    @Override
    public void procesar() {
        cocinarEnBañoMaria();
        System.out.println("Pasta Pesto Elaborada");
    }

    @Override
    public void cocinarEnBañoMaria() {
        System.out.println("\nCocinando al Baño de maria");
    }
}
