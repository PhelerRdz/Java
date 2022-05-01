/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package p2_u1_burbujaclaseauto;

import java.util.Scanner;

public class P2_U1_BurbujaClaseAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 0,i;
        int opc = 1,opc2;
        Auto autos[] = null;
        Auto aux;
        String modelo = null,color = null,placas = null;
        do {
            switch (opc) {
                case 1:
                    do {
                        System.out.print("Cantidad de carros a ingresar: ");
                        tam=sc.nextInt();
                        if (tam<1) {
                            System.out.println("***Valor no admitido***");
                        }
                    } while (tam<1);
                    autos=new Auto[tam];
                    sc.nextLine();
                    for (i = 0; i < tam; i++) {
                        do {
                            System.out.print("Ingresa modelo auto "+(i+1)+": ");
                            modelo=sc.nextLine();
                            modelo=modelo.trim();
                            if (modelo.equals("")) {
                                System.out.println("***Ingresa un modelo***");
                            }
                        } while (modelo.equals(""));
                        
                        do {
                            System.out.print("Ingresa color auto: ");
                            color=sc.nextLine();
                            color=color.trim();
                            if (color.equals("")) {
                                System.out.println("***Ingresa un color***");
                            }
                        } while (color.equals(""));
                        
                        do {
                            System.out.print("Ingresa las placas: ");
                            placas=sc.nextLine();
                            placas=placas.trim();
                            if (placas.equals("")) {
                                System.out.println("***Ingresa las placas***");
                            }
                        } while (placas.equals(""));
                        
                        autos[i]=new Auto();
                        autos[i].modelo=modelo;
                        autos[i].color=color;
                        autos[i].placas=placas;
                        
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("----Por placa----");
                    System.out.println("Seleccione opción:"
                            + " \n 1.Ascendente \n 2.Descendente");
                    opc2=sc.nextInt();
                    
                    if (opc2==1 || opc2==2) {
                        for ( i = 0; i < tam-1; i++) {
                            for (int j = i+1; j < tam; j++) {
                                if (opc2==1) {
                                    if (autos[i].placas.compareTo(autos[j].placas)>0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                else{
                                    if (autos[i].placas.compareTo(autos[j].placas)<0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                
                            }
                        }
                        
                        System.out.println("Ordenado");
                        for (i = 0; i < tam; i++) {
                            System.out.println("Auto("+autos[i].modelo+","+
                            autos[i].color+") "+ "Placas: "+autos[i].placas);
                        }
                    }
                    else System.out.println("***No válido***");             
                    break;
                case 3:
                    System.out.println("----Por Color----");
                    System.out.println("Seleccione opción:"
                            + " \n 1.Ascendente \n 2.Descendente");
                    opc2=sc.nextInt();
                    
                    if (opc2==1 || opc2==2) {
                        for ( i = 0; i < tam-1; i++) {
                            for (int j = i+1; j < tam; j++) {
                                if (opc2==1) {
                                    if (autos[i].color.compareTo(autos[j].color)>0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                else{
                                    if (autos[i].color.compareTo(autos[j].color)<0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                
                            }
                        }
                        
                        System.out.println("Ordenado");
                        for (i = 0; i < tam; i++) {
                            System.out.println("Auto("+autos[i].modelo+","+
                            autos[i].color+") "+ "Placas: "+autos[i].placas);
                        }
                    }
                    else System.out.println("***No válido***");  
                    break;
                case 4:
                    System.out.println("----Por modelo----");
                    System.out.println("Seleccione opción:"
                            + " \n 1.Ascendente \n 2.Descendente");
                    opc2=sc.nextInt();
                    
                    if (opc2==1 || opc2==2) {
                        for ( i = 0; i < tam-1; i++) {
                            for (int j = i+1; j < tam; j++) {
                                if (opc2==1) {
                                    if (autos[i].modelo.compareTo(autos[j].modelo)>0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                else{
                                    if (autos[i].modelo.compareTo(autos[j].modelo)<0) {
                                    aux=autos[i];
                                    autos[i]=autos[j]; 
                                    autos[j]=aux;
                                    }
                                }
                                
                            }
                        }
                        
                        System.out.println("Ordenado");
                        for (i = 0; i < tam; i++) {
                            System.out.println("Auto("+autos[i].modelo+","+
                            autos[i].color+") "+ "Placas: "+autos[i].placas);
                        }
                    }
                    else System.out.println("***No válido***");  
                    break;
                case 5:
                    break;
                default:                
            }
            System.out.println("----------------------------------");
            System.out.println("         Menu de Opciones");
            System.out.println("1.Agregar nuevamente los autos");
            System.out.println("2.Ordenar por placa");
            System.out.println("3.Ordenar por color");
            System.out.println("4.Ordenar por modelo");
            System.out.println("5.Salir");
            System.out.println("----------------------------------");
            System.out.print("Opción: ");
            opc = sc.nextInt();
        } while (opc!=5);
    }
}
