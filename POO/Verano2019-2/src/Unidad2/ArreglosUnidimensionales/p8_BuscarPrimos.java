/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 * 
 * EQUIPO
 * 
 * INTEGRANTES:
 * NOMBRE1
 * NOMBRE2
 * 
 * CONTACTO EQUIPO: 
 */
package Unidad2.ArreglosUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class p8_BuscarPrimos {

    public static void main(String[] args) {

        int numeros[];
        System.out.println("Cuantos elementos tiene el arreglo?");

        Scanner sc = new Scanner(System.in);
        int totalElementos = sc.nextInt();

        numeros = new int[totalElementos];

        //Asignación
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dame el Elemento: " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        //
        System.out.println("Lista de Primos en el arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            if (EsPrimo(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }

    }

    public static boolean EsPrimo(int dato) {
        if (dato == 1) {
            return false;
        }
        for (int i = 2; i < dato; i++) {
            if (dato % i == 0) {
                return false;
            }
        }

        return true;
    }

}
