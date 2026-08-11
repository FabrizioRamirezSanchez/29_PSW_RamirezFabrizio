package pe.edu.vallegrande;

public class producto {

    private String nombre;
    private double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularTotal(int cantidad) {
        return precio + cantidad;
    }

    public double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public boolean estaAprobado(double promedio) {
        return promedio >= 13;
    }
}
