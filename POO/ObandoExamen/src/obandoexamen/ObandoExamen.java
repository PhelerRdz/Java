package obandoexamen;

import java.util.Scanner;

public class ObandoExamen {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean primeracompra=false;
        int op,opcondigo,opcant,cant1=0,cant2=0,cant3=0,cant4=0,total=0;
        int[] codigo = {1,2,3,4};
        String[] producto = {"Bebida1","Bebida2","Bebida3","Bebida4"};
        int[] precio = {20,19,24,18};
        int[] cantidad = {500,500,500,500};
        do {
            System.out.print("Introduzca el numeroa la accion a realizar\n(1) Venta del Porducto.\n"
                + "(2)Mostrar Reporte De La Venta Actual.\n(3) Mostrar Reporte Del Almacen Actual\n"
                + "(4) Salir.\nFavor de Ingresar una opcion de las anteriormente nombradas: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nAccion No. (1) Seleccionada\n");
                    
                    System.out.print("Introducir Codigo del Producto: ");
                    opcondigo=sc.nextInt();
                    if (opcondigo<=4&&opcondigo>0) {
                        if (cantidad[opcondigo-1]>0) {
                            System.out.println("\nCodigo\tProducto\tPrecio\tCantidad");
                            System.out.println(codigo[opcondigo-1]+"\t"+producto[opcondigo-1]+"\t\t"+precio[opcondigo-1]+"\t"+cantidad[opcondigo-1]);
                            System.out.print("\nCuantos elementos del Producto \""+producto[opcondigo-1]+"\" desea Vender: ");
                            do {
                                opcant = sc.nextInt();
                                if (opcant<=0||opcant>cantidad[opcondigo-1]) {
                                    System.out.println("No puede hacer la accion\nCuantos elementos del Producto \""+producto[opcondigo-1]+"\" desea Vender: ");
                                }
                            } while (opcant<=0||opcant>cantidad[opcondigo-1]);
                            primeracompra=true;
                            for (int i = 0; i < opcant; i++) {
                                cantidad[opcondigo-1]--;
                            }
                            switch ((opcondigo)) {
                                case 1:
                                    cant1+=opcant;
                                    break;
                                case 2:
                                    cant2+=opcant;
                                    break;
                                case 3:
                                    cant3+=opcant;
                                    break;
                                case 4:
                                    cant4+=opcant;
                                    break;
                            }
                            System.out.println("Venta Realizada");
                        } else {
                            System.out.println("No existen elementos del Producto \""+producto[opcondigo-1]+"\".");
                        }
                    }else{
                        System.out.println("Codigo no Existente en la Base De Datos");
                    }
                    
                    System.out.println("\nAccion No. (1) Realizada\n");
                    break;
                case 2:
                    System.out.println("\nAccion No. (2) Seleccionada\n");
                    if (primeracompra) {
                        System.out.println("Se han realizado las siguientes Ventas:\n");
                        System.out.println("Codigo\tProducto\tPrecio del Producto\tProducto Vendido\tTotal");
                        if (cant1>0) {
                            System.out.println(codigo[0]+"\t"+producto[0]+"\t\t"+precio[0]+"\t\t\t"+cant1+"\t\t\t"+(cant1*precio[0]));
                        }
                        if (cant2>0) {
                            System.out.println(codigo[1]+"\t"+producto[1]+"\t\t"+precio[1]+"\t\t\t"+cant2+"\t\t\t"+(cant2*precio[1]));
                        }
                        if (cant3>0) {
                            System.out.println(codigo[2]+"\t"+producto[2]+"\t\t"+precio[2]+"\t\t\t"+cant3+"\t\t\t"+(cant3*precio[2]));
                        }
                        if (cant4>0) {
                            System.out.println(codigo[3]+"\t"+producto[3]+"\t\t"+precio[3]+"\t\t\t"+cant4+"\t\t\t"+(cant4*precio[3]));
                        }
                        total=((cant1*precio[0])+(cant2*precio[1])+(cant3*precio[2])+(cant4*precio[3]));
                        System.out.println("\t\t\t\t\t\t\t\t\tCantidad Total\n\t\t\t\t\t\t\t\t\t"+total);
                    }else{
                        System.out.println("No se ha vendido ningun producto hasta ahora. Favor de Realizar una venta.");
                    }
                    System.out.println("\nAccion No. (2) Realizada\n");
                    break;
                case 3:
                    System.out.println("\nAccion No. (3) Seleccionada\n");
                    System.out.println("Codigo\tProducto\tPrecio\tCantidad");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(codigo[i]+"\t"+producto[i]+"\t\t"+precio[i]+"\t"+cantidad[i]);
                    }
                    System.out.println("\nAccion No. (3) Realizada\n");
                    break;
                case 4:
                    System.out.println("Saliendo...\n");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("\nOpcion Introducida no existente. Intenta de nuevo.\n");
            }
        } while (op!=4);
        System.out.println("Gracias por usar el Programa....");
    }
}

