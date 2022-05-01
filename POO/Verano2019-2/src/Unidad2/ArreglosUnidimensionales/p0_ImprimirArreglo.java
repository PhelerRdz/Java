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
public class p0_ImprimirArreglo {
    public static void main(String[] args) {
        
        int []numeros = new int[]{6,7,9,2,3,0,5};
        
        //numeros.length = total de elementos del arreglo
        
        /*
            este ciclo for va a ir de 0 a tamaño - 1
            por cada posición se imprimirá en consola 
            la posición i del arreglo.
        
            Es decir, la primera iteración imprimirá 
            la posición 0, la segunda interación la posición 1,
            y asi sucesivamente hasta llegar a la posición tamaño - 1
            Siendo esta posición, la última posición valida
            para el arreglo. Esto debido a que intentar 
        acceder a un posición mayor ocasionará intentar acceder
        a un elemento que no existe en el arreglo debido al 
        tamaño del mismo.
            
        */
        
        System.out.println("Contenido del Arreglo");              
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
    }
}
