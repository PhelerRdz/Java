import java.util.Scanner;

public class Alg014_NumPulsaciones {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double edad;
		double numero_pulsaciones;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Cuarto Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca Su Edad: ");
		edad = sc.nextDouble();
		numero_pulsaciones = (220-edad)/10;
		System.out.println("Las Pulsaciones cada 10 seg. al Hacer Ejercicio: "+numero_pulsaciones);
	}
}
