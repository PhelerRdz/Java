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

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class p5_ImprimirVectorRevez {
    public static void main(String[] args) {
        int []numeros = new int[]{6,7,9,2,3,0,5,10};
        
        /*
        0 1 2 ... .   (numeros.length-1)
        */
        
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
