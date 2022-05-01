package p1_arbol;

import java.applet.Applet;
import java.awt.Graphics;
public class P2_Arbol extends Applet {
    nodo raiz;

    public P2_Arbol() {
    }
    
    public void paint(Graphics g) {
        raiz = new nodo(10);
        g.drawString("" + raiz.info,10,20);
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
