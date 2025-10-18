/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalesoverride;

/**
 *
 * @author HERNAN CASALDERREY
 */

import java.util.ArrayList;

public class AnimalesOverride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Misu"));
        animales.add(new Vaca("Lola"));

        System.out.println("Sonidos de los animales:");
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // Polimorfismo: se ejecuta el método sobrescrito
        }
 
    }
    
}
