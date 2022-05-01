
package practica_02_arboles;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author ZUBIRI
 */

public class arbol extends Applet{
nodo raiz;
public arbol(){}
@Override
public void paint(Graphics g){
	raiz=new nodo(10);
	g.drawString(""+raiz.info,10,20);
        
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

