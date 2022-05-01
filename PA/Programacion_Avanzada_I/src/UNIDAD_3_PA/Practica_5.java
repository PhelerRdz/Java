/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TerezaconZ
 */
public class Practica_5 {

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);

        //Paso #2
        File currentDir = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src");

        String Nombre_Archivo[] = currentDir.list();

        // Paso #3
        for (String nombre_archivo : Nombre_Archivo) {

            File file = new File(nombre_archivo);

            System.out.println("Nombre:\t" + file.getName());
            System.out.println("Tamaño:\t" + file.length());

            if (file.isDirectory()) {

                System.out.println("Es un directorio");

            } 
            else {

                System.out.println("Es un archivo");
                
            }

            System.out.println("-------------------");
            
        }

        String Carpeta_Nueva_Nombre = "D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Files";
        File Carpeta = new File(Carpeta_Nueva_Nombre);

        if (Carpeta.mkdirs()) {

            System.out.println("Sea creado el directorio 'Files' correctamente :)\n");

        }
        else {

            System.out.println("\nEstimado Usuario\nEl directorio 'Files' ya existe :'(\n");

        }
        
        // Paso 4
        File currentDir_2 = new File ("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Files");

        String Nombre_Archivo_2[] = currentDir_2.list();
        
        for (String nombre_archivo_2 : Nombre_Archivo_2) {

            File file = new File (nombre_archivo_2);

            System.out.println("Nombre:\t" + file.getName());
            System.out.println("Tamaño:\t" + file.length());

            if (file.isDirectory()) {

                System.out.println("Es un directorio");

            } 
            else {

                System.out.println("Es un archivo");
                
            }

            System.out.println("-------------------");
            
        }
        
        // Paso #5
        File Archivo;
        Archivo = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Files\\Data.txt");
        
        if (Archivo.createNewFile()) {
            
            System.out.println("Sea creado el archivo 'Data.txt' correctamente :)");
            
        } 
        else {
            
            System.out.println("Estimado Usuario\nEl archivo 'Data.txt' ya existe :'(\n");
            
        }
        
        P08_Estudiante estudiante = null;
        File file = null;
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;
        
        file = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Files\\Data.txt");
        try {
            if(file.exists() && file.isFile()) {
                estudiante = new P08_Estudiante();
                filewriter = new FileWriter("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Files\\Data.txt", true);
                bufferedwriter = new BufferedWriter(filewriter);
                
                System.out.print("Ingrese la matricula: ");
                String Aux_1 = leer.nextLine();
                leer.nextLine();
                System.out.print("Ingrese el nuombre: ");
                String Aux_2 = leer.nextLine();
                leer.nextLine();
                System.out.print("Ingrese el apelliedo paterno: ");
                String Aux_3 = leer.nextLine();
                leer.nextLine();
                System.out.print("Ingrese el apellido materno: ");
                String Aux_4 = leer.nextLine();
                leer.nextLine();
                System.out.print("Ingrese su sexo: ");
                char Aux_5 = leer.next().charAt(0);
                leer.nextLine();
                System.out.print("Ingrese la carrera: ");
                String Aux_6 = leer.nextLine();
                leer.nextLine();
                System.out.print("Ingrese el semestre: ");
                int Aux_7 = leer.nextInt();
                leer.nextLine();
                boolean Aux_8 = true;
                System.out.println("Ingrese si es becario: "+Aux_8);
                System.out.println("");
                System.out.print("Ingrese el promeido: ");
                double Aux_9 = leer.nextDouble();
                System.out.println("");
                System.out.print("Ingrese el correo: ");
                String Aux_10 = leer.nextLine();
                leer.nextLine();
                estudiante.setMatricula(Aux_1);
                estudiante.setNombre(Aux_2);
                estudiante.setApaterno(Aux_3);
                estudiante.setAmaterno(Aux_4);
                estudiante.setGenero(Aux_5);
                estudiante.setCarrera(Aux_6);
                estudiante.setSemestre(Aux_7);
                estudiante.setBecario(Aux_8);
                estudiante.setPromedio(Aux_9);
                estudiante.setCORREO(Aux_10);
                bufferedwriter.write(estudiante.toString());
                bufferedwriter.newLine();
                bufferedwriter.close();
            }            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (filewriter != null) {
                try {
                    filewriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

}
