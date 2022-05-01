package Metodos;

import java.util.Random;

public class MetodosdeOrdenamiento {

    public int[] MetodoBurbuja(int[] array) {
        int i, j, aux;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public void quicksort(int[] array, int izq, int der) {
        int i, j, pivote, aux;
        i = izq;
        j = der;
        pivote = array[(izq + der) / 2];
        do {
            while (array[i] < pivote && i < der) {
                i++;
            }
            while (array[j] > pivote && j > izq) {
                j--;
            }
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(array, izq, j);
        }
        if (i < der) {
            quicksort(array, i, der);
        }
    }

    public static void HeapSort(int[] array) {
        final int N = array.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(array, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = array[0];
            array[0]    = array[nodo];
            array[nodo] = tmp;
            hacerMonticulo(array, 0, nodo-1);
        }
    }

    public static void hacerMonticulo(int[] v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo(v, may, fin);
        }
    }

    public int[] random(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(5000001);
        }
        return array;
    }
}
