/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_11_arbols;

/**
 *
 * @author ZUBIRI
 */
import java.applet.*;
import java.awt.*;
public class arbol extends Applet{
	nodo raiz;
	int i=0;
	public arbol(){
		raiz=new nodo(10);
		raiz.izq=new nodo(9);
		raiz.izq.izq=new nodo(8);
		raiz.der=new nodo(20);
		raiz.der.izq=new nodo(15);
		raiz.der.izq.izq=new nodo(13);
		raiz.der.izq.der=new nodo(16);
		raiz.der.der=new nodo(21);
	}
public void paint(Graphics g){
	orden(g,raiz);
}
public void orden(Graphics g,nodo p){
	if (p.izq!=null){
		orden(g,p.izq);
                if (p.der!=null)
	        orden(g,p.der);
	}
	i++;
	g.drawString(""+p.info,20+(15*i),20); i++;

}
class nodo{
	int info;
	nodo(int info){
		this.info=info;
	}
	nodo izq;
	nodo der;
}
}
