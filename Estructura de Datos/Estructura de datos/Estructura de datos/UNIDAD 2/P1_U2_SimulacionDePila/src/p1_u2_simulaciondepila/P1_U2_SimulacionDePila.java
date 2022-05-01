/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package p1_u2_simulaciondepila;

import java.util.Scanner;

public class P1_U2_SimulacionDePila {
    public static void main(String[] args) {
        Accesorio []a = null;
        Scanner sc = new Scanner(System.in);
        int tam; int tope=-1;
        String nombre; double precio;
        int opc = 1;
        do {
            
            System.out.println("\n      Simulación de una Pila");
            System.out.println("----------------------------------");
            System.out.println("      Accesorios para Auto");
            System.out.println("1.Cantidad de accesorios a almacenar ");
            System.out.println("2.Insertar");
            System.out.println("3.Sacar");
            System.out.println("4.Desplegar Pila Accesorios");
            System.out.println("5.Salir");
            System.out.println("----------------------------------");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Generando una nueva Pila....");
                    do {
                        System.out.print("Cantidad de Accesorios a almacener:" );
                        tam=sc.nextInt(); 
                        if (tam<1) {
                            System.out.println("***Ingresa una cantidad válida***");
                        }
                    } while (tam<1);
                    a=new Accesorio[tam];
                    tope=-1;
                    System.out.println("...Operación Exitosa...");
                    break;
                case 2:
                    if(a==null){
                       System.out.println("***Primero realiza la opción 1***");
                    }
                    else if (tope==a.length-1) {
                        System.out.println("***Pila Llena***");
                    }else {
                        sc.nextLine();
                        tope++;
                        do {
                            System.out.print("Nombre: ");
                            nombre=sc.nextLine();
                            nombre=nombre.trim();
                            if (nombre.equals("")) {
                                System.out.println("***Ingresa un nombre***");
                            }
                        } while (nombre.equals(""));
                        
                        do {
                            System.out.print("Precio: ");
                            precio=sc.nextDouble();
                            if (precio<0) {
                                System.out.println("***Precio no válido***");
                            }
                        } while (precio<0);
                        
                        a[tope]=new Accesorio();
                        a[tope].nombre=nombre;
                        a[tope].precio=precio;
                        
                        System.out.println("...Accesorio apilado...");
                    }
                    break;
                case 3:
                    if (a==null) {
                        System.out.println("***Primero realiza la opción 1***");
                    }else if(tope<0) {
                        System.out.println("***La Pila está vacía***");
                    }else{
                        a[tope]=null;
                        tope--;
                    }
                    break;
                case 4:
                    if (a==null) {
                        System.out.println("***Primero realiza la opción 1***");
                    }else if(tope<0) {
                        System.out.println("***La Pila está vacía***");
                    }else{
                    System.out.println("Desplegando Pila...\n");
                    for (int i = a.length-1; i > -1; i--) {
                        if (a[i]==null) {
                            System.out.println("-");
                        }else{
                            System.out.println(a[i].nombre +" $"+a[i].precio);
                        }
                    }
                    }
                    break;
                case 5:
                    break;
                default:  System.out.println("Opción no válida");               
            }
            
        } while (opc!=5);
    }
}
