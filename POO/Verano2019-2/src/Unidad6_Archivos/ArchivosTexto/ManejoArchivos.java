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

package Unidad6_Archivos.ArchivosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ESTA CLASE ES PARA TRABAJAR CON ARCHIVOS DE TEXTO (.txt)
 * @author Alejandro_GarciaRuiz
 */
public class ManejoArchivos {
    /*
    
    Similar al ABC de las estructuras de datos, 
    los archivos cuentan con la siguientes 
    Operaciones Basicas..
    
        Crear
        Abrir
        Escribir/SobreEscribir
        Leer / Recorrido
        Cerrar
        
    NOTA: ABC o ABCD de las estructuras de datos
        - en SQL son conocidas como CRUD
    
        A = ALTAS
        B = BAJAS
        C = CAMBIOS
    
        D = DESPLIEGUE
    
        C =  CREATE
        R = RECOVER
        U = UPDATE
        D = DELETE
    
    */
    
   private File file; //archivo 

   /**
    * Recupera el nombre del archivo actual
    * @return 
    */
    public String getFileName() {
        return file.getName();
    }
    
    /**
     * Para trabajar con un archivo nuevo...
     * @param name Nombre del archivo con el que se trabajará 
     */
    public void setFileName(String name){
        file = new File(name + ".txt");       
    }

    /**
     * 
     * @return 
     * true si se elimino,
     * false si no existe el archivo
     * 
     */
    public boolean borrarFile(){
        if (file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }
    
    
    //Constructor
    public ManejoArchivos(String name) {
        this.file = new File(name + ".txt");
    }
   
    
    public void ReiniciarArchivo(String linea) throws IOException{
        
        FileWriter fw = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(linea);        

        bw.close(); //flush + close
        fw.close();
    }
    
    public void EscribirLinea(String linea) throws IOException{
        
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(linea);        

        bw.close(); //flush + close
        fw.close();
    }
   
    public void SaltoLinea() throws IOException{
        
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
                
        bw.newLine();

        bw.close(); //flush + close
        fw.close();
    }
   
    
    public String LeerArchivo() throws FileNotFoundException, IOException{
    
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        StringBuilder contenido = new StringBuilder();
        String aux;        
        
        while ((aux=br.readLine())!=null) {            
            
            contenido.append(aux);
            contenido.append("\n");
        }
        
        br.close();
        fr.close();
        
        return contenido.toString();
    }
   
}
