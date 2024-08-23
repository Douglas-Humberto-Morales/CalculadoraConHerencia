package org.douglasalvarado.clases;

import org.douglasalvarado.interfaz.OperationGenerals;

public class Division extends OperationGenerals {

    @Override
    public Double operation(Double valor1, Double valor2) {
        return valor2 == 0 ? 0.00 : valor1 / valor2;
    }
}
