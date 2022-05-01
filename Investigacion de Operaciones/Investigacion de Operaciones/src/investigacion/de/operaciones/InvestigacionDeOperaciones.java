package investigacion.de.operaciones;

import java.util.Scanner;

public class InvestigacionDeOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ganancias [] = new int[3];
        int Invertir [] = new int[3];
        int resultadobenef,resultadoinv,mejor=0,mejora=0,mejorb=0,mejorc=0,band=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el valor de la "+(i+1)+"° Inversion: ");
            Invertir[i]=sc.nextInt();
            System.out.println("Ingresa la Ganancia de la "+(i+1)+"° Inversion: ");
            Ganancias[i]=sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    resultadobenef=(Ganancias[0]*i)+(Ganancias[1]*j)+(Ganancias[2]*k);
                    resultadoinv=(Invertir[0]*i)+(Invertir[1]*j)+(Invertir[2]*k);
                    if ((resultadobenef>mejor)&&(resultadoinv<100000)) {
                        mejor=resultadobenef;
                        mejora=i;
                        mejorb=j;
                        mejorc=k;
                    }
                    
                    if (i==1&&j==1&&k==1) {
                        System.out.print("La mejor opcion es Invertir en ");
                        if (mejora==1) {
                            System.out.print("\"A\" ");
                            band++;
                        }
                        if (band==1) {
                            System.out.print("Y ");
                        }
                        if (mejorb==1) {
                            System.out.print("\"B\" ");
                            band++;
                        }
                        if (band==1) {
                            System.out.print("Y ");
                        }
                        if (mejorc==1) {
                            System.out.print("\"C\"");
                        }
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("La Ganancia obtenida por invertir en los Proyectos es de: "+mejor);
    }
}
