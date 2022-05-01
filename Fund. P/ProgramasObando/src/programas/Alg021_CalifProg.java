import java.util.Scanner;

public class Alg021_CalifProg {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double as;
                double pa;
                double ex;
                double in;
                double pr;
                double pas;
                double ppa;
                double pex;
                double pin;
                double ppr;
                double pgra;
                double cf;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Vigésimo Primero Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Numero de asistencias del alumno");
                as = sc.nextDouble();
                System.out.println("Numero de participaciones del alumno");
                pa = sc.nextDouble();
                System.out.println("Calificacion del examen");
                ex = sc.nextDouble();
                System.out.println("Calificacion de la investigacion");
                in = sc.nextDouble();
                System.out.println("Calificacion del proyecto");
                pr = sc.nextDouble();
                pas = (as*0.10);
                ppa = (pa*0.10);
                pex = (ex*0.30);
                pin = (in*0.10);
                ppr = (pr*0.40);
                pgra = (pas+ppa+pex+pin+ppr);
                cf = (pgra*1.0);
                System.out.println("Calificacion final de la materia Fundamentos de programacion es:" + cf);
	}
}
