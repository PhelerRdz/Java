/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_03_arboles;

/**
 *
 * @author ZUBIRI
 */
import java.applet.*;
import java.awt.*;
public class arbol extends Applet{
	nodo raiz;
        nodo nuevo, aux=raiz;
	public arbol(){}
	public void paint(Graphics g){
            raiz=new nodo(10);
            ins_izq(5);
            ins_der(15);
	}
	void ins_izq(int n){
            for(aux=raiz; aux.izq!=null;aux=aux.izq);
            nuevo=new nodo(n);
            aux.izq=nuevo;
	}
        void ins_der(int n){
            nodo Nuevo, aux=raiz;
            for(aux=raiz; aux.der!=null;aux=aux.der);
            nuevo=new nodo(n);
            aux.izq=nuevo;
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
