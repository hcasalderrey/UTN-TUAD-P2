/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *
 * @author HERNAN CASALDERREY UTN TUPAD 2025
 */
public class Practica3 {
 
    public static void main(String[] args) {
          Estudiante estudiante = new Estudiante("Ana", "Gómez", "Programación II", 7.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.0);
        estudiante.bajarCalificacion(0.5);
        estudiante.mostrarInfo();

        // 2. Registro de Mascotas
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        // 3. Encapsulamiento con Libro
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        libro.setAñoPublicacion(3000); // inválido
        libro.setAñoPublicacion(2000); // válido
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAñoPublicacion());

        // 4. Gestión de Gallinas
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);
        g1.envejecer(); g1.ponerHuevo(); g1.ponerHuevo();
        g2.envejecer(); g2.envejecer(); g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // 5. Simulación de Nave Espacial
        NaveEspacial nave = new NaveEspacial("Apolo", 50);
        nave.avanzar(60); // insuficiente
        nave.recargarCombustible(40);
        nave.avanzar(60);
        nave.mostrarEstado();
    }
    
}


class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Curso: " + curso + " - Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}

class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - Especie: " + especie + " - Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido.");
        }
    }
}

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina + " - Edad: " + edad + " - Huevos: " + huevosPuestos);
    }
}

class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
        } else {
            System.out.println("No se puede superar el límite de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible restante: " + combustible);
    }
}