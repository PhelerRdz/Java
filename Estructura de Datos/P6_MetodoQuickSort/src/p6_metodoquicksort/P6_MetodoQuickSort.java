package p6_metodoquicksort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class P6_MetodoQuickSort {
    public static void main(String[] args) {
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        try {
            String patch = buscador.getSelectedFile().getAbsolutePath();
            String cadena;
            FileReader f = new FileReader(patch);
            BufferedReader b = new BufferedReader(f);
            System.out.println("Cadena dentro del Archivo en la ruta" + patch);
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena);
                System.out.println("");
                Integer mayor = 0, menor = 0;
                String[] B;
                String delimiter = ",";
                B = cadena.split(delimiter);
                Integer[] A = new Integer[B.length];
                for (int i = 0; i < A.length; i++) {
                    A[i] = Integer.parseInt(B[i]);
                }
                quicksort(A, 0, A.length - 1);
                System.out.println("Lista Ordenada");
                for (int k = 0; k < A.length; k++) {
                    if (k < A.length - 1) {
                        System.out.print(A[k] + " * ");
                    } else {
                        System.out.println(A[A.length - 1]);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Error Exception");
        }
    }
    public static void quicksort(Integer A[], Integer izq, Integer der) {
        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {
            while (A[i] <= pivote && i < j) {
                i++;
            }
            while (A[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);
        }
    }
}
