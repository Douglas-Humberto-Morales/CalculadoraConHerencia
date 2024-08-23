package org.douglasalvarado.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void operation() {
        Double expected = 10.00;
        Double valor1 = 5.00;
        Double valor2 = 2.00;
        Multiplication multiplication = new Multiplication();
        Double result = multiplication.operation(valor1,valor2);
        assertEquals(expected, result, "Resultado de la Multiplicación es incorrecta");
    }
}