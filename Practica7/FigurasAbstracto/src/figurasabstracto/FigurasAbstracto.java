/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasabstracto;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class FigurasAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo", 5);
        figuras[1] = new Rectangulo("Rectángulo", 4, 6);
        figuras[2] = new Circulo("Círculo pequeño", 2);

        System.out.println("Áreas de las figuras:");
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " -> Área: " + f.calcularArea());
        }
 // TODO code application logic here
    }
    
}
