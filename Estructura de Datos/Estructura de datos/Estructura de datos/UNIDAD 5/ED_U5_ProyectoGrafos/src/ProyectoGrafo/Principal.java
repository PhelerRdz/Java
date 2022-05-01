package ProyectoGrafo;
/* 
Carrasco Garcia Orlando Joshua
Segura Morales Jesus Salvador
Silva Gabino Victor Alberto
Sosa Valdes Brandon Alejandro
Zubiri Valdez Hedson Leonardo
*/

import java.util.PriorityQueue;
import java.util.Scanner;

///* 
//Representacion de grafos de la empresa transportista. Puede enforcarse a:
//    Tamaño de Carga
//    Importe de Gasto de Gasolina
//    Distancia de recorrido
//    O alguna otra manipulación
//*/
public class Principal {
    
    public static void imprimir(String a[], int mat[][]){        
        System.out.println("");
        System.out.printf("%-10s", " ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-10s", a[i]);
        }

        System.out.println("");
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%-10s", a[i]);
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%-10s", mat[i][j]);
            }
            System.out.println("");
        }
    }
            
    public static void copiarMatriz(int[][] pegar, int[][] copiar) {
        for (int i = 0; i < pegar.length; i++) {
            for (int j = 0; j < pegar[0].length; j++) {
                pegar[i][j] = copiar[i][j];
            }
        }
    }
    
    public static int[][] AlgoritmoW(int[][] original, int[][] aux) {
        int n = original.length;
        int[][] ans = new int[n][n];

        copiarMatriz(ans, original);

        // Calcular rutas sucesivamente a través de una mejor k vértices.
        for (int k = 0; k < n; k++) {

            // Es así que entre cada par de puntos posibles.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ans[i][k] + ans[k][j] < ans[i][j]) {
                        ans[i][j] = ans[i][k] + ans[k][j];
                        aux[i][j] = aux[k][j];
                    }
                }
            }
        }
        // Devuelva la matriz camino más corto.
        return ans;
    }
    
    public static int[] AlgoritmoD(int inicio, int n, int mat[][]) {
        int[][] matrizAux = new int[n][n];
        copiarMatriz(matrizAux, mat);
        int[] distancia = new int[n];
        int[] padre = new int[n];
        boolean[] visto = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            distancia[i] = 1200000000;
            padre[i] = -1;
            visto[i] = false;
        }
        
        distancia[inicio]=0;
        PriorityQueue<Integer> pila = new PriorityQueue<>();
        pila.add(distancia[inicio]);
        
        while (!pila.isEmpty()) {
            int u = pila.poll();
            visto[u] = true;
            for (int i = 0; i < n; i++) {
                if (matrizAux[u][i] != 0) {
                    if (distancia[i] > distancia[u] + matrizAux[u][i]) {
                        distancia[i] = distancia[u] + matrizAux[u][i];
                        padre[i] = u;
                        pila.add(i);
                    }
                }
            }
        }       
        return distancia;
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, camino;
        int mat[][];
        String datos[];
        String dat;
        int i, j;
        int opcion;
        
        System.out.println("Grafo Ponderado");
        System.out.print("Cuantos lugares tienes?: ");
        n = sc.nextInt();
        mat = new int[n][n];
        datos = new String[n];
        
        System.out.println("\nIngrese nombre de los lugares: ");
        sc.nextLine(); 
        for (i = 0; i < n; i++) {
            System.out.print("Dato "+(i+1)+": ");
            dat = sc.nextLine();
            while(dat.replaceAll(" ", "").equals("")){
                System.out.println("Nombre vacio, ingrese de nuevo");
                dat = sc.nextLine();
            }
            datos[i] = dat;
        }
        
        System.out.println("\nIngrese las distancias de los caminos");
        System.out.println("(Si NO existe el camino, ingrese un numero mayor o igual a 100)");
        System.out.println("(Si ingresa datos menores a 0, se tomaran como 0)");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if(i!=j){
                    System.out.print("\""+datos[i] + "\" -> \""+datos[j]+"\" : ");
                    camino = sc.nextInt();
                    if(camino > 0) mat[i][j] = camino;
                    else mat[i][j] = 0;
                }else {
                    camino = 0;
                    mat[i][j] = camino;
                }                    
            }
        }
        
        //Se comienza a implementar el algoritmo Warshall para poder guardar la matriz
        int[][] aux = new int[n][n];
        copiarMatriz(aux, mat);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (mat[i][j] > 100) aux[i][j] = -1;
                else aux[i][j] = i;
            }
        }
        
        for (i = 0; i < n; i++) {
            aux[i][i] = i;
        }
        
        int warshall[][] = AlgoritmoW(mat, aux);    
        //Fin de la matriz con el algoritmo Warshall
        
        
        do {
            System.out.println("\n----------MENU----------");
            System.out.println("Elija una opcion");
            System.out.println("1) Ver Matriz Original");
            System.out.println("2) Ver Matriz con Algoritmo Warshall");
            System.out.println("3) Ver Matriz con Algoritmo Dijkstra (Caminos minimos)");
            System.out.println("9) Salir :c");
            opcion = sc.nextInt();
            System.out.println("------------------------\n");
            switch (opcion) {
                //Imprime la matriz original
                case 1:
                    imprimir(datos, mat);                
                    break;
                
                //Imprime la matriz con el algoritmo Warshall
                case 2:
                    imprimir(datos, warshall);
                    break;
                
                //Imprime el camino minimo del Algoritmo Warshall 
                //desde el nodo 0 hasta nodo n
                case 3:
                    System.out.println("Ingrese Numero de Nodo a llegar");
                    int destino = sc.nextInt();
                    if(destino > 0 && destino < n)
                        System.out.println("Camino minimo a \""+datos[destino]+"\n es de: "
                                            +AlgoritmoD(0, n, mat)[destino] );
                    else System.out.println("Numero de Nodo Invalido");
                    break;
                               
                case 9:
                    System.out.println("byebye");
                    break;
                
                default:
                    System.out.println("Opcion Invalida");
                    break;                
            }
        }while (opcion != 9);        
    }
}
