/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package ordenamientoseleccion;

import java.util.Scanner;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        int n,i,j,menor,posMenor,aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de numeros a ingresar: ");
        n=sc.nextInt();
        int A[] = new int[n];
        
        //ingresar datos
        for (i = 0; i < n; i++) {
            System.out.print("Ingresa Numero: "); A[i]=sc.nextInt();
        }
        
        //ordenamiento por Seleccion
        for ( i = 0; i < n; i++) {
            posMenor=i;
            for ( j = i+1; j < n; j++) {
                if (A[j]<A[posMenor]) {
                    posMenor=j;
                }
            }
            aux=A[i];
            A[i]=A[posMenor];
            A[posMenor]=aux;
        }
        
        
        System.out.println("");
        //imprimir el arreglo
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}
