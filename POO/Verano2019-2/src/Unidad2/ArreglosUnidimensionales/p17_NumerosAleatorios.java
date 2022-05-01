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
public class p17_NumerosAleatorios {
    public static void main(String[] args) {
        //Formas de utilizar aleatorios en JAVA
        //Math.random()
        //Random rnd;
        
        Random rnd;  
        
        //Genera valor en el intervalo cerrado:
        // rnd.nextInt(n);  // [0 - (n-1)]  
        //si n = 10 ... entonces... [0 - 9]

        //Generar valores en el intervalo [x - y]
        int x= 50; //valor Menor
        int y= 100; //valor Mayor
        
        //int valAleatorio = x + rnd.nextInt(y-x+1);

        
        rnd = new Random(); //Sin semilla                        
        System.out.println("Sin Semilla");
        for (int i = 0; i < 10; i++) {
            System.out.println(x+rnd.nextInt(y-x+1));
        }
        
        System.out.println("");
        rnd = new Random(4000); //Argumento: Semilla
        System.out.println("Con Semilla");
        for (int i = 0; i < 10; i++) {
            System.out.println(x+rnd.nextInt(y-x+1));
        }
          
        
        
    }
}
