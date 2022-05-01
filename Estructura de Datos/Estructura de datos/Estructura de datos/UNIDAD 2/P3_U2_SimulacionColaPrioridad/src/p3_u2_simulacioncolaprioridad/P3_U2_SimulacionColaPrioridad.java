/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package p3_u2_simulacioncolaprioridad;

import java.util.Scanner;

public class P3_U2_SimulacionColaPrioridad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avion a[]=null;
        int tam; int tope=-1; int i=0;
        String codigoVuelo;
        String company;
        int opc = 1;
        do {
            
            System.out.println("\nSimulación de una Cola por Prioridad");
            System.out.println("----------------------------------");
            System.out.println("  Registro de llegada de Aviones");
            System.out.println("1.Cantidad de llegadas a almacenar ");
            System.out.println("2.Insertar");
            System.out.println("3.Atender");
            System.out.println("4.Visualizar aviones");
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
                    a=new Avion[tam];
                    tope=-1;
                    System.out.println("...Operación Exitosa...");
                    break;
                case 2:
                    if(a==null){
                       System.out.println("***Primero realiza la opción 1***");
                    }
                    else if (tope==a.length-1) {
                        System.out.println("***Cola Llena***");
                    }else {
                        sc.nextLine();
                        tope++;
                        do {
                            System.out.print("Codigo del Avion/Vuelo: ");
                            codigoVuelo=sc.nextLine();
                            codigoVuelo=codigoVuelo.trim();
                            if (codigoVuelo.equals("")) {
                                System.out.println("***Ingresa Datos***");
                            }
                        } while (codigoVuelo.equals(""));
                        
                        do {
                            System.out.print("Compañía: ");
                            company=sc.nextLine();
                            company=company.trim();
                            if (company.equals("")) {
                                System.out.println("***Ingresa Datos***");
                            }
                        } while (company.equals(""));
                        
                        a[tope]=new Avion();
                        a[tope].codigoVuelo=codigoVuelo;
                        a[tope].company=company;
                        
                        System.out.println("...Llegada de Avion agregada...");
                    }
                    break;
                case 3:
                    if (a==null) {
                        System.out.println("***Primero realiza la opción 1***");
                        break;
                    }else if(tope<0) {
                        System.out.println("***La Cola está vacía***");
                        break;
                    }else{
                        int subOpc;
                        System.out.println("\nAtender al vuelo...");
                        System.out.println("  1.Con código Avion/vuelo XXXX");
                        System.out.println("  2.Con compañía XXXX");
                        System.out.println("  3.Siguiente en la fila");
                        System.out.print("Opción: "); subOpc=sc.nextInt();
                        sc.nextLine();
                        String busqueda; boolean encontrado=false;
                        if (subOpc==1) {
                            System.out.print("Código: "); busqueda=sc.nextLine();
                            for (i = 0; i <=tope; i++) {
                                if (a[i].codigoVuelo.equalsIgnoreCase(busqueda)) {
                                    System.out.print("\nSe atendió al avión: ");
                                    System.out.print("("+a[i].codigoVuelo+" "+a[i].company+") \n");
                                    for (int j = i; j <tope; j++) {
                                        a[j]=a[j+1];
                                    }
                                    encontrado=true;
                                    a[tope]=null;
                                    tope--;
                                    
                                    break;
                                }
                            }
                            
                        }else if (subOpc==2) {
                            System.out.print("Compañía: "); busqueda=sc.nextLine();
                            for (i = 0; i <=tope; i++) {
                                if (a[i].company.equalsIgnoreCase(busqueda)) {
                                    System.out.print("\nSe atendió al avión: ");
                                    System.out.print("("+a[i].codigoVuelo+" "+a[i].company+") \n");
                                    for (int j = i; j <tope; j++) {
                                        a[j]=a[j+1];
                                    }
                                    encontrado=true;
                                    a[tope]=null;
                                    tope--;
                                    
                                    break;
                                }
                            }
                        }else if (subOpc==3) {
                            for (i = 0; i <tope; i++) {
                            a[i]=a[i+1];
                            }
                            a[tope]=null;
                            tope--;
                            encontrado=true;
                        }
                        else{
                            System.out.println("***Opción no válida***");
                            break;
                        }
                        
                        
                        if (encontrado==false) {
                            System.out.println("***No se encontró***");
                        }
                    }
                   
                    break;
                case 4:
                    if (a==null) {
                        System.out.println("***Primero realiza la opción 1***");
                    }else if(tope<0) {
                        System.out.println("***La Cola está vacía***");
                    }else{
                    System.out.println("Desplegando Cola...\n");
                    System.out.println("--->");
                    for (i =a.length-1; i>-1; i--) {
                        if (a[i]==null) {
                            System.out.print("[] ");
                        }else{
                            System.out.print("("+a[i].codigoVuelo+" "+a[i].company+") ");
                        }
                    }
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:  System.out.println("Opción no válida");              
            }
            
        } while (opc!=5);
    }
}
