package p14_arbol;

import java.applet.Applet;
import java.awt.Graphics;

public class P14_Arbol extends Applet {

    nodo raiz;
    int i = 0;

    public P14_Arbol() {
        raiz = new nodo(50);
        raiz.izq = new nodo(20);
        raiz.izq.izq = new nodo(15);
        raiz.izq.der = new nodo(30);
        raiz.der = new nodo(60);
        raiz.der.izq = new nodo(55);
    }

    public void paint(Graphics g) {
        orden(g, raiz);
    }

    public void orden(Graphics g, nodo p) {
        if (p.izq != null) {
            orden(g, p.der);
            if (p.der != null) {
                orden(g, p.izq);
            }
        }
        i++;
        g.drawString("" + p.info, 20 + (15 * i), 20);
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
