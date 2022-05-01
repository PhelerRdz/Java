/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.practico.b;

/**
 *
 * @author ZUBIRI
 */
public class Arbol {
    Nodo raiz;
    int i;

    public Arbol() {
        raiz=null;
    }
    
    //Buscar
    public Nodo buscarNodo(int d,Nodo r){
        if (raiz==null) {
            return null;
        }
        else if(r.dato==d){
            return r;
        }
        else if(r.dato<d){
            return buscarNodo(d, r.der);
        }else{
            return buscarNodo(d, r.izq);
        }
    }
    
   //Obtener factor de equilibrio
    public int obtenerFE(Nodo x){
        if (x==null) {
            return -1;
        }
        else{
            return x.fe;
        }
    }
    
    //Rotacion Izquierda
    public Nodo rotacionIzq(Nodo c){
        Nodo aux = c.izq ;
        c.izq=aux.der;
        aux.der=c;
        c.fe=Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq),obtenerFE(aux.der))+1;  
        return aux;
    }
    
    //Rotacion Derecha
    public Nodo rotacionDer(Nodo c){
        Nodo aux = c.der ;
        c.der=aux.izq;
        aux.izq=c;
        c.fe=Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq),obtenerFE(aux.der))+1;  
        return aux;
    }
    
   //Rotacion doble a la Izquierda
    public Nodo rotacionDobIzq(Nodo c){
        Nodo aux;
        c.izq=rotacionDer(c.izq);
        aux=rotacionIzq(c);
        return aux;
    }
    
    //Rotacion doble a la derecha
    public Nodo rotacionDobDer(Nodo c){
        Nodo aux;
        c.der=rotacionIzq(c.der);
        aux=rotacionDer(c);
        return aux;
    }
    
    //Metodo insertar avl
    public Nodo insertarAVL(Nodo nuevo,Nodo subAr){
        Nodo nuevoPadre=subAr;
        if (nuevo.dato<subAr.dato) {
            if (subAr.izq==null) {
                subAr.izq=nuevo;
            }else{
                subAr.izq=insertarAVL(nuevo, subAr.izq);
                if ((obtenerFE(subAr.izq)-obtenerFE(subAr.der)==2)) {
                    if (nuevo.dato<subAr.izq.dato) {
                        nuevoPadre=rotacionIzq(subAr);
                    }else{
                        nuevoPadre=rotacionDobIzq(subAr);
                    }
                }
            }
        } else if(nuevo.dato>subAr.dato){
            if (subAr.der==null) {
                subAr.der=nuevo;
            }else{
                subAr.der=insertarAVL(nuevo, subAr.der);
                if ((obtenerFE(subAr.der)-obtenerFE(subAr.izq))==2) {
                    if (nuevo.dato>subAr.der.dato) {
                        nuevoPadre=rotacionDer(subAr);
                    }else{
                        nuevoPadre=rotacionDobDer(subAr);
                    }
                }
            }
        } else{
            System.out.println("Ya existe éste dato, no puede haber duplicados: "+nuevo.dato);
        }
        
        //Actualizar la altura
        if ((subAr.izq==null)&&(subAr.der!=null)) {
            subAr.fe=subAr.der.fe+1;
        }else if ((subAr.der==null)&&(subAr.izq!=null)) {
            subAr.fe=subAr.izq.fe+1;
        }else{
            subAr.fe=Math.max(obtenerFE(subAr.izq),obtenerFE(subAr.der))+1;
        }
        return nuevoPadre;
    }
    
    //Metodo void insertar
    public void insertar(int d){
        Nodo nuevo = new Nodo(d);
        if (raiz==null) {
            raiz=nuevo;
           
        }else{
            raiz=insertarAVL(nuevo, raiz);
        }
    }
    
    public boolean esHoja(Nodo r) {
        boolean hoja = false;
        if( (r.izq == null) && (r.der==null) ) {
            hoja = true;
        }
        return hoja;
    }
    
    public void mostrarHoja(Nodo r){
        if (r!=null) {
            if (esHoja(r)) {
                System.out.print("["+r.dato+"] ");
            }
            mostrarHoja(r.izq);
            mostrarHoja(r.der);
            
        }
    }
    //Recorridos
    //InOrden
    public void inOrden(Nodo r){
        if (r!=null) {
            inOrden(r.izq);
            System.out.print(r.dato+", ");
            inOrden(r.der);
        }
    }
    
    //PreOrden
    public void preOrden(Nodo r){
        if (r!=null) {
            System.out.print(r.dato+", ");
            inOrden(r.izq);        
            inOrden(r.der);
        }
    }
    
    //PostOrden
    public void postOrden(Nodo r){
        if (r!=null) {
            inOrden(r.izq);        
            inOrden(r.der);
            System.out.print(r.dato+", ");
        }
    }
    
    
    
    public int calcularAltura(){
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo actual ){
       if (actual == null)
            return -1;
       else
            return 1 + Math.max(calcularAltura(actual.izq), calcularAltura(actual.der));
    }
    
    int nodosTotales=0; int cantUltimoNivel;
    Nodo aux[];
     void imprimirPorNiveles(Nodo nodo){
        // Mediante la altura calcula el total de nodos posibles del arbol
        // Y crea una array cola con ese tamaño
        int max = 0; int j=0;
        nodosTotales=0;
        int nivel = calcularAltura();
        
        for ( ; nivel >= 0; nivel--)
            max += Math.pow(2, nivel);
        max++;      // Suma 1 para no utilizar la posicion 0 del array

        Nodo cola[] = new Nodo[ max ];
        aux=new Nodo[cola.length];
        // Carga en la pos 1 el nodo raiz
        cola[1] = nodo;
        int x = 1;

        // Carga los demas elementos del arbol,
        // Carga null en izq y der si el nodo es null
        // i aumenta de a 2 por q carga en izq y der los hijos
        // x aumenta 1, que son los nodos raiz - padre
        for (int i = 2; i < max; i += 2, x++){
            if (cola[x] == null){
                cola[i] = null;
                cola[i + 1] = null;
            }
            else{
                cola[i]   = cola[x].izq;
                cola[i + 1] = cola[x].der;
            }
        }
        nivel = 0;
        int cont = 0;                       // contador para cada nivel
        int cantidad = 1;                   // cantidad de nodos por nivel
        int ultimaPosicion = 1;             // ultimaPosicion del nodo en la cola de cada nivel

        // Cuando i es = a 2^nivel hay cambio de nivel
        // 2 ^ 0 = 1 que es el nodo raiz
        for ( i = 1; i < max; i++){
            if(i == Math.pow(2, nivel)){
            	// Nodo raiz tiene nivel 1, por eso (nivel + 1)
            	System.out.print("\n Nivel " + (nivel+1) + ": ");
                nivel++;
            }
            if( cola[i] != null ){
                aux[j]=cola[i];
                System.out.print("[" + cola[i].dato + "]");
                j++;
                cont++;
            }
            if(ultimaPosicion == i  && cantidad == Math.pow(2, --nivel)){
                if(cantidad == 1){
                    System.out.print(" Cantidad de nodos: " + cont + " (raiz)");                   
                }
                else{
                    System.out.print(" Cantidad de nodos: " +  cont);
                    cantUltimoNivel=cont;    
                }
                nodosTotales+=cont;    
                cont = 0;
                cantidad *= 2;
                ultimaPosicion += (int)Math.pow(2, ++nivel);
            }
        }
         
         nodosTotales++;
       System.out.println("\n\nCantidad de niveles: "+nivel);
           System.out.println("     Peso del Arbol: "+(nodosTotales-1));
             System.out.print("   Nodos Terminales: ");
              
         for ( i =nodosTotales-cantUltimoNivel-1; i < nodosTotales-1; i++) {
             System.out.print("["+aux[i].dato+"] ");
         }       
         
             System.out.print("\n         Nodos Hoja: ");
         mostrarHoja(raiz);
         
    }
     
    boolean encontrado; int enNivel,enPos;
    public void buscar(Nodo nodo,int dato){
        // Mediante la altura calcula el total de nodos posibles del arbol
        // Y crea una array cola con ese tamaño
        encontrado=false; enNivel=0; enPos=0;
        int max = 0; int j=0;
        nodosTotales=0;
        int nivel = calcularAltura();
        
        for ( ; nivel >= 0; nivel--)
            max += Math.pow(2, nivel);
        max++;      // Suma 1 para no utilizar la posicion 0 del array

        Nodo cola[] = new Nodo[ max ];
        aux=new Nodo[cola.length];
        // Carga en la pos 1 el nodo raiz
        cola[1] = nodo;
        int x = 1;

        // Carga los demas elementos del arbol,
        // Carga null en izq y der si el nodo es null
        // i aumenta de a 2 por q carga en izq y der los hijos
        // x aumenta 1, que son los nodos raiz - padre
        for (int i = 2; i < max; i += 2, x++){
            if (cola[x] == null){
                cola[i] = null;
                cola[i + 1] = null;
            }
            else{
                cola[i]   = cola[x].izq;
                cola[i + 1] = cola[x].der;
            }
        }
        nivel = 0;
        int cont = 0;                       // contador para cada nivel
        int cantidad = 1;                   // cantidad de nodos por nivel
        int ultimaPosicion = 1;             // ultimaPosicion del nodo en la cola de cada nivel

        // Cuando i es = a 2^nivel hay cambio de nivel
        // 2 ^ 0 = 1 que es el nodo raiz
        for ( i = 1; i < max; i++){
            if(i == Math.pow(2, nivel)){
            	// Nodo raiz tiene nivel 1, por eso (nivel + 1)
            	System.out.print("\n Nivel " + (nivel+1) + ": ");
                nivel++;
            }
            if( cola[i] != null ){
                aux[j]=cola[i];
                System.out.print("[" + cola[i].dato + "]");
                
                j++;
                cont++;
                
                if (dato==cola[i].dato) {
                     encontrado=true;
                     enPos=cont;
                     enNivel=nivel;
                }
            }
            if(ultimaPosicion == i  && cantidad == Math.pow(2, --nivel)){
                if(cantidad == 1){
                    System.out.print(" Cantidad de nodos: " + cont + " (raiz)");                   
                }
                else{
                    System.out.print(" Cantidad de nodos: " +  cont);
                    cantUltimoNivel=cont;    
                }
                nodosTotales+=cont;    
                cont = 0;
                cantidad *= 2;
                ultimaPosicion += (int)Math.pow(2, ++nivel);
            }
        }
       
        if (encontrado) {
            if (enNivel==1) {
                System.out.println("\n\nElemento encontrado en la raiz.");
            }else
            System.out.println("\n\nDato encontrado en el nivel "+enNivel+" elemento "+enPos);
        }else{
            System.out.println("\n\nElemento no encontrado en el arbol");
        }
        
         
    }
}
