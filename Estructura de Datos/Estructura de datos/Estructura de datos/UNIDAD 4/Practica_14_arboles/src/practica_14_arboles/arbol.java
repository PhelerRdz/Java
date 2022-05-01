/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_14_arboles;

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
		raiz=new nodo(50);
		raiz.izq=new nodo(20);
		raiz.izq.izq=new nodo(15);
		raiz.izq.der=new nodo(30);
		raiz.der=new nodo(60);
		raiz.der.izq=new nodo(55);
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
