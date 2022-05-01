/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_u5_02_grafonoponderado;

import java.util.Scanner;

/**
 *
 * @author ZUBIRI
 */
public class EDD_U5_02_GrafoNoPonderado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,resp;
        Scanner sc=new Scanner(System.in);
        
        do {
            System.out.print("Cantidad de nodos: "); n=sc.nextInt();
            if (n<2) {
                System.out.println("*** Cantidad no válida ***");
            }
        } while (n<2);
        
        EDD_U5_02_GrafoNoPonderado matriz = new EDD_U5_02_GrafoNoPonderado(n);
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.println("¿El nodo "+(i+1)+" apunta al nodo "+(j+1)+"?");
                    System.out.println("  1.Si");
                    System.out.println("  2.No");
                    resp=sc.nextInt();
                    if (resp!=1 && resp!=2) {
                        System.out.println("*** Respuesta no válida ***\n");
                    }else if (resp==1) {
                        matriz.agregar(i, j);
                    }
                    
                } while (resp!=1 && resp!=2);
            }
        }
        System.out.println("");
        System.out.println("Representacion del Grafo No Ponderado");
        matriz.imprimir();
    }
    
    private int n;
    private int[][] matriz;
   
    public EDD_U5_02_GrafoNoPonderado(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }           
        }
    }
   
    public void agregar(int i, int j){
        matriz[i][j] = 1;
    }
   
    public void imprimir(){
            System.out.printf("%-6s", " ");
            int i,j;
            
            for ( i = 0; i < n; i++) {
                System.out.printf("%-6s ", "["+(i+1)+"]");
            }
            
            System.out.println("");
            for (i = 0; i < n; i++) {
                System.out.printf("%-6s ", "["+(i+1)+"]");
                
                
            for (j = 0; j < n; j++) {
                System.out.printf("%-6s ", matriz[i][j]);
            }
            System.out.println("");
            }
    }
    
}
