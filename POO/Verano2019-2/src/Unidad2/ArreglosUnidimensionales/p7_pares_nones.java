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
public class p7_pares_nones {
    public static void main(String[] args) {
        
        //par  = aquel número en el que el residuo de dividir entre 2 es 0
        //none = aquel número en el que el residuo de dividir entre 2 no es 0
        
        /*
        0. obtener los valores del arreglo
        1.- dado el arreglo, recorrer el arreglo
        2.- checar si cada elemento del arreglo es par o none
        3.- imprimir el tipo que es el elemento 
        
        */
        
        Scanner sc = new Scanner(System.in);
        
        //obtener el arreglo
        int array[];
        array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dame el valor de la posición : " +
                    (i+1) + " del arreglo");
            array[i] = sc.nextInt();
        }
    
        //fin obtener arreglo
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.println(array[i] + " Es par");
            }else {
                System.out.println(array[i] + " No es Par");
            }
        }
        
    }
}
