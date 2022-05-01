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
package Unidad1.ClaseAlumno;

import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Principal {

    public static void main(String[] args) {
        /*
        A LA DOCUMENTACIÓN DE JAVA QUE NOS PERMITE CONOCER
        INFORMACIÓN DE LAS CLASES Y DE LOS MÉTODOS SE LE CONOCE
        COMO "JAVADOC". 
        
        ESTA SE ENCUENTRA DEFINIDA PARA LAS CLASES BÁSICAS DE JAVA.
        SIN EMBARGO, PARA LAS CLASES GENERADAS POR LOS PROGRAMADORES
        ESTA DEBE SER GENERADA DE FORMA MANUAL.
         */

        //Scanner sc = new Scanner
        //Math.p
        Scanner sc = new Scanner(System.in);

        Alumno alumno1;
        alumno1 = new Alumno();

        String opciones;
        opciones = "Ingresa el valor de la opción deseada: "
                + "\n1.- Modificar Nombre"
                + "\n2.- Modificar Semestre"
                + "\n3.- Modificar Promedio"
                + "\n4.- Modificar Carrera"
                + "\n5.- Consultar Nombre"
                + "\n6.- Consultar Semestre"
                + "\n7.- Consultar Promedio"
                + "\n8.- Consultar Carrera"
                + "\n9.- Consultar Matricula"
                + "\n10.- Consultar Datos Completos del Alumno"
                + "\n11.- Salir";

        int op;
        String aux;
        int temp;

/*
        SIEMPRE QUE DESEEE REALIZAR LA LECTURA DE UNA CADENA DE 
        CARACTERES (STRING) DESPUÉS DE HABER REALIZADO LA LECTURA DE UN 
        VARIABLA NÚMERICA, SE DEBERÁ REALIZAR LA LIMPIEZA DEL BUFFER
        
        
        */
        
        do {
            System.out.println(opciones);
            op = sc.nextInt();
            
            sc.nextLine(); //para limpiar buffer

            switch (op) {
                case 1:
                    System.out.println("¿Cuál es nuevo nombre?");
                    aux = sc.nextLine();
                    alumno1.setNombre(aux);
                    break;
                case 2:
                    System.out.println("¿Cuál es el nuevo semestre?");
                    temp = sc.nextInt();
                    //alumno1.setSemestre(temp);
                    sc.nextLine(); //para limpiar buffer
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    //System.out.println("El nombre del alumno es: " + alumno1.get);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("La matricula del alumno es: " + alumno1.getMatricula());
                    break;
                case 10:
                    //System.out.println(alumno1); //opcion 1 
                    System.out.println(alumno1.toString()); //opcion 2
                    break;
                case 11:
                    System.out.println("Gracias por Usar Nuestro Programa");
                    break;
                default:
                    System.out.println("Opción No Valida, intente de nuevo...");
            }

        } while (op != 11);

    }
}
