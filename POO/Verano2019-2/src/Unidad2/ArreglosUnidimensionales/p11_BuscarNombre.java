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
public class p11_BuscarNombre {
    public static void main(String[] args) {
        
        //Búsqueda Secuencial en un arreglo de tipo String
        
    }
    
    //arreglos => length   (devuelve la cantidad de elementos de un arreglo)
    //String   => length() (devuelve la cantidad de caracteres de un String)
    
    
    public static int busquedaSecuencial(String dato, String[] nombres){
    
        for (int i = 0; i < nombres.length; i++) {                        
            if (dato.equals(nombres[i])) { //equals se emplea para comparar Strings
                return i;
            }
        }
        
        return -1;
        
    }
    
}
