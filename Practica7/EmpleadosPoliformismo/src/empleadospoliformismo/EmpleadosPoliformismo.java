/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleadospoliformismo;

/**
 *
 * @author HERNAN CASALDERREY
 */
import java.util.ArrayList;
public class EmpleadosPoliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 300));
        empleados.add(new EmpleadoPlanta("Carlos", 60000));

        System.out.println("Listado de sueldos:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " -> Sueldo: $" + e.calcularSueldo());

            // Clasificación usando instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
 // TODO code application logic here
    }
    
}
