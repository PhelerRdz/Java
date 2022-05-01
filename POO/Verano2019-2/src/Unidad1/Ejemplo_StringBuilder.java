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

package Unidad1;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Ejemplo_StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder aux = new StringBuilder();
                
        for (int i = 1; i <= 100; i++) {
            aux.append("El número " + i);
            
            if (i%2!=0) {
                aux.append(" NO ");
            }
            aux.append(" Es PAR \n");                        
            
        }
        
        String result = aux.toString();
        
        System.out.println(result);
        
        
        
    }
}
