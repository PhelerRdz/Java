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

package Unidad3_MetodosEspeciales.UsoEjemplo2;

import Unidad3_MetodosEspeciales.Ejemplo2.Computadora;
import Unidad3_MetodosEspeciales.Ejemplo2.OrdenarPorCapacidad;
import java.util.Arrays;


/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main {
    public static void main(String[] args) {
        
        Computadora pc1;                  
        pc1 = new Computadora(1, "AC2560", "DELL", 1000, "i9",32);        
        System.out.println(pc1);
        
        ///INICIO ... 
        Computadora centroComputo[];
        centroComputo = new Computadora[5];
        
        centroComputo[0] = new Computadora(1, "AFSD5", "DELL", 1000, "i9",64);
        centroComputo[1] = new Computadora(2, "WEF60", "ACER", 120, "i5",16);
        centroComputo[2] = new Computadora(3, "GEEVX", "LENOVO", 512, "i8",32);
        centroComputo[3] = new Computadora(4, "YDFAC", "APPLE", 4000, "i12",1000);
        centroComputo[4] = new Computadora(5, "65F4A", "HP", 80, "CELEROM",1);
        
        System.out.println("Sin Ordenar:");
        ImprimirArreglo(centroComputo);
        
        System.out.println("Ordenador por Capacidad:");
        Arrays.sort(centroComputo, new OrdenarPorCapacidad()); //ORDENAMIENTO ALTERNATIVO
        ImprimirArreglo(centroComputo);
        
        System.out.println("Ordenamiento por No. Serie"); 
        Arrays.sort(centroComputo);         //ORDANEMIENTO NATURAL
        ImprimirArreglo(centroComputo);
    }
    
    public static void ImprimirArreglo(Computadora a[]){
        for (Computadora a1 : a) {
            System.out.println(a1);
        }
    }
    
}
