/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.universidad.profesor.y.curso;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class UniversidadProfesorYCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Universidad uni = new Universidad("UTN");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "Laura Gómez", "Bases de Datos");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // Crear cursos
        Curso c1 = new Curso("C001", "Álgebra");
        
        Curso c2 = new Curso("C002", "Java");
        Curso c3 = new Curso("C003", "SQL");
        Curso c4 = new Curso("C004", "Estadística");
        Curso c5 = new Curso("C005", "Estructuras de Datos");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C003", "P003");
        uni.asignarProfesorACurso("C004", "P001");
        uni.asignarProfesorACurso("C005", "P002");

        // Listar cursos y profesores
        System.out.println("Cursos:");
        uni.listarCursos();

        System.out.println("\nProfesores:");
        uni.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\nCambiar profesor de C001 a P003:");
        uni.asignarProfesorACurso("C001", "P003");

        // Eliminar curso
        System.out.println("\nEliminar curso C002:");
        uni.eliminarCurso("C002");

        
// Eliminar profesor
        System.out.println("\nEliminar profesor P001:");
        uni.eliminarProfesor("P001");

        // Reporte de cantidad de cursos por profesor
        System.out.println("\nReporte de cursos por profesor:");
        uni.reporteCantidadCursosPorProfesor();


    }
    
}
