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
        int selection;  // Variable para almacenar la selección del usuario
        Double result;  // Variable para almacenar el resultado de la operación
        Double valor1;  // Primer valor introducido por el usuario
        Double valor2;  // Segundo valor introducido por el usuario

        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        selection = scanner.nextInt();

        System.out.println("Introduzca los valores");
        System.out.println("Valor 1 = ");
        valor1 = scanner.nextDouble();
        System.out.println("Valor 2 = ");
        valor2 = scanner.nextDouble();

        // Ejecutar la operación seleccionada utilizando operadores ternarios
        // mandando los valores establecidos
        result = selection == 1 ? suma.operation(valor1, valor2) :
                 selection == 2 ? resta.operation(valor1, valor2) :
                 selection == 3 ? multiplicacion.operation(valor1, valor2) :
                 selection == 4 ? division.operation(valor1, valor2) : null;

        String texts =
                result == null ? "Seleecion no valida" : ("El resultado es: " + result);

        System.out.println(texts);
    }

}
