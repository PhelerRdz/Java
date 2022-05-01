package ordenamientoseleccion;


public class OrdenamientoSeleccion {
    public static void ordenar(int[] arreglo) {
        int contador = 1;//solo util para contar las comparaciones
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                //System.out.println("Comparacion #" + contador);
                contador++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
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
