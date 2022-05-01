import java.util.Scanner;

public class Alg025_VolumenCono {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double area;
		double diametro;
		double radio;
		double volumen;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Vigésimo Quinto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el diámetro");
		diametro = sc.nextDouble();
		radio = diametro/2;
		area = 3.1416*(radio*radio);
		System.out.println("Ingresa la altura");
		altura = sc.nextDouble();
		volumen = (area*altura)/3;
		System.out.println("El volumen del cono es: "+volumen);
	}
}
