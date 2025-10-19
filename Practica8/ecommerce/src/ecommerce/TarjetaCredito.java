/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;


public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con tarjeta de crédito: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento
    }
}

