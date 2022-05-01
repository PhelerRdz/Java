/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package p1_u3_lista_dinámica_simple;

import java.util.Scanner;

public class P1_U3_Lista_Dinámica_Simple {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int clave;
        int cantidad;
        double precio;
        String descripcion;
        
        boolean condicion;
        Ventas actual,siguiente,aux=new Ventas(); 
        int filtro;
        Ventas temp=null;
        Ventas nueva=null;
        Ventas primerVenta=null;
        
        int opc = 1;
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("                    Menu de Opciones");
            System.out.println(" 1.Insertar Nueva Venta (Al principio de la lista)");
            System.out.println(" 2.Eliminar (Ultimo elemento de la lista)");
            System.out.println(" 3.Ordenar Ascendente(Método Burbuja)");
            System.out.println(" 4.Ordenar Descendente(Método Burbuja)");
            System.out.println(" 5.Visualizar");
            System.out.println(" 6.Salir");
            System.out.println("---------------------------------------------------------");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                        sc.nextLine();
                        temp=primerVenta;
                        nueva=new Ventas();
                        
                        do {
                            System.out.print("Clave(int): "); 
                            clave=sc.nextInt();
                            if (clave<1) {
                                System.out.println("****Ingresa una clave****");
                            }
                        } while (clave<1);
                        sc.nextLine();
                        do {
                            System.out.print("Descripción: "); 
                            descripcion=sc.nextLine().trim();
                            if (descripcion.equals("")) {
                                System.out.println("****Ingresa una descripción****");
                            }
                        } while (descripcion.equals(""));
                    
                        do {
                            System.out.print("Cantidad: "); 
                            cantidad=sc.nextInt();
                            if (cantidad <1) {
                                System.out.println("****Ingresa una cantidad válida****");
                            }
                        } while (cantidad<1);
                        
                        do {
                            System.out.print("Precio: "); 
                            precio=sc.nextDouble();
                            if (precio <= 0) {
                                System.out.println("****Ingresa una cantidad válida****");
                            }
                        } while (precio <= 0);
                        
                        //despues de pedir los datos
                        nueva.clave=clave;
                        nueva.descripcion=descripcion;
                        nueva.cantidad=cantidad;
                        nueva.precio=precio;
                        
                        nueva.siguiente=temp;
                        primerVenta=nueva;
                        
                    break;
                case 2:
                    //para eliminar
                    if (primerVenta==null) {
                        System.out.println("Lista Vacía");
                    }
                    else{
                        temp=primerVenta;
                        while (temp!=null) {
                            if (temp.siguiente!=null) {
                                if (temp.siguiente.siguiente==null) {
                                    temp.siguiente=null;
                                }             
                            }else primerVenta=null;
                            temp=temp.siguiente;
                        }
                        System.out.println("***Elemento eliminado***");
                    }
                    break;
                case 3:
                    if (primerVenta!=null) {
                    System.out.println("Ordenamiento Ascendente");
                    System.out.println("Ordenar por: ");
                    System.out.println("1.Clave\n2.Cantidad\n3.Precio");
                    
                    do {
                        System.out.print("Opc: ");
                        filtro=sc.nextInt();
                        if (filtro<1 || filtro>3) {   
                            System.out.println("***Valor no admitido***");
                        }
                    } while (filtro<1 || filtro>3);
                    
                    actual = primerVenta;
                    while (actual.siguiente!=null) {
                        siguiente=actual.siguiente;
                        while (siguiente!=null) {
                            
                            condicion=false;
                            if (filtro==1) {
                                if (actual.clave > siguiente.clave) 
                                condicion=true;
                            } else if (filtro==2) {
                                if (actual.cantidad>siguiente.cantidad) 
                                condicion=true;
                            } else {
                                if (actual.precio>siguiente.precio) 
                                condicion=true;
                            }
                                                  
                            if (condicion) {
                                
                                aux.clave=siguiente.clave;
                                siguiente.clave=actual.clave;
                                actual.clave=aux.clave;
                                
                                aux.descripcion=siguiente.descripcion;
                                siguiente.descripcion=actual.descripcion;
                                actual.descripcion=aux.descripcion;
                                
                                aux.cantidad=siguiente.cantidad;
                                siguiente.cantidad=actual.cantidad;
                                actual.cantidad=aux.cantidad;
                                
                                aux.precio=siguiente.precio;
                                siguiente.precio=actual.precio;
                                actual.precio=aux.precio;
                            }
                            siguiente = siguiente.siguiente;
                        }
                        actual=actual.siguiente;
                    }} else System.out.println("***Lista Vacía***");
                            
                    break;
                case 4:
                    if (primerVenta!=null) {
                    System.out.println("Ordenamiento Descendente");
                    System.out.println("Ordenar por: ");
                    System.out.println("1.Clave\n2.Cantidad\n3.Precio");
                    
                    do {
                        System.out.print("Opc: ");
                        filtro=sc.nextInt();
                        if (filtro<1 || filtro>3) {   
                            System.out.println("***Valor no admitido***");
                        }
                    } while (filtro<1 || filtro>3);
                    
                    
                    
                    actual = primerVenta;
                    while (actual.siguiente!=null) {
                        siguiente=actual.siguiente;
                        while (siguiente!=null) {
                            
                            condicion=false;
                            if (filtro==1) {
                                if (actual.clave < siguiente.clave) 
                                condicion=true;
                            } else if (filtro==2) {
                                if (actual.cantidad < siguiente.cantidad) 
                                condicion=true;
                            } else {
                                if (actual.precio < siguiente.precio) 
                                condicion=true;
                            }
                                                  
                            if (condicion) {
                                
                                aux.clave=siguiente.clave;
                                siguiente.clave=actual.clave;
                                actual.clave=aux.clave;
                                
                                aux.descripcion=siguiente.descripcion;
                                siguiente.descripcion=actual.descripcion;
                                actual.descripcion=aux.descripcion;
                                
                                aux.cantidad=siguiente.cantidad;
                                siguiente.cantidad=actual.cantidad;
                                actual.cantidad=aux.cantidad;
                                
                                aux.precio=siguiente.precio;
                                siguiente.precio=actual.precio;
                                actual.precio=aux.precio;
                            }
                            siguiente = siguiente.siguiente;
                        }
                        actual=actual.siguiente;
                    }}else System.out.println("***Lista Vacía***");
                    break;
                case 5:
                    //listar
                    temp=primerVenta;
                    if (temp!=null) {
                        System.out.printf("\n%-12s %-17s %-12s %-7s","Clave","Descripción","Precio","Cantidad");
                        while (temp!=null) {
                        System.out.printf("\n%-12s %-17s %-12s %-7s",temp.clave,temp.descripcion,"$"+temp.precio,temp.cantidad);
                            temp=temp.siguiente;
                        }
                    } else  System.out.print("***Lista Vacía***");
                    
                    System.out.println("");
                    break;
                    
                case 6: break;
                default:   
                    System.out.println("***Opción no válida**");
            }
            
        } while (opc!=6);
    }
}
