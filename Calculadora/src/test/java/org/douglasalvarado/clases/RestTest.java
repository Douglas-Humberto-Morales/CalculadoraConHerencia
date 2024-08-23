package org.douglasalvarado.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestTest {

    @Test
    void operation() {
        Double expected = 5.00;
        Double valor1 = 10.00;
        Double valor2 = 5.00;
        Rest rest = new Rest();
        Double result = rest.operation(valor1,valor2);
        assertEquals(expected, result, "Resultado de la Resta es incorrecta");
    }
}