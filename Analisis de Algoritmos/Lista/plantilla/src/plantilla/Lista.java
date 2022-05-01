package plantilla;

import hsa.Console;

public class Lista {

    Nodo RaizPri;

    Lista() {
        RaizPri = null;
    }

    void Inserta(String Nombre, String Direccion) {
        if (RaizPri == null) {
            RaizPri = new Nodo(Nombre, Direccion, null, null);
        } else {
            Nodo nuevo = new Nodo(Nombre, Direccion, null, RaizPri);
            RaizPri.setIzq(nuevo);
            RaizPri = nuevo;
        }
    }

    void Visualiza(Nodo raiz, Console pantalla) {
        while (raiz != null) {
            pantalla.println("Nombre: " + raiz.Nombre + "\t\t\tDireccion: " + raiz.Direccion);
            raiz = raiz.Der;
        }
    }

}
