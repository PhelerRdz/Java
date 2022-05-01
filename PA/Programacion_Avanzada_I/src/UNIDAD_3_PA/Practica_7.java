/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TerezaconZ
 */
public class Practica_7 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner leer = new Scanner(System.in);
        
        int Opc;
        int Contador_1 = 0;
        int Contador_2 = 0;
        int Contador_3 = 0;
        int Contador_4 = 0;
        int Contador_5 = 0;
        int Contador_6 = 0;
        // Paso #1
        File Crear_Archivo_Indice;
        Crear_Archivo_Indice = new File("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\Indice.txt");
        
        if (Crear_Archivo_Indice.createNewFile()) {
            
            System.out.println("Sea creado el archivo 'Indice.txt' correctamente :)\n");
            
        } 
        else {
            
            System.out.println("Estimado Usuario\nEl archivo 'Indice.txt' ya existe :'(\n");
            
        }
        
        // Paso #3
        Indice indice = null;
        File Pasar_Datos_Libro_TXT = null;
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;
        
        Pasar_Datos_Libro_TXT = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Fabulas\\Indice.txt");
        try {
            if(Pasar_Datos_Libro_TXT.exists() && Pasar_Datos_Libro_TXT.isFile()) {
                indice = new Indice();
                filewriter = new FileWriter("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Fabulas\\Indice.txt", true);
                bufferedwriter = new BufferedWriter(filewriter);
                
                String Libro_1 = "'El Cordero Envidioso'";
                String Libro_2 = "'El Envidioso'";
                String Libro_3 = "'El Labrador y la Vibora'";
                String Libro_4 = "'El Mono y la Naranja'";
                String Libro_5 = "'El Zorro y el Espino'";
                String Libro_6 = "'La Encina y el Junco'";
                
                indice.setLibro_1(Libro_1);
                indice.setLibro_2(Libro_2);
                indice.setLibro_3(Libro_3);
                indice.setLibro_4(Libro_4);
                indice.setLibro_5(Libro_5);
                indice.setLibro_6(Libro_6);
                
                bufferedwriter.write(indice.toString());
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
        
        // Paso #4
        do{
            
            System.out.println("Libro\n");
            System.out.println("1) Libro #1 'El Cordero Envidioso'");
            System.out.println("2) Libro #2 'El Envidioso'");
            System.out.println("3) Libro #3 'El Labrador y la Vibora'");
            System.out.println("4) Libro #4 'El Mono y la Naranja'");
            System.out.println("5) Libro #5 'El Zorro y el Espino'");
            System.out.println("6) Libro #6 'La Encina y el Junco'");
            System.out.println("7) Salir\n");
            System.out.print("Digite una opcion: ");
            Opc = leer.nextInt();
            System.out.println("");
            
            switch(Opc){
                
                case 1:
                    
                    System.out.println("1) Libro #1 'El Cordero Envidioso'");
                    
                    int Numero_Linea_Uno = 0;
                    String Texto_1;

                    FileReader Archivo_TXT_1 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Cordero Envidioso.txt");
                    BufferedReader buffer_1 = new BufferedReader(Archivo_TXT_1);
                    
                    while((Texto_1 = buffer_1.readLine()) != null){
                        
                        Numero_Linea_Uno ++;
                        StringTokenizer Uno = new StringTokenizer(Texto_1);
                        Contador_1 = Contador_1 + Uno.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Uno+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_1+"\n");
                    Contador_1 = 0;
                    
                    FileReader Archivo_TXT_Uno = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Cordero Envidioso.txt");
                    BufferedReader buffer_Uno = new BufferedReader(Archivo_TXT_Uno);
                    
                    while((Texto_1 = buffer_Uno.readLine()) != null){
                        
                        System.out.println(Texto_1);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 2:
                    
                    System.out.println("2) Libro #2 'El Envidioso'");
                    
                    int Numero_Linea_Dos = 0;
                    String Texto_2;
                    
                    FileReader Archivo_TXT_Dos = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Envidioso.txt");
                    BufferedReader buffer_Dos = new BufferedReader(Archivo_TXT_Dos);
                    
                    while((Texto_2 = buffer_Dos.readLine()) != null){
                        
                        Numero_Linea_Dos ++;
                        StringTokenizer Dos = new StringTokenizer(Texto_2);
                        Contador_2 = Contador_2 + Dos.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Dos+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_2+"\n");
                    Contador_2 = 0;
                    
                    FileReader Archivo_TXT_2 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Envidioso.txt");
                    BufferedReader buffer_2 = new BufferedReader(Archivo_TXT_2);
                    
                    while((Texto_2 = buffer_2.readLine()) != null){
                        
                        System.out.println(Texto_2);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 3:
                    
                    System.out.println("3) Libro #3 'El Labrador y la Vibora'");
                    
                    int Numero_Linea_Tres = 0;
                    String Texto_3;
                    
                    FileReader Archivo_TXT_Tres = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Labrador y la Vibora.txt");
                    BufferedReader buffer_Tres = new BufferedReader(Archivo_TXT_Tres);
                    
                    while((Texto_3 = buffer_Tres.readLine()) != null){
                        
                        Numero_Linea_Tres ++;
                        StringTokenizer Tres = new StringTokenizer(Texto_3);
                        Contador_3 = Contador_3 + Tres.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Tres+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_3+"\n");
                    Contador_3 = 0;
                    
                    FileReader Archivo_TXT_3 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Labrador y la Vibora.txt");
                    BufferedReader buffer_3 = new BufferedReader(Archivo_TXT_3);
                    
                    while((Texto_3 = buffer_3.readLine()) != null){
                        
                        System.out.println(Texto_3);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 4:
                    
                    System.out.println("4) Libro #4 'El Mono y la Naranja'");
                    
                    int Numero_Linea_Cuatro = 0;
                    String Texto_4;
                    
                    FileReader Archivo_TXT_Cuatro = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Mono y la Naranja.txt");
                    BufferedReader buffer_Cuatro = new BufferedReader(Archivo_TXT_Cuatro);
                    
                    while((Texto_4 = buffer_Cuatro.readLine()) != null){
                        
                        Numero_Linea_Cuatro ++;
                        StringTokenizer Cuatro = new StringTokenizer(Texto_4);
                        Contador_4 = Contador_4 + Cuatro.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Cuatro+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_4+"\n");
                    Contador_4 = 0;
                    
                    FileReader Archivo_TXT_4 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Mono y la Naranja.txt");
                    BufferedReader buffer_4 = new BufferedReader(Archivo_TXT_4);
                    
                    while((Texto_4 = buffer_4.readLine()) != null){
                        
                        System.out.println(Texto_4);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 5:
                    
                    System.out.println("5) Libro #5 'El Zorro y el Espino'");
                    
                    int Numero_Linea_Cinco = 0;
                    String Texto_5;
                    
                    FileReader Archivo_TXT_Cinco = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Zorro y el Espino.txt");
                    BufferedReader buffer_Cinco = new BufferedReader(Archivo_TXT_Cinco);
                    
                    while((Texto_5 = buffer_Cinco.readLine()) != null){
                        
                        Numero_Linea_Cinco ++;
                        StringTokenizer Cinco = new StringTokenizer(Texto_5);
                        Contador_5 = Contador_5 + Cinco.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Cinco+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_5+"\n");
                    Contador_5 = 0;
                    
                    FileReader Archivo_TXT_5 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\El Zorro y el Espino.txt");
                    BufferedReader buffer_5 = new BufferedReader(Archivo_TXT_5);
                    
                    while((Texto_5 = buffer_5.readLine()) != null){
                        
                        System.out.println(Texto_5);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 6:
                    
                    System.out.println("6) Libro #6 'La Encina y el Junco'");
                    
                    int Numero_Linea_Seis = 0;
                    String Texto_6;
                    
                    FileReader Archivo_TXT_Seis = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\La Encina y el Junco.txt");
                    BufferedReader buffer_Seis = new BufferedReader(Archivo_TXT_Seis);
                    
                    while((Texto_6 = buffer_Seis.readLine()) != null){
                        
                        Numero_Linea_Seis ++;
                        StringTokenizer Seis = new StringTokenizer(Texto_6);
                        Contador_6 = Contador_6 + Seis.countTokens();
                        
                    }
                    
                    System.out.println("\nNumero de lineas: "+Numero_Linea_Seis+"\n");
                    System.out.println("Numero de palabras del libro: "+Contador_6+"\n");
                    Contador_6 = 0;
                    
                    FileReader Archivo_TXT_6 = new FileReader("C:\\Users\\jorge\\Documents\\NetBeansProjects\\PA\\Programacion_Avanzada_I\\src\\Fabulas\\La Encina y el Junco.txt");
                    BufferedReader buffer_6 = new BufferedReader(Archivo_TXT_6);
                    
                    while((Texto_6 = buffer_6.readLine()) != null){
                        
                        System.out.println(Texto_6);
                        
                    }
                    System.out.println("");
                    
                    break;
                    
                case 7:
                    break;
                    
                default:
                    
                    System.out.println("Opcion Invalida :(\nIntentelo Otra Vez\n");
                    
                    break;
                
            }
            
        }while(Opc != 7);
        
        System.out.println("Programa Finalizado :D");
        
    }
    
}
