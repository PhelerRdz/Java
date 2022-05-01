package p1_metodoburbuja;


public class OrdenamientoBurbuja {
    public static void ordenar(int[] arreglo) {
        int aux, i, j;
        for (i = 0; i < arreglo.length - 1; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public static void imprimirLista(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int lista[] = {9, 1, 4, 2, 8, 3, 5, 6, 7, 0};
        System.out.print("Lista desordenada: ");
        imprimirLista(lista);

        ordenar(lista);

        System.out.print("Lista ordenada: ");
        imprimirLista(lista);
    }

}
