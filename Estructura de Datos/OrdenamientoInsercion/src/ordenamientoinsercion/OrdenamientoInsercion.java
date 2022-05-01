package ordenamientoinsercion;


public class OrdenamientoInsercion {
    public static void ordenar(int[] array) {
        int pos,aux;
        for (int i = 0; i < array.length; i++) {
            aux=array[i];
            while ((i>0)&&(array[i-1]>aux)) {
                array[i]=array[i-1];
                i--;
            }
            array[i]=aux;
        }
    }

    public static void imprimirLista(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int lista[] = {9, 1, 4, 2, 8, 3, 5, 6, 7, 0, 10, 13, 12, 11, 16, 14, 15, 17, 19, 18};
        System.out.print("Lista desordenada: ");
        imprimirLista(lista);

        ordenar(lista);

        System.out.print("Lista ordenada: ");
        imprimirLista(lista);
    }

}
