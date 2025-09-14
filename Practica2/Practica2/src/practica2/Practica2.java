 
package practica2;
import java.util.Scanner;

/**
 *
 * HERNAN CASALDERREY - UTN TUPAD 2025 - PRACTICA 2
 */
public class Practica2 {

    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Puedes llamar a cada función desde aquí para probarlas
         verificarAnioBisiesto_01(scanner);
        // determinarMayorDeTres_02(scanner);
        // clasificarEdad_03(scanner);
        // calculadoraDescuento_04(scanner);
        // sumaNumerosPares_05(scanner);
        // contadorNumeros_06(scanner);
        // validarNota_07(scanner);
        // calcularPrecioFinal_08(scanner);
        // calcularCostoTotalCompra_09(scanner);
        // actualizarStock_10(scanner);
        // calcularDescuentoEspecial_11(scanner);
        // modificarArrayPrecios_12();
        // impresionRecursivaArray_13();
    }

    public static void verificarAnioBisiesto_01(Scanner scanner) {
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("El año " + anio + (esBisiesto ? " es bisiesto." : " no es bisiesto."));
    }

    public static void determinarMayorDeTres_02(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }

    public static void clasificarEdad_03(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad < 12) System.out.println("Eres un Niño.");
        else if (edad <= 17) System.out.println("Eres un Adolescente.");
        else if (edad <= 59) System.out.println("Eres un Adulto.");
        else System.out.println("Eres un Adulto mayor.");
    }

    public static void calculadoraDescuento_04(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        double descuento = switch (categoria) {
            case 'A' -> 0.10;
            case 'B' -> 0.15;
            case 'C' -> 0.20;
            default -> 0.0;
        };
        double precioFinal = precio * (1 - descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    public static void sumaNumerosPares_05(Scanner scanner) {
        int suma = 0, numero;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + suma);
    }

    public static void contadorNumeros_06(Scanner scanner) {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = scanner.nextInt();
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static void validarNota_07(Scanner scanner) {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    public static void calcularPrecioFinal_08(Scanner scanner) {
        System.out.print("Ingrese el precio base del producto: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = scanner.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = scanner.nextDouble() / 100;
        double finalPrecio = base + (base * impuesto) - (base * descuento);
        System.out.println("El precio final del producto es: " + finalPrecio);
    }

    public static void calcularCostoTotalCompra_09(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = precio + costoEnvio;
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    //funcion para calcular el costo de envio en punto 09
    public static double calcularCostoEnvio(double peso, String zona) {
        return zona.equalsIgnoreCase("Nacional") ? peso * 5 : peso * 10;
    }

    public static void actualizarStock_10(Scanner scanner) {
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = scanner.nextInt();
        int nuevoStock = stock - vendida + recibida;
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static void calcularDescuentoEspecial_11(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void modificarArrayPrecios_12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }

    public static void impresionRecursivaArray_13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
    //funcion para  imprimir array de forma recursiva en punto 13
    public static void imprimirArrayRecursivo(double[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Precio: $" + arr[index]);
            imprimirArrayRecursivo(arr, index + 1);
        }
    }

}
