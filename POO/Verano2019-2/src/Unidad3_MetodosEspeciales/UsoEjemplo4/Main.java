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

package Unidad3_MetodosEspeciales.UsoEjemplo4;

import Unidad3_MetodosEspeciales.Ejemplo4.Pregunta;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main {
    public static void main(String[] args) {
        
        Pregunta encuesta[];
        encuesta = new Pregunta[10];
        
        encuesta[0] = new Pregunta(1, "Te caigo bien?", "Si", "No", "Tal vez..");
        encuesta[1] = new Pregunta(2, "Te agradaría salir conmigo?", "Si", "No", "Tal vez..");
        encuesta[2] = new Pregunta(3, "Te gusta la comida china?", "Si", "No", "Tal vez..");
        encuesta[3] = new Pregunta(4, "Despues te gustaría ir al cine?", "Si", "No", "Tal vez..");
        encuesta[4] = new Pregunta(5, "Aceptarías un regalo de mi?", "Si", "No", "Tal vez..");
        encuesta[5] = new Pregunta(6, "Quieres ir a mi casa?", "Si", "No", "Tal vez..");
        encuesta[6] = new Pregunta(7, "Te quedarías a dormir en mi casa?", "Si", "No", "Tal vez..");
        encuesta[7] = new Pregunta(8, "Me pasas tu número?", "Si", "No", "Tal vez..");
        encuesta[8] = new Pregunta(9, "Estas solter@?", "Si", "No", "Tal vez..");
        encuesta[9] = new Pregunta(10, "Quieres ser mi pareja?", "Si", "No", "Tal vez..");
        
        //Desordenamiento
        Random rnd = new Random();
        int posNueva;
        Pregunta aux;

        

            for (int i = 0; i < encuesta.length; i++) {
                posNueva = rnd.nextInt(encuesta.length);

                aux = encuesta[i];
                encuesta[i] = encuesta[posNueva];
                encuesta[posNueva] = aux;
            }
        
            
        //aplicación de la encuesta..
        System.out.println("Inicio de Conversación");
        String respuesta;
        int sumaPuntos=0;   //  Si  = 10   No = 0   Talvez = 5
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < encuesta.length){
            System.out.println((i+1)+" "+encuesta[i]);
            respuesta = sc.nextLine();
            respuesta = respuesta.toLowerCase();
            switch(respuesta){
                case "1":
                    sumaPuntos+=10;
                    break;
                case "2":            
                    break;
                case "3":
                    sumaPuntos+=5;
                    break;
                default:
                    System.out.println("Opción no valida...");
                    i--;                    
            }
            i++;
        }
        
        System.out.println("Suma Puntos: " + sumaPuntos);
        
        if (sumaPuntos>=80) {
            System.out.println("Friendzoneado");
        }
        else if(sumaPuntos >=60){
            System.out.println("Será tuy@.. :D!");
        }
        else if(sumaPuntos>=40){
            System.out.println("Sigue Insistiendo");
        }
        else {
            System.out.println("Continua buscando... :(");
        }
        
        
    }
}
