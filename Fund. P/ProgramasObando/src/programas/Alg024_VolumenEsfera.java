import java.util.Scanner;

public class Alg024_VolumenEsfera {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double area;
		double diametro;
		double radio;
		double volumen;
		area = 0.0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Vigésimo Cuarto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el diámetro");
		diametro = sc.nextDouble();
		radio = diametro/2;
		volumen = 4/3*3.1416*(radio*radio*radio);
		System.out.println("El volumen de la esfera es: "+volumen);
	}
}
