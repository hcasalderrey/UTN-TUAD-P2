/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

/**
 *
 * @author el_to
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciación con constructor completo
        Empleado emp1 = new Empleado(101, "Ana Torres", "Gerente", 85000);
        Empleado emp2 = new Empleado(102, "Luis Gómez", "Analista", 60000);

        // Instanciación con constructor parcial
        Empleado emp3 = new Empleado("Carla Ruiz", "Desarrolladora");
        Empleado emp4 = new Empleado("Jorge Pérez", "Tester");

        // Aplicación de métodos sobrecargados
        emp1.actualizarSalario(10); // aumento por porcentaje
        emp2.actualizarSalario(5000); // aumento fijo

        // Mostrar información
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }

}

class Empleado {

    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;
    private static int contadorId = 1;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor parcial con id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; // salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
