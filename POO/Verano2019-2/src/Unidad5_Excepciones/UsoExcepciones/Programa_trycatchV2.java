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
package Unidad5_Excepciones.UsoExcepciones;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Programa_trycatchV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        int i = 0;
        while (i < 10) {
            try {
                System.out.println("División No." + (i+1)+ ":");
                
                a = Integer.parseInt(sc.next());
                b = Integer.parseInt(sc.next());
                System.out.println(a / b);
                
                i++;

            } catch (Exception ex) {
                System.out.println("Error en la entrada");
            } finally {
                System.out.println("Fin de la iteración");
            }
        }

    }
}
