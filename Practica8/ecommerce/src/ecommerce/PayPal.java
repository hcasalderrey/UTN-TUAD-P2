/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;


public class PayPal implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }
}

