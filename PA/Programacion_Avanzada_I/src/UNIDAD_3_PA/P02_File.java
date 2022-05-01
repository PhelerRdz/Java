package Unidad_3;

import java.io.File;

/**
 *
 * @author GuillermoToledano
 */
public class P02_File {

    public static void main(String[] args) {
        //Nos colocamos en la ubicación actual del programa
        File currentDir = new File(".");
        /*
        Solicitamos el nombre de los elementos contenidos en el directorio.
        Los nombres de los objetos retornaran en tipo String, por lo tanto
        utilizaremos un arreglo de tipo String.
        */
        String[] filesNames = currentDir.list();
        //Accesamos a los nombres de los archivos o directorios encontrados.
        for (String fileName : filesNames) {
            /*
            Por cada archivo o directorio encontrado y almacenado en el arreglo,
            creamos un objeto de tipo File, a partir del objeto, podemos 
            realizar ciertas operaciones sobre el archivo o directorio.
            */
            File file = new File(fileName);
            System.out.println("Nombre:\t" + file.getName());
            System.out.println("Tamaño:\t" + file.length());
            if (file.isDirectory()) {
                System.out.println("Es un directorio");
            } else {
                System.out.println("Es un archivo");
            }
            System.out.println("-------------------");
        }
        //Comprobar si existe un archivo llamado "Datos.txt"
        File datos = new File("Datos.txt");
        if (datos.exists()) {
            System.out.println("El archivo Datos.txt fue encontrado...");
        } else {
            System.out.println("El archivo Datos.txt no fue encontrado...");
        }
    }
}
