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
public class p4_seleccionarPorElemento {
    public static void main(String[] args) {
        
        int []numeros = new int[]{6,7,9,2,3,0,5,10};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Total de Elementos en el arreglo: " + numeros.length);
        
        int elemento;
        
        System.out.println("Que elemento del arreglo quieres?");
        elemento = sc.nextInt();
        
        //[1 2 3 4 5 ....  n]
        
        System.out.println("El Elemento seleccionado es: " + numeros[elemento-1]);
        
    }   //NOTA: RECUERDA SIEMPRE QUE PARA ACCEDER A UN ELEMENTO DE UN 
        //ARREGLO SE REQUIERE ACCEDER POR SU "ÍNDICE"...
}
