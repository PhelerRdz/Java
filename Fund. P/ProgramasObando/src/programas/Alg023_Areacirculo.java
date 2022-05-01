import java.util.Scanner;

public class Alg023_Areacirculo {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double area;
		double diametro;
		double radio;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Vigésimo Tercero Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el diámetro");
		diametro = sc.nextDouble();
		radio = diametro/2;
		area = 3.1416*(radio*radio);
		System.out.println("El área del circulo es: "+area);
	}
}
