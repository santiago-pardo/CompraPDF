package edu.unidad4;
import java.util.List;

public class CalculadoraCompra {
    private static final double MINIMO_DESCUENTO= 200000;
    private static final double PORCENTAJE_DESCUENTO= 0.10;

    public double calcularSubtotal(List<Producto>productos){
        if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("la compra debe tener productos");
        }
        double subtotal =0;
        for(Producto producto: productos){
            subtotal += producto.calcularTotal();
        }
        return subtotal;
    }
    public double calcularDescuento(double subtotal) {
        if (subtotal >= MINIMO_DESCUENTO) {
            return subtotal * PORCENTAJE_DESCUENTO;
        }
        return 0;
    }


    public double calcularTotal(double subtotal,double descuento){
        return subtotal-descuento;

    }



}
