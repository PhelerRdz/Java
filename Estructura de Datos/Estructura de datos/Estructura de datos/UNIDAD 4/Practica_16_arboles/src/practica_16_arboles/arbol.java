/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_16_arboles;

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
		insertar(9,raiz);
		insertar(20,raiz);
		insertar(15,raiz);
		insertar(13,raiz);
		insertar(16,raiz);
		insertar(21,raiz);
	}
public void insertar(int n, nodo r){
	if (n<r.info){
		if (r.izq==null)
			r.izq=new nodo(n);
		else
			insertar(n,r.izq);
	}
	if (n>r.info){
		if (r.der==null)
			r.der=new nodo(n);
		else
			insertar(n,r.der);
	}
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


}
class nodo{
	int info;
	nodo(int info){
		this.info=info;
	}
	nodo izq;
	nodo der;
}
