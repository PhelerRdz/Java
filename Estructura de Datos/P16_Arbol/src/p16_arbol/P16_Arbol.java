package p16_arbol;

import java.applet.Applet;
import java.awt.Graphics;

public class P16_Arbol extends Applet {

    nodo raiz;
    int i = 0;

    public P16_Arbol() {
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
        orden(g, raiz);
    }

    public void orden(Graphics g, nodo p) {
        if (p.izq != null) {
            orden(g, p.izq);
        }
        i++;
        g.drawString("" + p.info, 10 + (15 * i), 30);
        if (p.der != null) {
            orden(g, p.der);
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
}

