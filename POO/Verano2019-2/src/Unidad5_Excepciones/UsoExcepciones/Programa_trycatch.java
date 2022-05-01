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
public class Programa_trycatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        try {
            
            for (int i = 0; i < 10; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a / b);
            }
            
        } catch (Exception ex) {
            System.out.println("Error en la entrada");
        } finally {
            System.out.println("Fin del Programa");
        }

    }

}
