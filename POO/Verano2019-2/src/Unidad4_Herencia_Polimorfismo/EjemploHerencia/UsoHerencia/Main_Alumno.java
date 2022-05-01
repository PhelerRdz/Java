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

package Unidad4_Herencia_Polimorfismo.EjemploHerencia.UsoHerencia;

import Unidad4_Herencia_Polimorfismo.EjemploHerencia.Alumno;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main_Alumno {
    public static void main(String[] args) {
        Alumno al;                
        al = new Alumno(24,8,10,7,"GARA","Alejandro",18,1.6);
        
        System.out.println("Nombre:" + al.getNombre());
        System.out.println("Edad:" + al.getEdad());
        System.out.println("Matricula:" + al.getMatricula());
        
    }
}
