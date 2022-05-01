/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 */

package Unidad1.Ejemplo_1;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class UsoMetodos4 {
//API  = APPLICATION PROGRAMMING INTERFACE
    
    public static void main(String[] args) {
        //EOF = END OF FILE
        
        //EN WINDOWS EOF SE EMULA CON:  CTRL + Z
        Scanner sc = new Scanner(System.in);
        
        int numero, potencia;
        
        while (sc.hasNext()) {            
            numero = sc.nextInt();
            potencia = sc.nextInt();
            
            System.out.println("Potencia: " + Potencia(numero, potencia));
        }
        
    }
    
    public static int Potencia(int n, int x){
        return (int)Math.pow(n, x);
    }
}
