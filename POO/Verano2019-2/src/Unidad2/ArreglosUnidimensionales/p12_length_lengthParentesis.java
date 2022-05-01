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
public class p12_length_lengthParentesis {
    public static void main(String[] args) {
        /*
        Dado un arreglo de Strings, y un número de letras
        se retornará las vocales de las palabras que contengan 
        igual o mayor cantidad de el número de letras indicado.
        
        cantidad de letras = 5
        
        Oso
        Perro
        Martín
        Javier
        Manuel
        Sosa
        Jesús
        Rodríguez
        
        Salida:
            
            Perro: e o
            Martín: a í
            Javier: a i e 
            Manuel: a u e 
            Jesús: e ú
            Rodríguez: o í u e
        
        */
        
        String palabras[];
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Total de Palabras: ");
        int totalPalabras = sc.nextInt();
        /*
        CUANDO SE HACE LECTURA DE UNA VARIABLE NÚMERICA, 
        SE ALMACENA ADEMÁS DEL NÚMERO LA TECLA ENTER. 
        DE ESTA FORMA, AL QUERERSE LEER UN TEXTO POR "nextLine" 
        OCASIONA QUE EL ENTER IMPOSIBILITE EL INGRESAR LA INFORMACIÓN
        PARA EVITAR ESTO, SE DEBE HACER EMPLEO DE UNA 
        LIMPIEZA DLE BUFFER (ELIMINAR EL ENTER), ESTO SE LOGRA 
        MEDIATE EL USO DE UN "nextLine" AL AIRE (SIN ASIGNACIÓN).
        */
        sc.nextLine();
        
        palabras = new String[totalPalabras];
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingresa la Palabra: " +  (i+1));
            palabras[i] = sc.nextLine();
        }
        
        
    }
}
