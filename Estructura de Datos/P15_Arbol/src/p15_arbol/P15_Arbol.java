package p15_arbol;

import java.applet.Applet;
import java.awt.Graphics;

public class P15_Arbol extends Applet {

    nodo raiz;
    int i = 0;

    public P15_Arbol() {
        raiz = new nodo(10);
        insertar(9, raiz);
        insertar(20, raiz);
        insertar(15, raiz);
        insertar(13, raiz);
        insertar(16, raiz);
        insertar(21, raiz);
    }

    public void insertar(int n, nodo r) {
        if (n < r.info) {
            if (r.izq == null) {
                r.izq = new nodo(n);
            } else {
                insertar(n, r.izq);
            }
        }
        if (n > r.info) {
            if (r.der == null) {
                r.der = new nodo(n);
            } else {
                insertar(n, r.der);
            }
        }
    }

    public void paint(Graphics g) {
    }
}

class nodo {

    int info;

    nodo(int info) {
        this.info = info;
    }
    nodo izq;
    nodo der;
}
