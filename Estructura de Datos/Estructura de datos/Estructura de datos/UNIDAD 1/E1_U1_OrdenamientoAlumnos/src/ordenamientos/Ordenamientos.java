/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package ordenamientos;

import java.util.Scanner;

public class Ordenamientos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno a[],aux; String nom,auxN; int cal,i,j,tam;
        Scanner txt = new Scanner(System.in);
        
        do {
            System.out.println("Cantidad de alumnos: ");
            tam=sc.nextInt();
            if (tam<1) {
                System.out.println("Error: Cantidad no válida!!!");
            }
        } while (tam<1);
        
        a = new Alumno[tam];
        
        for (i = 0; i< tam; i++) {
            System.out.println("");
            
            do {
               System.out.print("Ingresa nombre: "); nom = txt.nextLine();
               nom=nom.trim();
                if (nom.equals("")) {
                    System.out.println("***Escribe un nombre***");
                }
            } while (nom.equals(""));
            
            do {
                System.out.print("Calificacion: "); cal = sc.nextInt();
                if (cal<1 || cal>10) {
                    System.out.println("***Solo calificaciones de 1 a 10***");
                }
            } while (cal<1 || cal>10);
           
            aux = new Alumno();
            a[i]= aux;
            a[i].nombre=nom;
            a[i].cal=cal;
        }
        
        System.out.println("\n...Ordenamiento por nombre(ascendente)...");
        int orden; 
        for (i = 0; i < tam-1; i++) {
            for (j = i+1; j < tam; j++) {
                orden=a[i].nombre.compareTo(a[j].nombre);
                if (orden>0) {
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                } 
            }
        }
        
        //imprimir
        System.out.println("Nombre-Calificacion");
        for (i = 0; i < tam; i++) {
        System.out.println(a[i].nombre+"  "+a[i].cal);
        }
        System.out.println("");
        
        System.out.println("...Ordenamiento por calificacion(descendente)...");
        for (i = 0; i < tam-1; i++) {
            for (j =i+1; j < tam; j++) {
                if (a[i].cal<=a[j].cal) {
                  aux=a[i];
                  a[i]=a[j];
                  a[j]=aux;         
                }
            }
        }
        
        //imprimir
        System.out.println("Nombre-Calificacion");
        for (i = 0; i < tam; i++) {
        System.out.println(a[i].nombre+"  "+a[i].cal);
        }
        System.out.println("");
    }
}
