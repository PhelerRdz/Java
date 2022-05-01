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
public class p2_promedioValoresVector {
    public static void main(String[] args) {
        
        int []numeros = new int[]{6,7,9,2,3,0,5};
        
        /*
        EL PROCEDIMIENTO ES SIMILAR A LA SUMA, CON LA DIFERENCIA
        DE QUE DESPUÉS DE HABER SUMADO, SE DEBERÁ 
        DIVIR LA SUMA ENTRE EL TOTAL DE ELEMENTOS DE ARREGLO
        */
        
        int suma = 0;
        double promedio;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        promedio = (double)suma/numeros.length;
                
        System.out.println("Promedio:" + promedio);
    
    }
}
