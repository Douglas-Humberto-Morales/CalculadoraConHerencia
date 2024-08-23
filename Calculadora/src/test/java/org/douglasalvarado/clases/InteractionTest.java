package org.douglasalvarado.clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Scanner;

import static org.mockito.Mockito.when;

class InteractionTest {

    Double valor1;
    Double valor2;
    Double result;

    //Mock: Hace una simulacion de la clase
    @Mock
    private Suma suma;

    @Mock
    private Rest rest;

    @Mock
    private Multiplication multiplication;

    @Mock
    private Division division;

    @Mock
    private Scanner scanner;

    // InjectMocks: Esto inyecta los mocks en una
    // instancia de la clase Interaction, reemplazando
    // las instancias reales con las simuladas.
    @InjectMocks
    private Interaction interaction;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void selectionSuma() {
        // Los when con scanner hacen una simulación
        // de valores a escojer en el momento de la ejecución
        when(scanner.nextInt()).thenReturn(1);
        when(scanner.nextDouble()).thenReturn(8.00,7.00);

        // El when con suma hace una simulacion de su método
        // operation para validar si returna el valore esperado
        when(suma.operation(8.00,7.00)).thenReturn(15.00);
        interaction.Selection();
    }

    @Test
    void selectionRest() {
        when(scanner.nextInt()).thenReturn(2);
        when(scanner.nextDouble()).thenReturn(10.00,7.00);
        when(rest.operation(10.00,7.00)).thenReturn(3.00);
        interaction.Selection();
    }

    @Test
    void selectionMultiplication() {
        when(scanner.nextInt()).thenReturn(3);
        when(scanner.nextDouble()).thenReturn(5.00,5.00);
        when(multiplication.operation(5.00,5.00)).thenReturn(25.00);
        interaction.Selection();
    }

    @Test
    void selectionDivision() {
        when(scanner.nextInt()).thenReturn(4);
        when(scanner.nextDouble()).thenReturn(10.00,5.00);
        when(division.operation(10.00,5.00)).thenReturn(1.00);
        interaction.Selection();
    }

    @Test
    void selectionNoOperation() {
        when(scanner.nextInt()).thenReturn(5);
        when(scanner.nextDouble()).thenReturn(10.00,5.00);
        when(rest.operation(10.00,5.00)).thenReturn(0.00);
        interaction.Selection();
    }
}