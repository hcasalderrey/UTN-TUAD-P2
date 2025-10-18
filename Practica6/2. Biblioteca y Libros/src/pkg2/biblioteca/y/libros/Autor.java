/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.biblioteca.y.libros;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + "), ID: " + id);
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}