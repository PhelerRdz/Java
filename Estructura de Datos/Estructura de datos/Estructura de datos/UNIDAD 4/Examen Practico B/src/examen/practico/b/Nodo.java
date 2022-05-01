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
public class Nodo {
    int dato,fe;
    Nodo izq,der;

    public Nodo(int dato){
        this.dato=dato;
        fe=0;
    }
    public Nodo(int dato, int fe, Nodo izq, Nodo der) {
        this.dato = dato;
        this.fe = fe;
        this.izq = izq;
        this.der = der;
        fe=0;
    }

}
