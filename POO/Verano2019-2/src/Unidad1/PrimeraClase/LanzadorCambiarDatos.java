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

package Unidad1.PrimeraClase;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class LanzadorCambiarDatos {
    public static void main(String[] args) {
        Animal mascotita;
        Animal mascotita2;
        
        mascotita = new Animal("masc1", "Felix", 2, "Gato", 2500);
        mascotita2 = new Animal("masc2", "Tequila", 12, "Gato", 4500);
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Mascota 1. Nombre Actual: " + mascotita.getNombre());
        System.out.println("Mascota 2. Nombre Actual: " + mascotita2.getNombre());
        
        System.out.println("Mascota 1. Nuevo Nombre: ");
        String n = sc.nextLine();
        
        mascotita.setNombre(n);
        
        System.out.println("Mascota 1. Nombre Actual: " + mascotita.getNombre());
        System.out.println("Mascota 2. Nombre Actual: " + mascotita2.getNombre());
        
    }
}
