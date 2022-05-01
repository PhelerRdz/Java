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

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Programa_4_Sumas {
    public static void main(String[] args) throws IOException {
        /*
        Leer archivo de texto con la estructura
        y
        x z
        x z
        x z
        
        "y" indica la cantidad de parejas de numeros consecuentes
        x y z son una pareja de numeros para la que se 
        calculara su suma.
        */
        
        ManejoArchivos archivo;     
        archivo = new ManejoArchivos("programa_suma");
        
        String contenido = archivo.LeerArchivo();
        
        String []lineas = contenido.split("\n");
        
        int i = Integer.parseInt(lineas[0]);
        
        int a, b;
        
        String aux;        
        
        for (int j = 1; j < i; j++) {
            //split, tokenaizer, substring
            //15    2
            //15 2
            //    15   2
            
            //preprocesamiento de los datos
            aux = lineas[j];  
            aux = aux.trim();  //hola 
                               //    hola    
            aux = aux.replaceAll(" +", " ");
            
            //System.out.println("aux:" + aux+".");
            
            a = Integer.parseInt(aux.substring(0, aux.indexOf(" ")));
            b = Integer.parseInt(aux.substring(aux.indexOf(" ")+1));
            //System.out.println("a:" + a + ", b:" + b);
            
            System.out.println(a+b);
        }
        
    }
}
