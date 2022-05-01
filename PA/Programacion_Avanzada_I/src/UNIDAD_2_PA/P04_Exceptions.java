package UNIDAD_2_PA;

import java.util.Scanner;

/**
 *
 * @author GuillermoToledano
 * Practice 04 Exceptions
 */
public class P04_Exceptions {

    public static void main(String[] args) {
        try {
            // Bloque de código que pudiera lanzar una excepción
        } catch (Exception ex) { // Manejador de excepciones
            // Bloque de código para resolver la excepción
        }

        Scanner input = new Scanner(System.in);
        /* 
        Se provoca una excepción al intentar divir entre 0,
        el manejador de excepciones notificará el suceso y realizará las 
        acciones pertinentes, evitando que el programa termine de manera
        súbita.
        */
        int result, x, y; 
        try {
            System.out.print("Ingrese el valor de x: ");
            x = input.nextInt();
            System.out.print("Ingrese el valor de y: ");
            y = input.nextInt();
            result = x / y;
        } catch (ArithmeticException ex) {
            /*
            Bloque de código para manejar la excepción
            */
            System.out.println(ex);
            result = 0;
        }
        System.out.println("Resultado: " + result);
        System.out.println("Resto del código.");
        System.out.println("");

        int[] array = new int[4];
        /* 
        Se provoca una excepción al intentar acceder a una posición invalida,
        el manejador de excepciones notificará el suceso y realizará las 
        acciones pertinentes, evitando que el programa termine de manera
        súbita.
        */
        try {
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
            array[4] = 5;

        } catch (ArrayIndexOutOfBoundsException ex) {
            /*
            Bloque de código para manejar la excepción
            */
            System.out.println(ex);
        }
        System.out.println("Resto del código.");
        System.out.println("");
        /* 
        Se provoca una excepción al intentar acceder a una posición invalida,
        el manejador de excepciones notificará el suceso y realizará las 
        acciones pertinentes, evitando que el programa termine de manera
        súbita.
        */
        try {
            array[4] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            /*
            Bloque de código para manejar la excepción
            */
            System.out.println(ex);
        } finally {
            /*
            El bloque de código finally se ejecutará sin importar lo que suceda
            en los bloques try y catch. Por lo resgular se utiliza para liberar
            recursos utilizados en en los bloques anteriores.
            */
            System.out.println("El bloque try-catch ha finalizado.");
        }
    }
}
