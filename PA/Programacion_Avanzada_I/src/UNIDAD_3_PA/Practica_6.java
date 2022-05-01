/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Angel
 */
public class Practica_6 {

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);

        Libro Registro[] = null;
        char Opc;
        String Nombre_Archivo;
        int Cantidad_Registro = 0;

        do {

            // Paso #3
            String Carpeta_Nueva_Nombre = "D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Books";
            File Carpeta = new File(Carpeta_Nueva_Nombre);

            if (Carpeta.mkdirs()) {

                System.out.println("Sea creado el directorio 'Books' correctamente :)\n");

            } else {

                System.out.println("\nEstimado Usuario\nEl directorio 'Books' ya existe :'(\n");

            }

            // Paso #4
            File Archivo;
            Archivo = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Books\\Books.txt");
            System.out.println("¿Existe el archivo 'Books.txt'?\t" + Archivo.exists());
            if (Archivo.exists()) {

                System.out.println("\nEstimado Usuario\nEn el directorio 'Books' ya existe un archivo con el nombre 'Books' :'(");
                System.out.println("¿Se puede escribir?\t" + Archivo.canWrite());
                System.out.println("");

            } else {

                System.out.println("\nEstimado Usuario\nFavor de crear un archivo con el nombre 'Books.txt' para llegar el registro de libros o con el nombre que usted desee\n");
                System.out.print("Ingrese un nombre para el archivo: ");
                Nombre_Archivo = leer.nextLine();
                leer.nextLine();
                Archivo = new File("D:\\Practicas de Programacion Avanzada\\Programacion_Avanzada_I\\src\\Books\\" + Nombre_Archivo + ".txt");
                Archivo.createNewFile();

            }

            System.out.println("\nLibro\nMenu:\n");
            System.out.println("a) Ingresar registro");
            System.out.println("b) Cerrar registro");
            System.out.println("c) Mostrar registro");
            System.out.println("d) Salir\n");
            System.out.print("Digite una opcion: ");
            Opc = leer.next().charAt(0);
            System.out.println("");

            switch (Opc) {

                case 'a':

                    System.out.println("a) Ingresar registro");
                    System.out.print("Ingrese la cantidad de registros que desea capturar: ");
                    Cantidad_Registro = leer.nextInt();
                    leer.nextLine();
                    Registro = new Libro[Cantidad_Registro];
                    System.out.println("");

                    for (int i = 0; i < Registro.length; i++) {

                        System.out.println("Libro #" + (i + 1));
                        System.out.println("Registro:\n");
                        System.out.print("Ingrese el nombre del autor: ");
                        String Autor = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el titulo del libro: ");
                        String Titulo = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el nombre de la edicion del libro: ");
                        String Edicion = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el nombre de la editorial: ");
                        String Editorial = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el nombre del pais de origen: ");
                        String Pais = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el ISBN del libro: ");
                        String ISBN = leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el numero de paginas del libro: ");
                        int Numero_Pagina = leer.nextInt();
                        leer.nextLine();

                        Registro[i] = new Libro(Autor, Titulo, Edicion, Editorial, Pais, ISBN, Numero_Pagina);

                        System.out.println("");

                    }

                    break;

                case 'b':

                    System.out.println("b) Cerrar registro");
                    Libro Archivo_Libro = null;
                    FileWriter filewriter = new FileWriter(Archivo);
                    BufferedWriter bufferedwriter = new BufferedWriter(filewriter);

                    for (int i = 0; i < Registro.length; i++) {
                        bufferedwriter.write(Registro[i].toString());
                        bufferedwriter.newLine();

                    }
                    bufferedwriter.close();
                    
                    
                    Archivo.setReadOnly();
                    break;

                case 'c':

                    System.out.println("c) Mostrar registro\n");

                    for (int i = 0; i < Registro.length; i++) {
                        System.out.println("Libro #" + (i + 1));
                        System.out.println("Registro: ");
                        System.out.println(Registro[i]);
                        System.out.println("");
                    }

                    break;

                case 'd':
                    break;

                default:
                    System.out.println("Opcion Invalida");
                    break;

            }

        } while (Opc != 'd');

    }

}
