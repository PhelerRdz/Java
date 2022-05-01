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
public class p3_SeleccionarPorIndice {
    public static void main(String[] args) {
        
        int []numeros = new int[]{6,7,9,2,3,0,5,10};
        
        System.out.println("Total de Elementos: " + numeros.length);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("De que índice quieres visualizar su valor?");
        int indice = sc.nextInt();
        
        //if (indice >=0 && indice <= numeros.length-1) {
            System.out.println("Valor: " + numeros[indice]);    
        //}
        
        
    }
}
