package Unidad_3;

import java.io.File;
/**
 *
 * @author GuillermoToledano
 */
public class P01_File {
    
    public static void main(String[] args) {
        // Crear objeto de la clase File.
        File file;
        //Crear objeto de tipo File
        file = new File("src/Recursos/Estudiantes.txt");
        //Método para conocer si el archivo existe
        System.out.println("File exist?\t" + file.exists());
        //Método para conocer si el objeto es un archivo
        System.out.println("Is a file?\t" + file.isFile());
        //Método para conocer si el objeto es un directorio
        System.out.println("Is a directory?\t" + file.isDirectory());
        //Método para conocer si es de tipo ejecutable
        System.out.println("Executable?\t" + file.canExecute());
        System.out.println("Can read?\t" + file.canRead());
        System.out.println("Can write?\t" + file.canWrite());
        System.out.println("File size:\t" + file.length());
        
    }
}
