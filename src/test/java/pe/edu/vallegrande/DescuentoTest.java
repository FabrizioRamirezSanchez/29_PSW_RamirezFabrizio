package pe.edu.vallegrande;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DescuentoTest {

    private final Descuento descuento = new Descuento();
    private static final double DELTA = 0.001;

    @Test
    void testDescuentoDiezPorCiento() {
        // Caso 1: Precio 100 con 10% de descuento
        double resultado = descuento.calcularPrecioFinal(100, 10);
        assertEquals(90, resultado, DELTA);
    }

    @Test
    void testDescuentoVeintePorCiento() {
        // Caso 2: Precio 200 con 20% de descuento
        double resultado = descuento.calcularPrecioFinal(200, 20);
        assertEquals(160, resultado, DELTA);
    }

    @Test
    void testDescuentoCeroPorCiento() {
        // Caso 3: Precio 50 con 0% de descuento
        double resultado = descuento.calcularPrecioFinal(50, 0);
        assertEquals(50, resultado, DELTA);
    }

    @Test
    void testDescuentoCincuentaPorCiento() {
        // Caso 4: Precio 500 con 50% de descuento
        double resultado = descuento.calcularPrecioFinal(500, 50);
        assertEquals(250, resultado, DELTA);
    }

    @Test
    void testDescuentoCienPorCiento() {
        // Caso 5 (adicional): Precio 100 con 100% de descuento
        // Este caso es importante porque prueba el límite donde el descuento elimina completamente el precio.
        // Es un caso edge que valida que el método maneje correctamente cuando el resultado es 0.
        double resultado = descuento.calcularPrecioFinal(100, 100);
        assertEquals(0, resultado, DELTA);
    }
}
