package p4_arbol;

import java.util.Scanner;
import java.applet.Applet;
import java.awt.Graphics;
public class P4_Arbol extends Applet {

    nodo raiz;

    public P4_Arbol() {
    }

    public void paint(Graphics g) {
        raiz = new nodo(10);
        ins_izq(5);
        g.drawString("" + raiz.info, 10, 20);
        g.drawString("" + raiz.izq.info, 10, 40);
    }

    void ins_izq(int n) {
        nodo nuevo, aux = raiz;
        for (aux = raiz; aux.izq != null; aux = aux.izq);
        nuevo = new nodo(n);
        aux.izq = nuevo;
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
