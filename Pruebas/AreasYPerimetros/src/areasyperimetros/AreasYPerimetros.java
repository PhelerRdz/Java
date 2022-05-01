package areasyperimetros;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AreasYPerimetros {

    public static void main(String[] args) throws InterruptedException, IOException {
        int resp;boolean band=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoje 1 opcion de las siguientes 10:");
        System.out.println("1.- Cubo");
        System.out.println("2.- Prisma");
        System.out.println("3.- Paralelepípedo");
        System.out.println("4.-Ortoedro ");
        System.out.println("5.-Piramide");
        System.out.println("Tetraedro regular");
        System.out.println("Cilindro");
        System.out.println("Cono");
        System.out.println("Esfera");
        System.out.println("Bicono Cerradol");
        System.out.println("Seleccione 11 para salir ");
        System.out.print("Su opción es: ");
        int opc = sc.nextInt();
        do {
            switch (opc) {
                case 1:                    
                    System.out.println("Para calcular el Volúmen del Cuadrado es");
                    Suspender();
                    System.out.println("necesario hacer la siguiente formula");
                    Suspender();
                    System.out.println("lado*lado*lado*lado");
                    Suspender();
                    System.out.println("el lado...");
                    Suspender();
                    System.out.println("\nIntroduce el valor del lado:");
                    float lado = sc.nextFloat();
                    CalcularAreaCuadrado(lado);
                    System.out.print("Cual es tu respuesta: (Recuerde redondear al entero mas cercano)");
                    resp = sc.nextInt();
                    if (resp == MostrarAreaCuadrado(lado)) {
                        System.out.println("Correcto!! Te titulaste.");
                        band=true;
                    } else {
                        System.out.println("Burro, Intentalo de nuevo, " + MostrarAreaCuadrado(lado));
                    }
                    break;
                case 2:
                    System.out.println("Para calcular el Volúmen de Prisma es");
                    Suspender();
                    System.out.println("necesario hacer la siguiente formula");
                    Suspender();
                    System.out.println("Area*Altura para esto necesitamos");
                    Suspender();
                    System.out.println("saber el area y la altura...");
                    Suspender();
                    System.out.println("\nIntroduce el valor de la base:");
                    float base = sc.nextFloat();
                    System.out.println("\nIntroduce el valor de la altura:");
                    float altura = sc.nextFloat();
                    CalculaTriangulo(base, altura);
                    System.out.print("Cual es tu respuesta: (Recuerde redondear al entero mas cercano)");
                    resp = sc.nextInt();
                    if (resp == MostrarVolúmenPrisma(base, altura)) {
                        System.out.println("Correcto!! Te titulaste.");
                        band=true;
                    } else {
                        System.out.println("Burro, Intentalo de nuevo, " + MostrarVolúmenPrisma(base, altura));
                    }
                    break;
                case 3:
                    System.out.println("Para calcular el Volumen del Paralelepípedo es");
                    Suspender();
                    System.out.println("necesario hacer la siguiente formula");
                    Suspender();
                    System.out.println("Area*Altura para esto necesitamos  ");
                    Suspender();
                    System.out.println("necesitamos saber el area de las bases y la altura ");
                    Suspender();
                    System.out.println("\nIntroduce el Area ");
                    System.out.println("\nIntroduce la Altura ");
                    System.out.print("Cual es tu respuesta: (Recuerde redondear al entero mas cercano)");
                    resp = sc.nextInt();
                    if (resp== MostrarVolúmenParalelepípedo(Area,Altura)) {
                        System.out.println("Correcto!! Te titulaste.");
                        band=true;
                    } else {
                        System.out.println("Burro, Intentalo de nuevo, " + MostrarAreaHexagono(perimetro, apotema));
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el Programa..");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (band!=true);
    }
    
    public static int MostrarVolúmenCubo(float Area, float Altura) {
        return (int) (Area*Altura);
    }public static void CalcularVolúmenParalelepípedo(float Area2, float Altura2) {
        double volumen = Area2*Altura2; 
    public static int MostrarVolúmenPrisma(float Area, float Altura) {
        return (int) (Area*Altura); 
    }
    public static void CalcularVolúmenPrisma(float Area2, float Altura2) {
        double volumen = Area2*Altura2; 
    }
    public static void CalcularVolúmenParalelepípedo(float Area2, float Altura2) {
        double volumen = Area2*Altura2;   
    }
    public static void Suspender() throws IOException{
        long a=1100;
        try {
            Thread.sleep(a);
        } catch (InterruptedException ex) {
            Logger.getLogger(AreasYPerimetros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
  

    