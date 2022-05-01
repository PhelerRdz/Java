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

package Unidad3_MetodosEspeciales.UsoEjemplo3;

import Unidad3_MetodosEspeciales.Ejemplo3.NumeroComplejo;
import java.util.Random;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main {
    public static void main(String[] args) {
            
        NumeroComplejo complejos[];
        
        complejos =  new NumeroComplejo[10];
        
        Random rnd = new Random();
        
        int a, b;
        boolean bandera;
        NumeroComplejo temp;
        int i = 0;
        while( i < 10) {
            a = 5 + rnd.nextInt(15-10+1); //[5 - 15] -> 10 posibilidades          
            b = 10 + rnd.nextInt(100-10+1); // [10 - 100] -> 90 posibilidades
            temp = new NumeroComplejo(a,b);
            
            bandera = true; //Busqueda Secuencial...cotains
            for (int j = 0; j < i; j++) {
                if(temp.equals(complejos[j])){
                    bandera = false;
                    break;
                }                                    
            }
                    
            if (bandera) {
                complejos[i] = temp;
                i++;
            }
            
        }
        
        //desplegar los elementos del arreglo
        for (i = 0; i < 10; i++) {
            System.out.println(complejos[i]);
        }
        
        
        System.out.println("Suma de los Primeros dos Números: ");
        
        NumeroComplejo aux = new NumeroComplejo();
        
        aux.setParte_real(complejos[0].getParte_real());
        aux.setParte_imaginaria(complejos[0].getParte_imaginaria());
        
        aux.suma(complejos[1]);
        //No conveniente... complejos[0].suma(complejos[1];  
        
        System.out.println(aux);
        
        
        for (i = 1; i < 10; i++) {
            complejos[0].suma(complejos[i]);
        }
        
        System.out.println("Resultado de la Suma: ");
        System.out.println(complejos[0]);
        
    }
}
