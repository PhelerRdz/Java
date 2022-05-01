package Metodos;

import java.util.Random;

public class MetodosOrdenamiento {

    public void MetodoBurbuja(int[] vector) {
        int i, j, aux;
        for (i = 0; i < vector.length; i++) {
            for (j = 0; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public void quicksort(int[] vector, int izq, int der) {
        int i, j, pivote, aux;
        i = izq;
        j = der;
        pivote = vector[(izq + der) / 2];
        do {
            while (vector[i] < pivote && i < der) {
                i++;
            }
            while (vector[j] > pivote && j > izq) {
                j--;
            }
            if (i <= j) {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(vector, izq, j);
        }
        if (i < der) {
            quicksort(vector, i, der);
        }
    }

    public void HeapSort(int[] vector) {
        final int N = vector.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(vector, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = vector[0];
            vector[0]    = vector[nodo];
            vector[nodo] = tmp;
            hacerMonticulo(vector, 0, nodo-1);
        }
    }

    public void hacerMonticulo(int[] v, int nodo, int fin) {
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

    public int[] random(int[] vector) {
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(5000001);
        }
        return vector;
    }
}
