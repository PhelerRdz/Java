package ed_practica_03_u2;

import java.util.*;

/**
 *
 * @author angel
 */
public class ED_practica_03_U2 {

    public static class Aviones {

        String compañia;
        int prioridad = 0;
    }

    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        System.out.println("Introduce la cantidad de aviones a atender:");
        int tam = uwu.nextInt();
         Aviones Aeropuerto[] = new Aviones [tam];
        
         int op = 0;
         uwu.nextLine();
        PriorityQueue pq = new PriorityQueue();
        // Si esta vacio
        //pq.isEmpty();
        // Agregar dato 
        //pq.add(pq);
        // Remover dato        
        //pq.poll();
        
        for (int i = 0; i < Aeropuerto.length; i++) {
            Aeropuerto[i] = new Aviones();
        }
int cont = 0;
        do {
            
            System.out.println("");
            System.out.println("1. Insertar ");
            System.out.println("2. Atender");
            System.out.println("3. Visualizar");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Introduce la accion a realizar:");
            op = uwu.nextInt();
            
            switch(op){
                case 1:
                    
                    System.out.println("Inserte la prioridad del avion "+(cont +1));
                   Aeropuerto[cont].prioridad = uwu.nextInt();
                   pq.add(Aeropuerto[cont].prioridad);
                   
                   cont++;
                   break;
                case 2:
                    pq.poll();
                    break;
                case 3:
                    System.out.println(pq);
                    break;
                default:
                    System.out.println("Hasta la proxima");
            }
            

        } while ((op >0)&(op<4));

    }

}
