/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package practica1_ordenamientoburbuja;

import java.util.Scanner;

public class Practica1_ordenamientoBurbuja {
    public static void main(String[] args) {
        int opc,i; opc=0;
        int A[]=null,tam = 0,aux;
        Scanner sc = new Scanner(System.in);
        
        opc=1;       
        do{ 
            switch(opc){
                case 1:
                    do {
                        //Verifica el tamaño del arreglo
                        System.out.print("Cantidad de datos a ingresar:");
                        tam=sc.nextInt();
                        if (tam<2) {
                            System.out.println("***Verifica el tamaño del arreglo***");
                        }
                    } while (tam<2);
                    
                    A=new int[tam];
                    
                    //Ingreso de datos
                    for (i = 0; i < tam; i++) { 
                        System.out.print("Ingresa el dato "+(i+1+": "));
                        A[i]=sc.nextInt();
                    }
                    break;
                case 2: 
            System.out.println("/////////////////////////////////////////////");
                    for ( i = 0; i < tam-1; i++) {
                        for (int j = i+1; j < tam; j++) {
                            if (A[i]>A[j]) {
                                aux=A[i];
                                A[i]=A[j]; 
                                A[j]=aux;
                            }
                        }
                    }
                    
                    for (int j = 0; j < tam; j++) {
                        System.out.println(A[j]);
                    }
                    break;
                case 3: 
            System.out.println("/////////////////////////////////////////////");
                    for ( i = 0; i < tam-1; i++) {
                        for (int j = i+1; j < tam; j++) {
                            if (A[i]<A[j]) {
                                aux=A[i];
                                A[i]=A[j]; 
                                A[j]=aux;
                            }
                        }
                    }
                    
                    for (int j = 0; j < tam; j++) {
                        System.out.println(A[j]);
                    }
                    break;
                case 4: break;
                default: System.out.println("No valido."); break;
            }
            
            System.out.println("/////////////////////////////////////////////");
            System.out.println("\n¿Que desea hacer?");
            System.out.println("1.Ingresar datos de nuevo");
            System.out.println("2.Ordenar ascendente (Ord.Burbuja)");
            System.out.println("3.Ordenar descendente (Ord.Burbuja)");
            System.out.println("4.Salir");
            System.out.print("OPCION: ");opc=sc.nextInt();
        }while(opc!=4);
    }
}
