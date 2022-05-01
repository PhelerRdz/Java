package lista.doblmente.enlazada.circular;

import java.util.Scanner;

public class ListaDE {
    int tamano=0:
    Nodo inicio;
    Nodo fin;
    public  boolean vacia(){
        return(tamano==0);
    }
    public void isertar_inicio(String dato){
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            inicio = nuevo;
            fin=nuevo;
            
            inicio.nodoSig=fin;
            fin.nodoSig=inicio;
            inicio.nodoAnt=fin;
            fin.nodoAnt=inicio;
            
            tamano++;
            
        }else{
            Nodo aux=inicio;
            nuevo.nodoSig=uaux;
            aux.nodoAnt=nuevo;
            
            inicio = nuevo;
            
            tamano++;
        }
    }
    
    public void isertar_final(String dato){
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            inicio = nuevo;
            fin=nuevo;
            
            inicio.nodoSig=fin;
            fin.nodoSig=inicio;
            inicio.nodoAnt=fin;
            fin.nodoAnt=inicio;
            
            tamano++;
            
        }else{
            Nodo aux=fin;
            aux.nodoSig=nuevo;
            nuevo.nodoAnt=aux;
            
            fin = nuevo;
            
            tamano++;
        }
    }
    
    public void orden_inserccion(){
        
    }
}
