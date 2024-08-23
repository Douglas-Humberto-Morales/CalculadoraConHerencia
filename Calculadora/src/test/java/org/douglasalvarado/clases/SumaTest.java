package org.douglasalvarado.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @Test
    void operation() {
        Double expected = 15.00;
        Double valor1 = 8.00;
        Double valor2 = 7.00;
        Suma suma = new Suma();
        Double result = suma.operation(valor1,valor2);
        assertEquals(expected, result , "Resultado de la Suma es incorrecta");
    }
}