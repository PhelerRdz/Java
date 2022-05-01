package p7_arbol;

import java.applet.Applet;
import java.awt.Graphics;

public class P7_Arbol extends Applet {

    nodo raiz;

    public P7_Arbol() {
    }

    public void paint(Graphics g) {
        raiz = new nodo('A');
        ins_izq('B');
        ins_der('C');
        g.drawString("" + raiz.izq.info, 10, 15);
        g.drawString("" + raiz.info, 10, 30);
        g.drawString("" + raiz.der.info, 10, 45);
    }

    void ins_izq(char n) {
        nodo nuevo, aux = raiz;
        for (aux = raiz; aux.izq != null; aux = aux.izq);
        nuevo = new nodo(n);
        aux.izq = nuevo;
    }

    void ins_der(char n) {
        nodo nuevo, aux = raiz;
        for (aux = raiz; aux.der != null; aux = aux.der);
        nuevo = new nodo(n);
        aux.der = nuevo;
    }

    class nodo {

        char info;

        nodo(char info) {
            this.info = info;
        }
        nodo izq;
        nodo der;
    }

}

