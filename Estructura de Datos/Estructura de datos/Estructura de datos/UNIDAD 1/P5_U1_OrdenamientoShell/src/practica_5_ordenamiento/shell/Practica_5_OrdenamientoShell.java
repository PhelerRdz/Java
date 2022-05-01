/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package practica_5_ordenamiento.shell;

import java.util.Scanner;

public class Practica_5_OrdenamientoShell {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cliente cl[] = null;
int tam,i,tipo,orden; tipo=1; String aux;
        String nombre; 
        long telefono;
        int saldo;
        int opc=1;
        do{
            switch(opc){
                case 1: 
                  do{
                  System.out.print("\nCantidad de clientes: ");tam=sc.nextInt();
                    if (tam<2) {
                    System.out.println("----------------------");
                    System.out.println(" Dato no válido!!!!!! ");
                    System.out.println("----------------------");
                    }
                  }while(tam<2); 
                  cl = new Cliente[tam];
                    for (i = 0; i < tam; i++) {
                        sc.nextLine();
                        
                        do{
                        System.out.print("\nNombre: "); nombre=sc.nextLine();
                        nombre=nombre.replaceAll("^\\s*","");
                        if (nombre.isEmpty() ) {
                            System.out.println("--------------------------");
                            System.out.println("   Ingresa un nombre!!!!  ");
                            System.out.println("--------------------------");
                        }
                        }while(nombre.isEmpty());
                        
                        do {                            
                            System.out.print("Telefono: "); aux=sc.nextLine();
                            aux=aux.replaceAll("^\\s*","");
                            telefono=0;
                            if (aux.isEmpty()) {
                                System.out.println("--------------------------");
                                System.out.println("   Ingresa un numero!!!!  ");
                                System.out.println("--------------------------");
                            } else{
                                telefono=Integer.valueOf(aux);
                                if (telefono<=0) {
                                System.out.println("No Valido");
                            }
                            }
                            
                        } while (telefono<=0 || aux.isEmpty());
                        
                        saldo=0;
                        do {   
                           System.out.print("Saldo: "); 
                           saldo=sc.nextInt();
                            if (saldo<=0) {
                                System.out.println("--------------------------");
                                System.out.println("   Ingresa un numero valido!!!!  ");
                                System.out.println("--------------------------");
                            }
                        } while (saldo<=0);
                        
                        cl[i]=new Cliente();
                        cl[i].nombre=nombre;
                        cl[i].telefono=telefono;
                        cl[i].saldo=saldo;
                    }
                    break; 
                case 2: 
                    System.out.println("\nTipo de ordenamiento");
                    System.out.println("1.Ordenamiento Shell visto en clase");
                    System.out.println("2.Ordenamiento Shell investigado de Tarea");
                    System.out.print("Opcion: ");tipo=sc.nextInt();
                    switch(tipo){
                        case 1: break;
                        case 2: break;
                        default: 
                            tipo=1;
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 3:
                    System.out.println("\n1.Orden ascendente.");
                    System.out.println("2.Orden descendente");
                    System.out.print("Opcion: "); orden=sc.nextInt();
                    
                    Operaciones.shellSort(cl,tipo,orden,opc);
                    Operaciones.imprimirArreglo(cl);
                    break;
                case 4:
                    System.out.println("\n1.Orden ascendente.");
                    System.out.println("2.Orden descendente");
                    System.out.print("Opcion: "); orden=sc.nextInt();
                    
                    Operaciones.shellSort(cl,tipo,orden,opc);
                    Operaciones.imprimirArreglo(cl);
                    break;
                case 5: 
                    System.out.println("\n1.Orden ascendente.");
                    System.out.println("2.Orden descendente");
                    System.out.print("Opcion: "); orden=sc.nextInt();
                    
                    Operaciones.shellSort(cl,tipo,orden,opc);
                    Operaciones.imprimirArreglo(cl);
                    break;
            }
            
            System.out.println("\nMenu de opciones.");
            System.out.println("1.Ingresar nuevamente los clientes.");
            if (tipo==1) {
                System.out.println("2.Cambiar tipo ordenamiento "
                        + "(Actual: Shell Visto en clase)");
            } else if(tipo ==2){
                System.out.println("2.Cambiar tipo ordenamiento "
                        + "(Actual: Shell investigado de Tarea)");
            }
            System.out.println("3.Ordenar por Nombre.");
            System.out.println("4.Ordenar por Saldo.");
            System.out.println("5.Ordenar por numero de telefono");
            System.out.println("6.Salir");
            System.out.print("Opcion:"); opc=sc.nextInt();
            
        
     }while(opc!=6);  
  }
}
