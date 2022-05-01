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

package Unidad3_MetodosEspeciales.UsoEjemplo1;

import Unidad3_MetodosEspeciales.Ejemplo1.Alumno;
import Unidad3_MetodosEspeciales.Ejemplo1.OrdenarPorNombre;
import Unidad3_MetodosEspeciales.Ejemplo1.OrdenarPorPromedio;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main {
    public static void main(String[] args) {
        
        Alumno alumnos[];
        alumnos = new Alumno[5]; //Instanciación del Arreglo, NO de los objetos del mismo
        
        String nombres[] = new String[]{"Alan","Jose", "Daniel", "Angel", "Sarmiento"};
        
        Random rnd = new Random();
        
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(); //Instanciación del objeto de la posición i
            
            alumnos[i].setID((i+1));
            alumnos[i].setNombre(nombres[i]);
            alumnos[i].setCal1(5+rnd.nextInt(6)); //[5 - 10]
            alumnos[i].setCal2(5+rnd.nextInt(6));
            alumnos[i].setCal3(5+rnd.nextInt(6));
            alumnos[i].calcularPromedio();
        }
        
        /*
        Para recorrer a los elementos de una colección o un arreglo
        en el que la posición no es de interes, se puede hacer 
        empleo de for each. Este recorre a los elementos 
        de izquierda a derecha, devolviendo en cada iteración 
        al elemento correspondiente a la iteración,,,
        
        iteración 1  -- devuelve al elemento 1
        iteración 2  -- devuelve al elemento 2
        .
        .
        .
        iteración n  -- devuelve al elemento n
        
        */
        System.out.println("Alumnos");
        for (Alumno al : alumnos) { //For Each..
               System.out.println(al);
        }
        
        
        //USO DE EQUALS
        //Busqueda Secuencial de Objetos.. 
        
        Alumno aux = new Alumno(6);
        boolean result;
        
        System.out.println("");
        for (Alumno al : alumnos) {
            //result = aux.getID()==al.getID();
            result = aux.equals(al);            
            System.out.println(result);            
            if (result) {
                System.out.println(al);
            }
            
        }
        
        
     //Ordenamiento de Arreglos de Objetos
        
        System.out.println("Sin Ordenar: ");
        for (Alumno al : alumnos) {
            System.out.println(al);
        }
     
        Arrays.sort(alumnos, new OrdenarPorPromedio());
        
        System.out.println("Ordenado por Promedio: ");
        for (Alumno al : alumnos) {
            System.out.println(al);
        }
        
        Arrays.sort(alumnos, new OrdenarPorNombre());
        
        System.out.println("\nOrdenado por Nombre: ");
        for (Alumno al : alumnos) {
            System.out.println(al);
        }
        
        Arrays.sort(alumnos);
        
        System.out.println("\nOrdenado por Matricula: ");
        for (Alumno al : alumnos) {
            System.out.println(al);
        }
        
    }
}
