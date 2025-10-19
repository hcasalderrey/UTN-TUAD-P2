/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        System.out.println("Ejercicio 1: División segura");
        DivisionSegura.ejecutar();

        System.out.println("\nEjercicio 2: Conversión de cadena a número");
        CadenaNumero.ejecutar();

        System.out.println("\nEjercicio 3: Lectura de archivo");
        LecturaArchivo.ejecutar();

        System.out.println("\nEjercicio 4: Validación de edad");
        ValidarEdad.ejecutar();

        System.out.println("\nEjercicio 5: Lectura con try-with-resources");
        LecturaConTryResources.ejecutar();
    }

}
