package p3_arbol;

import java.applet.Applet;
import java.awt.Graphics;
public class P3_Arbol extends Applet {

    nodo raiz;

    public P3_Arbol() {
    }

    public void paint(Graphics g) {
        raiz = new nodo(10);
        ins_izq(5);
        ins_der(15);
        g.drawString("" + raiz.info,10,20);
        g.drawString("" + raiz.izq.info,10,40);        
        g.drawString("" + raiz.der.info,10,60);
    }

    void ins_izq(int n) {
        nodo nuevo, aux = raiz;
        for (aux = raiz; aux.izq != null; aux = aux.izq);
        nuevo = new nodo(n);
        aux.izq = nuevo;
    }

    void ins_der(int n) {
        nodo nuevo, aux = raiz;
        for (aux = raiz; aux.der != null; aux = aux.der);
        nuevo = new nodo(n);
        aux.der = nuevo;
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