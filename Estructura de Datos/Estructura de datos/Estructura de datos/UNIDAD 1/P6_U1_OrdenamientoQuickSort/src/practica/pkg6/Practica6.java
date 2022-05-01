/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package practica.pkg6;

import java.util.Scanner;
import static practica.pkg6.Ordenamientos.quicksort;

public class Practica6 {
    public static void main(String[] args) {
        int []numeros=null;
        Archivo file = new Archivo ();        
        Scanner sc = new Scanner(System.in);
        int opc=1;
        do {
            switch (opc) {
                case 1:
                    System.out.println("Seleccione su archivo");
                    numeros = file.leer(file.seleccionar());
                    if (numeros==null) {
                        System.out.println("Sin contenido, seleccione otro archivo");
                    } else if (numeros.length==1) {
                        System.out.println("Solo hay un dato, por favor seleccione otro archivo");
                    }
                    break;
                case 2: 
                    if (numeros==null) {
                        System.out.println("Sin contenido, seleccione otro archivo");
                    } else if (numeros.length==1) {
                        System.out.println("Solo hay un dato, por favor seleccione otro archivo");
                    } else {
                        quicksort(numeros,0,numeros.length-1);
                        System.out.println("Elementos ordenados");   
                    }
                    break;
                case 3:
                    if (numeros!=null) {
                        for (int i = 0; i < numeros.length-1; i++) {
                            System.out.print(numeros[i]+",");
                        }
                        System.out.print(numeros[numeros.length-1]);
                        System.out.println("");
                    } else {
                        System.out.println("No se puede realizar esta operacion"
                                + "\nSelecciona Otro archivo y ordena sus datos");
                    }
                    break;
                case 4: break;
                default:
                    System.out.println("Opcion No valida");
                  
            }
            System.out.println("--------------------------");
            System.out.println("Ordenamiento archivos");
            System.out.println("1.Seleccionar Archivo");
            System.out.println("2.Ordenar (Quick Sort)");
            System.out.println("3.Imprimir Arreglo");
            System.out.println("4.Salir");
            System.out.println("--------------------------");
            System.out.print("OPCION: "); opc=sc.nextInt();
        } while (opc!=4);
        
    }
}
