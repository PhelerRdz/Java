package areaesfera;

import java.util.Scanner;

public class AreaEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radio, altura, ancho, base;
        double volumen;
        System.out.println("Seleccione una de las 4 opciones:");
        System.out.println("1.- Esfera");
        System.out.println("2.- Cono");
        System.out.println("3.- Prisma Rectangular");
        System.out.println("4.- Salir");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Introduzca el Radio de la Esfera...");
                radio = sc.nextInt();
                volumen = CalcularVolumenEsfera(radio);
                MostrarVolumen(volumen,op);
                break;
            case 2:
                System.out.println("Introduzca la Atura del Cono...");
                altura = sc.nextInt();
                System.out.println("Introduzca el Radio del cono...");
                radio = sc.nextInt();
                volumen=CalcularVolumenCono(radio,altura);
                MostrarVolumen(volumen,op);
                break;
            case 3:
                System.out.println("Introduzca la Atura del Prisma Rectangular...");
                altura = sc.nextInt();
                System.out.println("Introduzca la Base del Prisma Rectangular...");
                base = sc.nextInt();
                System.out.println("Introduzca el Ancho del Prisma Rectangular...");
                ancho = sc.nextInt();
                volumen=CalcularVolumenPrisma(base,altura,ancho);
                MostrarVolumen(volumen,op);
                break;
            case 4:
                System.out.println("Gracias por usar el Programa!!!");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static double CalcularVolumenEsfera(int radio){
        return ((4*Math.PI*Math.pow(radio, 3))/3);
    }
    
    public static void MostrarVolumen(double volumen,int caso){
        String figura;
        switch (caso) {
            case 1:
                figura = " de la Esfera ";
                break;
            case 2:
                figura = " del Cono ";
                break;
            default:
                figura = " del Prisma Rectangular ";
                break;
        }
        System.out.println("El Volumen"+figura+"es:"+volumen);
    }
    
    public static double CalcularVolumenCono(int radio,int altura){
        return ((altura*Math.PI*Math.pow(radio, 2))/3);
    }
    
    public static double CalcularVolumenPrisma(int base,int altura, int ancho){
        return (altura*base*ancho);
    }
}
