**6. 5º caso propuesto y su justificación**

**Caso propuesto:** `probarEstaAprobado_Caso8_Justificado`
- **Entrada:** Promedio = 12.999
- **Resultado esperado:** false

**Justificación:**

Este caso de prueba evalúa el comportamiento del método con valores decimales en el límite de aprobación (13.0). Es importante verificar que el método maneje correctamente valores decimales, ya que `calcularPromedio()` puede retornar valores con decimales (ej: promedio de 13, 13, 13 = 13.0, o promedio de 12, 13, 14 = 13.0). 

Prueba el caso límite con precisión decimal para asegurar que valores como 12.999 (justo por debajo de 13) sean correctamente identificados como desaprobados, evitando posibles errores de redondeo o comparación de punto flotante.
