/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package ordenamientoinsercion;
import java.util.Scanner;
public class OrdenamientoInsercion {
    public static void main(String[] args) {
        int tam,A[],B[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Numeros a ingresar: ");
        tam=sc.nextInt();
        A = new int[tam];
        B = new int[tam];
        
        //Proceso para llenar arreglo 1
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese Numero: "); A[i]=sc.nextInt();
        }
        
        //proceso para pasar contenido del arreglo 1 al 2 de forma ordenada
        int i,pos,aux;
        
        for (i = 0; i < tam; i++) {
            aux=A[i];
            pos=i;
            while((pos>0) && (B[pos-1]>aux)){
                B[pos]=B[pos-1];
                pos--;
            }
            B[pos]=aux;
        }
        System.out.println("");
        for ( i = 0; i < tam; i++) {
            System.out.println(B[i]);
        }
    }
}
