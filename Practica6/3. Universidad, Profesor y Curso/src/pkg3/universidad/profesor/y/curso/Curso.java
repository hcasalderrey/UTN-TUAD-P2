package pkg3.universidad.profesor.y.curso;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // quita de la lista anterior
        }
        this.profesor = p;
        if (p != null && !p.cursos.contains(this)) {
            p.agregarCurso(this); // agrega al nuevo profesor
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + "), Profesor: " +
                (profesor != null ? profesor.getId() : "Sin asignar"));
    }
}