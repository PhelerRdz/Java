/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.practico.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ZUBIRI
 */
public class ExamenPracticoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Arbol arbol = new Arbol();
        File f = new File("datos.txt");
        String linea,aux="";
        int dato,buscar;
        int opc;
        Scanner sc = new Scanner(System.in);
        
        String datos[] = null;
        if (f.exists()){
            System.out.println("Archivo Cargado... \"datos.txt\"");
            aux = elementosLeidos(f);
            
            if ("".equals(aux.trim())) {
                System.out.println("*** No se encontraron datos *** ");
            }else{
                datos = aux.split(",");
                
            for (int i = 0; i < datos.length; i++) {
                if (datos[i].trim()!="") {
                    dato=Integer.valueOf(datos[i]);
                    arbol.insertar(dato);
                }        
            }
            do {    
                System.out.println("-----------------------------------------------------");
                System.out.println("   Menu de Opciones");
                System.out.println("1. Mostrar Elementos Leídos en archivo ");
                System.out.println("2. Recorrido PreOrden");
                System.out.println("3. Recorrido InOrden");
                System.out.println("4. Recorrido PostOrden");
                System.out.println("5. Imprimir por niveles ");
                System.out.println("   -Peso");
                System.out.println("   -Niveles");
                System.out.println("   -Nodos Hoja");
                System.out.println("   -Nodos Terminales");
                System.out.println("6. Buscar dato en el Arbol");
                System.out.println("7. Salir");
                System.out.println("-----------------------------------------------------");
                System.out.print("OPCIÓN: ");opc=sc.nextInt();
                System.out.println("");
                switch(opc){
                    case 1:
                        aux=elementosLeidos(f);
                        if ("".equals(aux.trim())) {
                                System.out.println("*** No se encontraron datos *** ");
                        }else{
                            arbol= new Arbol();
                            datos = aux.split(",");

                            for (int i = 0; i < datos.length; i++) {
                                if (datos[i].trim()!="") {
                                    dato=Integer.valueOf(datos[i]);
                                    arbol.insertar(dato);
                                }        
                            }
                        System.out.print("Contenido Encontrado: "+aux+"\n");
                        }
                        break;
                    case 2: 
                        System.out.println("Recorrido PreOrden...");
                        arbol.preOrden(arbol.raiz);
                        System.out.println("");
                        break;
                    case 3: 
                        System.out.println("Recorrido InOrden...");
                        arbol.inOrden(arbol.raiz);
                        System.out.println("");
                        break;
                    case 4: 
                        System.out.println("Recorrido PostOrden...");
                        arbol.postOrden(arbol.raiz);
                        System.out.println("");
                        break;
                    case 5: 
                        System.out.println("\n Arbol Balanceado AVL");
                        arbol.imprimirPorNiveles(arbol.raiz);
                        System.out.println("");
                        break;
                    
                    case 6: 
                        System.out.print("Dato a buscar: ");
                        buscar=sc.nextInt();
                        arbol.buscar(arbol.raiz, buscar);
                        break;
                    case 7: break;
                    default:System.out.println("*** Opcion No válida ***");
                }
            } while (opc!=7);
            }
            
    }
    else System.out.println("Archivo \"datos.txt\" no encontrado");
        
        
    }
    
    public static String elementosLeidos(File f) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String linea,aux="";
        
        while((linea=br.readLine())!=null){
            aux+=linea+","; //Todo el contenido lo transforma a una linea
        }
        
        br.close();
        fr.close();
        return aux;
    }
    
}
