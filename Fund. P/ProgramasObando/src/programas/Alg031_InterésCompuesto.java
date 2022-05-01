import java.util.Scanner;

public class Alg031_InterésCompuesto {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cn;
		double co;
		double i;
		double n;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Trigésimo Primero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el capital inicial");
		co = sc.nextDouble();
		System.out.println("Ingresa la tasa de interés");
		i = sc.nextDouble();
		System.out.println("Ingresa la cantidad de años");
		n = sc.nextDouble();
		cn = co*Math.pow((1+i),n);
		System.out.println("Tu capital final es: "+cn);
	}
}
