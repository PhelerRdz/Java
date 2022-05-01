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
public class p15_Ordenamiento {
    public static void main(String[] args) {
        int numeros[] = new int[]{2,6,8,7,1,8};
        
        OrdenamientoBurbuja(numeros);
        
        System.out.println("Arreglo Numeros Ordenado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
        String nombres[] = new String[]{"Dos", "Uno", "Tres"};
        
        OrdenamientoBurbuja(nombres); 
        
        System.out.println("Arreglo Nombres Ordenado");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
    }
    
    
    
    public static void OrdenamientoBurbuja(int arreglo[]){
        int aux;
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[i]<arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    
    public static void OrdenamientoBurbuja(String arreglo[]){
        String aux;
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[i].compareTo(arreglo[j])>0) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    
    
}
