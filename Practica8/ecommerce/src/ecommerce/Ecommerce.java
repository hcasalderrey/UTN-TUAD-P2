/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;

/**
 *
 * @author HERNAN CASALDERREY
 */
public class Ecommerce {

   
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Hernán");

        // Crear productos
        Producto p1 = new Producto("Notebook", 150000);
        Producto p2 = new Producto("Mouse", 5000);
        Producto p3 = new Producto("Teclado", 8000);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Cambiar estado del pedido
        pedido.cambiarEstado("En preparación");

        // Procesar pago con tarjeta de crédito
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        // Procesar pago con PayPal
        PayPal paypal = new PayPal();
        double totalConDescuentoPayPal = paypal.aplicarDescuento(total);
        paypal.procesarPago(totalConDescuentoPayPal);
    }

    
}
