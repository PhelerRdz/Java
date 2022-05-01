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
public class p14_QuitarVocales {
    public static void main(String[] args) {
        
        String nombre = "Angel Manuel Sarmiento Gutierrez";
        
        nombre = nombre.toLowerCase(); //Para hacer Minusculas
        nombre = nombre.replaceAll("[aeiou]+", "");
        
        System.out.println("Nombre : " + nombre);
        
    }
}
