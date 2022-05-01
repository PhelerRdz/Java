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
public class p1_sumaValoresArreglo {
    public static void main(String[] args) {
        
        int []numeros = new int[]{6,7,9,2,3,0,5};
     
        // 6 + 7 + 9 + 2 + 3 + 0 + 5 = 
        /*
        //comenzar con
        suma = 0;
        
        //proceso:.. (ciclo)
        suma += 6;  numeros[0]
        suma += 7;  numeros[1]
        suma += 9;  numero2[2]
        .
        .
        .
        suma += 5; numeros[numeros.length - 1]
        
        //salida
        sout(suma)
        */
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            System.out.println("Suma Actual:" + suma);
        }
         
        System.out.println("\nLa suma de los valores del arreglo es: " + suma);
        
    }
}
