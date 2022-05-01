package plantilla;

import hsa.Console;

public class Plantilla {

    public static Console c;

    public static void main(String[] args) {
        c = new Console();
        c.println("Ingresa la cantidad de elementos a ingresar: ");
        int cant = c.readInt();
        Lista lista = new Lista();
        Ordenamientos orden = new Ordenamientos();
        String nombre = null;
        String direccion = null;
        for (int i = 0; i < cant; i++) {
            c.println("Ingresa el NOMBRE del elemento numero " + (i + 1) + ": ");
            nombre = c.readLine();
            c.println("Ingresa el DIRECCION del elemento numero " + (i + 1) + ": ");
            direccion = c.readLine();
            lista.Inserta(nombre, direccion);
        }
        Nodo der = lista.RaizPri;
        while (der.Der != null) {
            der = der.Der;
        }
        c.println();
        c.println("==Lista Generada==");
        lista.Visualiza(lista.RaizPri, c);
        c.println();
        c.println("==Ordenar Lista==");
        c.println("¿Con que metodo te gustaria ordenar tu Lista?.");
        int opc = 0;
        do {
            c.println("1.- Metodo Burbuja");
            c.println("2.- Metodo QuickSort");
            c.println("Ingresa el numero de la opcion deseada: ");
            opc = c.readInt();
            switch (opc) {
                case 1:
                    orden.Burbuja(lista.RaizPri);
                    break;
                case 2:
                    orden.QuickSort(lista.RaizPri, lista.RaizPri, der);
                    break;
                default:
                    c.println("Ingrese una opcion validad, por favor.");
            }
        } while (opc != 1 && opc != 2);
        c.println();
        c.println("==Lista Ordenada Generada==");
        lista.Visualiza(lista.RaizPri, c);

    }

}
