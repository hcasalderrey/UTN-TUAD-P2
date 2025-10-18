/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.universidad.profesor.y.curso;

/**
 *
    * @author HERNAN CASALDERREY
 */
import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void agregarCurso(Curso c) {
        
        if (!cursos.contains(c)) {
                cursos.add(c);

        }
    }

    public void eliminarCurso(Curso c) {
           cursos.remove(c);
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + "), ID: " + id +
                ", Cursos dictados: " + cursos.size());
    }
}
