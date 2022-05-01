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
package Unidad6_Archivos.ArchivosTexto.UsoManejoArchivos;

import Unidad6_Archivos.ArchivosTexto.ManejoArchivos;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Programa_3_Promedio {

    public static void main(String[] args) throws IOException {

        /*
        Calcular el promedio de 3 calificaciones para n estudiantes
         y almacenar la información en un archivo de texto.
         */
        String nombre;
        double promedio = 0;
        int califs[] = new int[3];

        int n;

        Scanner sc = new Scanner(System.in);
        ManejoArchivos archivo = new ManejoArchivos("informacion_grupo");

        System.out.println("Cantidad de Estudiantes: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nombre del estudiante: ");
            nombre = sc.nextLine();
            archivo.EscribirLinea(nombre + " ");            
            for (int j = 0; j < 3; j++) {
                System.out.println("Calificación " + (j + 1));
                califs[j] = sc.nextInt();
                promedio += califs[j];                
                archivo.EscribirLinea(String.valueOf(califs[j]) + " ");
            }
            promedio /= 3;            
            archivo.EscribirLinea(String.valueOf(promedio));
            archivo.SaltoLinea();
            promedio = 0;
        }

    }
}
