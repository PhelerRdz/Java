/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoshell;

/**
 *
 * @author Pheler
 */
public class OrdenamientoShell {

    public static void ordenar(int array[]) {
        int salto, aux, i;
        boolean cambios;
        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < array.length; i++){
                    if (array[i - salto] > array[i]) {
                        aux = array[i]; 
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;
                    }
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
