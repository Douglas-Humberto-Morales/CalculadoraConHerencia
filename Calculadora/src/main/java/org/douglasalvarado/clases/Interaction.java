package org.douglasalvarado.clases;

import java.util.Scanner;

public class Interaction {

    // Declaración de Clases de uso para las operaciones matematicas
    Suma suma = new Suma();
    Rest resta = new Rest();
    Multiplication multiplicacion = new Multiplication();
    Division division = new Division();
    Scanner scanner = new Scanner(System.in);

    public void Selection(){
        // Declaración de variables
        String selection;  // Variable para almacenar la selección del usuario
        Double result;  // Variable para almacenar el resultado de la operación
        Double valor1;  // Primer valor introducido por el usuario
        Double valor2;  // Segundo valor introducido por el usuario

        logger.info("¿Qué operación desea realizar?");
        logger.info("1. Sumar +\n2. Restar -\n3. Multiplicar *\n4. Dividir /");
        selection = scanner.nextLine();

        logger.info("Introduzca los valores");
        logger.info("Valor 1 = ");
        valor1 = scanner.nextDouble();
        logger.info("Valor 2 = ");
        valor2 = scanner.nextDouble();

        // Ejecutar la operación seleccionada utilizando operadores ternarios
        // mandando los valores establecidos
        result = selection.equals("+") ? suma.operation(valor1, valor2) :
                 selection.equals("-") ? resta.operation(valor1, valor2) :
                 selection.equals("*") ? multiplicacion.operation(valor1, valor2) :
                 selection.equals("/") ? division.operation(valor1, valor2) : null;

        logger.info(result == null ? "Seleecion no valida" : ("El resultado es: " + result));

    }

}