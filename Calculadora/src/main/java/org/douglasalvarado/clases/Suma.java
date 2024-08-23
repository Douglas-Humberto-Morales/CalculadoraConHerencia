package org.douglasalvarado.clases;

import org.douglasalvarado.interfaz.OperationGenerals;

public class Suma extends OperationGenerals {

    @Override
    public Double operation(Double valor1, Double valor2) {
        return valor1 + valor2;
    }
}
