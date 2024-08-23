package org.douglasalvarado.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void operation() {
        Double expected = 5.00;
        Double valor1 = 25.00;
        Double valor2 = 5.00;
        Division division = new Division();
        Double result = division.operation(valor1,valor2);
        assertEquals(expected, result, "Resultado de la Division es incorrecta");
    }

    @Test
    void operationError() {
        Double expected = 0.00;
        Double valor1 = 25.00;
        Double valor2 = 0.00;
        Division division = new Division();
        Double result = division.operation(valor1,valor2);
        assertEquals(expected, result, "Resultado de la Division es incorrecta");
    }
}