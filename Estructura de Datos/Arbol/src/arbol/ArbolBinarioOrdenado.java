package arbol;

import java.util.Scanner;

public class ArbolBinarioOrdenado {

    class Nodo {

        int info;
        Nodo izq, der;
    }
    Nodo raiz;
    int cant;
    int altura;

    public ArbolBinarioOrdenado() {
        raiz = null;
    }

    public void insertar(int info) {
        if (!existe(info)) {
            Nodo nuevo;
            nuevo = new Nodo();
            nuevo.info = info;
            nuevo.izq = null;
            nuevo.der = null;
            if (raiz == null) {
                raiz = nuevo;
            } else {
                Nodo anterior = null, reco;
                reco = raiz;
                while (reco != null) {
                    anterior = reco;
                    if (info < reco.info) {
                        reco = reco.izq;
                    } else {
                        reco = reco.der;
                    }
                }
                if (info < anterior.info) {
                    anterior.izq = nuevo;
                } else {
                    anterior.der = nuevo;
                }
            }
        }
    }

    public boolean existe(int info) {
        Nodo reco = raiz;
        while (reco != null) {
            if (info == reco.info) {
                return true;
            } else if (info > reco.info) {
                reco = reco.der;
            } else {
                reco = reco.izq;
            }
        }
        return false;
    }

    private void imprimirInOrden(Nodo reco) {
        if (reco != null) {
            imprimirInOrden(reco.izq);
            System.out.print(reco.info + " ");
            imprimirInOrden(reco.der);
        }
    }

    public void imprimirInOrden() {
        imprimirInOrden(raiz);
        System.out.println();
    }

    private void imprimirPostOrden(Nodo reco) {
        if (reco != null) {
            imprimirPostOrden(reco.izq);
            imprimirPostOrden(reco.der);
            System.out.print(reco.info + " ");
        }
    }

    public void imprimirPostOrden() {
        imprimirPostOrden(raiz);
        System.out.println();
    }

    private void imprimirPreOrden(Nodo reco) {
        if (reco != null) {
            System.out.print(reco.info + " ");
            imprimirPreOrden(reco.izq);
            imprimirPreOrden(reco.der);
        }
    }

    public void imprimirPreOrden() {
        imprimirPreOrden(raiz);
        System.out.println();
    }

    private void cantidad(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.izq);
            cantidad(reco.der);
        }
    }

    public int cantidad() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.izq == null && reco.der == null) {
                cant++;
            }
            cantidadNodosHoja(reco.izq);
            cantidadNodosHoja(reco.der);
        }
    }

    public int cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return cant;
    }

    private void imprimirEntreConNivel(Nodo reco, int nivel) {
        if (reco != null) {
            imprimirEntreConNivel(reco.izq, nivel + 1);
            System.out.print(reco.info + " (" + nivel + ") - ");
            imprimirEntreConNivel(reco.der, nivel + 1);
        }
    }

    public void imprimirEntreConNivel() {
        imprimirEntreConNivel(raiz, 1);
        System.out.println();
    }

    private void encontrarelemento(Nodo reco, int nivel, int ele) {
        boolean band=false;
        if (nivel==1) {
            int cont=0;
        }
        if (reco != null) {
            encontrarelemento(reco.izq, nivel + 1, ele);
            if (ele == reco.info) {
                System.out.print(reco.info + " (" + nivel + ") ");
                band=true;
            }
            encontrarelemento(reco.der, nivel + 1, ele);
        }
    }

    public void encontrarelemento(int ele) {
        encontrarelemento(raiz, 1, ele);
        System.out.println();
    }
    
    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.izq, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.der, nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado();
        System.out.print("Cuantos elementos desearas insertar en tu Arbol: ");
        int elementos = sc.nextInt();
        for (int i = 1; i <= elementos; i++) {
            System.out.println("Ingresar Valor del Elemento \"" + i + "\"");
            abo.insertar(sc.nextInt());
        }
        System.out.print("Impresion PreOrden: ");
        abo.imprimirPreOrden();
        System.out.print("Impresion InOrden: ");
        abo.imprimirInOrden();
        System.out.print("Impresion PostOrden: ");
        abo.imprimirPostOrden();
        System.out.println("Cantidad de nodos hoja y/o terminales: " + abo.cantidadNodosHoja());
        System.out.println("Impresion en entre orden junto al nivel del nodo.");
        abo.imprimirEntreConNivel();
        System.out.print("Nivel del arbol: ");
        System.out.println(abo.retornarAltura());
        System.out.println("Peso Total del árbol: " + abo.cantidad());
        System.out.println("Quieres buscar un elemento dentro del Arbol?");
        System.out.println("Si y No\nDigite su respuesta:");
        sc.nextLine();
        String opc=sc.nextLine();
        switch (opc.toLowerCase()) {
            case "si":
                System.out.println("Que elemento desea buscar?");
                System.out.println("Recuerde: Si al final no muestra nada es \n\tporque no encontro ningun valor equivalente");
                int ele=sc.nextInt();
                abo.encontrarelemento(ele);
                break;
            case "no":
                System.out.println("Gracias por usar el programa....");
                break;
            default:
                throw new AssertionError();
        }
    }
}
