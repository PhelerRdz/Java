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

import java.util.Random;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class p18_Desordenamiento {

    public static void main(String[] args) {

        int numeros[] = new int[]{1, 2, 3, 4, 5};

        Random rnd = new Random();
        int posNueva;
        int aux;

        for (int k = 0; k < 10; k++) {

            for (int i = 0; i < numeros.length; i++) {
                posNueva = rnd.nextInt(numeros.length);

                aux = numeros[i];
                numeros[i] = numeros[posNueva];
                numeros[posNueva] = aux;
            }

            System.out.print("\nDesordenamiento " + (k+1) +":  ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

        }
    }
}
