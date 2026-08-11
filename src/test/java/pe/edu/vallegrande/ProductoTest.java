package pe.edu.vallegrande;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductoTest {

    @Test
    void probarCalcularPromedio_Caso1() {
        producto prod = new producto("ProductoTest", 0);
        double res = prod.calcularPromedio(15, 14, 16);
        assertEquals(15, res);
    }

    @Test
    void probarCalcularPromedio_Caso2() {
        producto prod = new producto("ProductoTest", 0);
        double res = prod.calcularPromedio(10, 12, 14);
        assertEquals(12, res);
    }

    @Test
    void probarCalcularPromedio_Caso3() {
        producto prod = new producto("ProductoTest", 0);
        double res = prod.calcularPromedio(20, 18, 16);
        assertEquals(18, res);
    }

    @Test
    void probarEstaAprobado_Caso1() {
        producto prod = new producto("ProductoTest", 0);
        boolean res = prod.estaAprobado(15);
        assertTrue(res);
    }

    @Test
    void probarEstaAprobado_Caso2_Limite() {
        producto prod = new producto("ProductoTest", 0);
        boolean res = prod.estaAprobado(13);
        assertTrue(res);
    }

    @Test
    void probarEstaAprobado_Caso3() {
        producto prod = new producto("ProductoTest", 0);
        boolean res = prod.estaAprobado(12);
        assertFalse(res);
    }

    @Test
    void probarEstaAprobado_Caso4() {
        producto prod = new producto("ProductoTest", 0);
        boolean res = prod.estaAprobado(5);
        assertFalse(res);
    }

    @Test
    void probarEstaAprobado_Caso8_Justificado() {
        producto prod = new producto("ProductoTest", 0);
        boolean res = prod.estaAprobado(12.999);
        assertFalse(res);
    }
}
