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
public class p13_Futuro_StringsCaracteres {
    public static void main(String[] args) {
        
        String nombre = "Yenifer Diaz de Leon Torres"; //cadena de caracteres
        
        char aux;
        
        for (int i = 0; i < nombre.length(); i++) {
            //System.out.println(nombre[i]); No es correcto acceder de esta forma        
            //System.out.println(nombre.charAt(i)); //accede al caracter de la posición i
            
            aux = nombre.charAt(i);
            if (aux!='i') {                                        
                System.out.println(aux);
            }
        }
        
    }
}
