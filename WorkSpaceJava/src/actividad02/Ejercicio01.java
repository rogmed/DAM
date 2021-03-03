/*
1. Ejercicio01.java: Crea un programa que permita realizar distintas operaciones matemáticas sobre dos números enteros con unos valores iniciales de 0 y 10 respectivamente. Mediante un SWITCH, el programa debe mostrar el siguiente mensaje al usuario:
Introduzca la operación a realizar del siguiente menú de opciones:
1- Establece el valor del primer número
2- Establece el valor del segundo número
3- Muestra qué número es superior o si son iguales
4- Divide el primer número por el segundo
5-Muestra la progresión numérica desde el primer número hasta el segundo
0-Finalizar
a.	Si el usuario introduce un 1, el programa debe de pedir un número al usuario y establecerlo como el primer número.
b.	Si el usuario introduce un 2, el programa debe de pedir un número al usuario y establecerlo como el segundo número.
c.	Si el usuario introduce un 3, el programa debe mostrar el valor de los dos números e indicar qué número es superior o si ambos son iguales.
d.	Si el usuario introduce un 4, el programa debe mostrar el valor de ambos números y mostrar el resultado de dividir el primero por el segundo siempre que el segundo no sea un 0. Si el segundo es un 0, se debe mostrar un mensaje al usuario indicando que no se puede dividir por 0.
e.	Si el usuario introduce un 5, el programa debe mostrar el valor de ambos números y la progresión numérica entera desde el primer número al segundo siempre que el segundo no sea superior al primero. Por ejemplo, entre 3 y 5 la progresión sería: 3,4,5 
f.	Si el usuario introduce un 0, debe mostrar un mensaje de despedida y finalizar el programa.
Controla mediante un DO WHILE que una vez realizada la operación seleccionada  se vuelva a mostrar el menú de operaciones excepto si el usuario ha introducido un 0. Si se introduce un valor menor a 0 o menor a 5, indica que se ha introducido un valor incorrecto y vuelve a mostrar el menú.

 */
package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;     //Variable para almacenar opcion elegida en el menú
        int numero1 = 0;
        int numero2 = 10;
        double resultado;  //Variable de resultado de operaciones

        do {
            System.out.println("\nIntroduzca la operación a realizar del siguiente menú de opciones:\n"
                    + "1- Establece el valor del primer número (valor actual = " + numero1 + ").\n"
                    + "2- Establece el valor del segundo número (valor actual = " + numero2 + ").\n"
                    + "3- Muestra qué número es superior o si son iguales.\n"
                    + "4- Divide el primer número por el segundo.\n"
                    + "5- Muestra la progresión numérica desde el primer número hasta el segundo.\n"
                    + "0- Finalizar.");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa."
                            + "\nAdios.");
                    break;
                case 1:
                    System.out.print("Introduce el valor de numero1: ");
                    numero1 = Integer.parseInt(br.readLine());
                    break;
                case 2:
                    System.out.print("Introduce el valor de numero2: ");
                    numero2 = Integer.parseInt(br.readLine());
                    break;
                case 3:

                    if (numero1 == numero2) {
                        System.out.println("numero1 ("+numero1+") y numero2 ("+numero2+") son iguales.\n");
                    } else if (numero1 > numero2) {
                        System.out.println("numero1 ("+numero1+") es mayor que numero2 ("+numero2+").\n");
                    } else if (numero1 < numero2) {
                        System.out.println("numero2 ("+numero2+") es mayor que numero1 ("+numero1+").\n");
                    }

                    break;
                case 4:
                    try {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado de dividir numero1 (" + numero1 + ") entre numero2 (" + numero2 + "): " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre 0.");
                    } catch (RuntimeException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Es necesario asignar un valor a numero1 y numero2 antes de operar.\n");
                    }
                    break;
                case 5:
                    try {
                        if (numero1 < numero2) {
                            System.out.println("Progresión númerica desde " + numero1 + " hasta " + numero2 + ":");
                            for (int i = numero1; i <= numero2; i++) {
                                System.out.println(i);
                            }
                        } else {
                            System.out.println("numero1 debe ser menor que numero2.\n");
                        }
                    } catch (RuntimeException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Se deben de introducir valores para numero1 y numero2, siendo este último mayor.");
                    }
                    break;
            }
        } while (opcion != 0);
    }

}
