/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_01_arboles;

import java.applet.*;
import java.awt.*;
/**
 *
 * @author ZUBIRI
 */
public class arbol extends Applet{
nodo raiz;
public arbol()
{

}
    
@Override
public void paint(Graphics g){
    raiz=new nodo(10);
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

