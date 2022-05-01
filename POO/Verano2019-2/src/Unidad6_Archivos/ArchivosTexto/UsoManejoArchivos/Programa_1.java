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
public class Programa_1 {
    public static void main(String[] args) throws IOException {
        
            ManejoArchivos archivo;            
            archivo = new ManejoArchivos("prueba");
            
            System.out.println("Nombre del archivo: ");
            System.out.println(archivo.getFileName());
            
            archivo.EscribirLinea("Hola, ");
            archivo.EscribirLinea("Saludos!, ");
            archivo.EscribirLinea("Mi nombre es: ");
            archivo.EscribirLinea("Archivito!! :D!");
            archivo.SaltoLinea();
            archivo.EscribirLinea("Me gustaría ser tu amigo :)!");
            archivo.SaltoLinea();
            archivo.EscribirLinea("jeje");
            archivo.SaltoLinea();
          //  archivo.ReiniciarArchivo("Hola!! :*!");
          //  archivo.borrarFile();
            
    }
}
