package p1_arbol;

import java.applet.Applet;
import java.awt.Graphics;

public class P1_Arbol  extends Applet{
    nodo raiz;

    public P1_Arbol() {
    }
    
    public void paint(Graphics g) {
        raiz = new nodo(10);
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
