package usodemetodosdeordenamiento;

import Metodos.MetodosOrdenamiento;

public class UsodeMetodosdeOrdenamiento {

    public static void main(String[] args) {
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int[] array = new int[5000000];
        metodos.random(array);
        int inicio = (int) System.currentTimeMillis();
        metodos.MetodoBurbuja(array);
        int fin = (int) System.currentTimeMillis();
        float tiempo = ((float)(fin - inicio)/1000);
        System.out.println(tiempo +" segundos");
        inicio=0;fin = 0;tiempo=0;
        inicio = (int) System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");
        }
        fin = (int) System.currentTimeMillis();
        tiempo = ((float)(fin - inicio)/1000);
        System.out.println(tiempo +" segundos");
        
    }
}
