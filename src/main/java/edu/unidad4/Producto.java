package edu.unidad4;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precioUnitario;


    public Producto(String nombre, int cantidad, double precioUnitario) {

        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("el nombre del producto es obligatorio");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("la cantidad  debe ser mayor a cero");
        }

        if (precioUnitario < 0) {
            throw new IllegalArgumentException("el precio unitario debe ser mayor a cero");
        }
    }

    public double calcularTotal(){
        return cantidad*precioUnitario;
    }





}
