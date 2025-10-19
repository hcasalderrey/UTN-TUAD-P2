/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LecturaArchivo {
    public static void ejecutar() {
        try ( Scanner lector = new Scanner(new java.io.File("archivo.txt"))) {
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }
    }
}
