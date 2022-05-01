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
public class p10_valorMayor {
    public static void main(String[] args) {
        
        int linea[];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de Elementos:");
        int tam = sc.nextInt();
        
        linea = new int[tam];
        
        for (int i = 0; i < linea.length; i++) {
            System.out.println("Elemento " + (i+1));
            linea[i] = sc.nextInt();
        }
        
        //¿Cuál de todos los elementos del arreglo es mayor?
        int aux = linea[0]; 
        //aux  será empleado para contener el valor mayor del arreglo
        
        for (int i = 1; i < linea.length; i++) {
            if (aux<linea[i]) {
                aux = linea[i];
            }
        }
        
        System.out.println("Valor MAyor: " + aux);
    }
}
