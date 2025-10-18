/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.biblioteca.y.libros;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class BibliotecaYLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // Creamos una biblioteca con nombre
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Creamos tres autores distintos
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // Agregamos cinco libros a la biblioteca, cada uno con su autor
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("L003", "Ficciones", 1944, a3);
        biblioteca.agregarLibro("L004", "El Aleph", 1949, a3);
        biblioteca.agregarLibro("L005", "Harry Potter y la cámara secreta", 1998, a2);

        // Tarea 2: Listar todos los libros con su información
        System.out.println("Listado de libros:");
        biblioteca.listarLibros();

        // Tarea 3: Buscar un libro por su ISBN
        System.out.println("\nBuscar libro por ISBN (L003):");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        // Tarea 6: Filtrar libros por año de publicación
        System.out.println("\nFiltrar libros por año 1997:");
        biblioteca.filtrarLibrosPorAnio(1997);

        // Tarea 5: Eliminar un libro por ISBN y mostrar los restantes
        System.out.println("\nEliminar libro L002:");
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();

        // Tarea 8: Mostrar la cantidad total de libros
        System.out.println("\nCantidad total de libros:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        // Tarea 9: Listar autores disponibles en la biblioteca
        System.out.println("\nAutores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
 