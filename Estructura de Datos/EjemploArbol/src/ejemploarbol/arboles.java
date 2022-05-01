import java.applet.*;
//import java.awt.*;
import java.io.*;

class Nodo
{
    int info;

    Nodo der;
    Nodo izq;
    Nodo (int info)
    {
        this.info = info;
        izq = der = null;
    }
}   

public class arboles extends Applet
{
    int cantNodos;
    int altura = 0;

    public arboles() throws IOException
    {
        Nodo raiz = binario();
        caltura(raiz, 0);

        System.out.print("LA ALTURA ES =>" );
        System.out.println(altura );
        System.out.println("");

        System.out.print("LA CANTIDAD DE NODOS DEL ARBOL ES =>" );
        System.out.println( );
        System.out.println("");       

        System.out.println("<< COMO QUIERE VISUALIZAR EL ARBOL >>" );
        System.out.println("");

        System.out.println( "1) :<< PREORDEN >>" );
        System.out.println( "2) :<< POSORDEN >>" );
        System.out.println( "3) :<< INORDEN >>" );

        System.out.println("");
        System.out.print( "<< SELECCIONE LA OPCION DESEADA >>" );

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String linea = leer.readLine();
        int opcion = Integer.parseInt(linea);

        System.out.println("");
        System.out.println("");

        System.out.println("<< COMO QUIERE IMPRIMIR EL ARBOL >>" );
        System.out.println("");

        System.out.println( "4) :<< PANTALLA >>" );
        System.out.println( "5) :<< ARCHIVO >>" );

        System.out.println("");
        System.out.print( "<< SELECCIONE LA OPCION DESEADA >>" );

        BufferedReader leer1 = new BufferedReader(new InputStreamReader(System.in));
        String linea1 = leer1.readLine();
        int opcion1 = Integer.parseInt(linea1);

        if (opcion == 1)
            preorden(raiz);

        if (opcion == 2)
            posorden(raiz);

        if (opcion == 3)
            inorden(raiz);

        /*if (opcion1== 4)
            archivo();
        */
        if (opcion1== 5)
            archivo();   

    }

    Nodo binario()
    {
        Nodo m=new Nodo(17);
        InsDer(m,15);
        InsIzq(m,1);
        InsDer(m.der,21);
        InsDer(m.der.der,27);
        InsDer(m.der.der.der,13);
        InsIzq(m.der.der.der,9);
        InsIzq(m.der.der,4);
        InsIzq(m.der,2);
        InsDer(m.der.izq,29);
        InsIzq(m.der.izq,14);
        InsDer(m.der.izq.izq,19);
        InsIzq(m.der.izq.izq,28);
        InsDer(m.izq,6);
        InsIzq(m.izq.der,25);
        InsDer(m.izq.der.izq,30);
        InsIzq(m.izq.der.izq,16);
        InsIzq(m.izq,23);
        InsDer(m.izq.izq,5);
        InsDer(m.izq.izq.der,31);
        InsIzq(m.izq.izq,12);
        InsDer(m.izq.izq.izq,24);
        InsIzq(m.izq.izq.izq,11);

        return m;
    }

    void InsDer(Nodo raiz,int n)
    {
        Nodo Nuevo = new Nodo (n);
        raiz.der=Nuevo;
    }

    void InsIzq(Nodo raiz,int n)
    {
        Nodo Nuevo = new Nodo (n);
        raiz.izq=Nuevo;
    }

    void archivo() throws IOException
    {
     File mm  = new File("mm.txt");
        try {

              if (mm.createNewFile())
                System.out.println("EL Archivo se ha creado correctamente");
              else
                System.out.println("El Archivo no pudo ser creado");
            } catch (IOException ioe) {
              ioe.printStackTrace();
            }
    }

    void preorden (Nodo Raiz)
    {
        if (Raiz!=null)
        {
            System.out.println(Raiz.info);

            preorden (Raiz.izq);
            preorden(Raiz.der);
        }

    }

    void posorden(Nodo Raiz)
    {
        if (Raiz!=null)
        {
            posorden(Raiz.izq);
            posorden(Raiz.der);
            System.out.println(Raiz.info);
        }
    }
    void inorden(Nodo Raiz)
    {
        if (Raiz!=null)
        {
            inorden(Raiz.izq);
            System.out.println(Raiz.info);
            inorden(Raiz.der);

        }
    }

    void caltura (Nodo Raiz, int alt)
    {
        if (alt > altura)
            altura = alt;

        if (Raiz!=null){
            caltura (Raiz.izq, alt+1);
            caltura (Raiz.der, alt+1);

        }
    }

}