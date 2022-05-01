/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package p2_u2_simulaciondeunacola;

import java.util.Scanner;

public class P2_U2_SimulacionDeUnaCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelota p[]=null;
        int tam; int tope=-1;
        String color;
        int cantidad;
        int opc = 1;
        do {
            
            System.out.println("\n   Simulación de una Cola");
            System.out.println("----------------------------------");
            System.out.println("  Registro de llegada de Pelotas");
            System.out.println("1.Cantidad de llegadas a almacenar ");
            System.out.println("2.Insertar");
            System.out.println("3.Sacar");
            System.out.println("4.Visualizar Cola Pelotas de colores");
            System.out.println("5.Salir");
            System.out.println("----------------------------------");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Generando una nueva Cola....");
                    do {
                        System.out.print("Cantidad de llegadas a almacener:" );
                        tam=sc.nextInt(); 
                        if (tam<1) {
                            System.out.println("***Ingresa una cantidad válida***");
                        }
                    } while (tam<1);
                    p=new Pelota[tam];
                    tope=-1;
                    System.out.println("...Operación Exitosa...");
                    break;
                case 2:
                    if(p==null){
                       System.out.println("***Primero realiza la opción 1***");
                    }
                    else if (tope==p.length-1) {
                        System.out.println("***Cola Llena***");
                    }else {
                        sc.nextLine();
                        tope++;
                        do {
                            System.out.print("Color: ");
                            color=sc.nextLine();
                            color=color.trim();
                            if (color.equals("")) {
                                System.out.println("***Ingresa un Color***");
                            }
                        } while (color.equals(""));
                        
                        do {
                            System.out.print("Cantidad: ");
                            cantidad=sc.nextInt();
                            if (cantidad<0) {
                                System.out.println("***Dato no válido***");
                            }
                        } while (cantidad<0);
                        
                        p[tope]=new Pelota();
                        p[tope].color=color;
                        p[tope].cantidad=cantidad;
                        
                        System.out.println("...Pelotas agregadas...");
                    }
                    break;
                case 3:
                    if (p==null) {
                        System.out.println("***Primero realiza la opción 1***");
                    }else if(tope<0) {
                        System.out.println("***La Cola está vacía***");
                    }else{
                        for (int i = 0; i <tope; i++) {
                            p[i]=p[i+1];
                        }
                        p[tope]=null;
                        tope--;
                    }
                    break;
                case 4:
                    if (p==null) {
                        System.out.println("***Primero realiza la opción 1***");
                    }else if(tope<0) {
                        System.out.println("***La Cola está vacía***");
                    }else{
                    System.out.println("Desplegando Cola...\n");
                    System.out.println("FIFO --->");
                    for (int i =p.length-1; i>-1; i--) {
                        if (p[i]==null) {
                            System.out.print("[] ");
                        }else{
                            System.out.print("("+p[i].cantidad+" "+p[i].color+") ");
                        }
                    }
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default: System.out.println("Opción no válida");                
            }
            
        } while (opc!=5);
    }
}
