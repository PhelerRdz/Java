/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_u2_15_examenarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class POO_U2_15_ExamenArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo = new File("examen.csv");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        int totalPreguntas = Integer.parseInt(br.readLine().replaceAll(",", ""));
        //Lee primera linea del archivo
        Pregunta exm[] = new Pregunta[totalPreguntas];
        String aux;
        String temp[];
        for (int i = 0; i < totalPreguntas; i++) {
            aux = br.readLine();
            temp = aux.split(",");//enunciado respC, respB, respC, respD
            exm[i] = new Pregunta(temp[0], temp[1], temp[2], temp[3], temp[4]);
        }
        //Fin creacion del examen
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;
        //Aplicacion del examen
        for (int i = 0; i < totalPreguntas; i++) {
            System.out.println(exm[i].getEnunciado());
            System.out.println(exm[i].getRespuestas());
            aux = sc.nextLine();//Respuesta del usuario
            System.out.println("");
            if (exm[i].EsCorrecta(aux)) {
                System.out.println("Respuesta Correcta");
                aciertos++;
            } else {
                System.out.println("Respuesta Incorrecta");
            }
            System.out.println("");
        }
        System.out.println("Total de aciertos"+aciertos);
        System.out.println("Calificacion"+(aciertos/totalPreguntas*10));
    }

}
