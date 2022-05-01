import java.util.Scanner;

public class Alg147_Dinero {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double can;
		double g;
		c = 1;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Septimo Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Digite Cantidad de dinero");
		can = sc.nextDouble();
		while (c<=12) {
			g = (can*2)/100;
			can = can+g;
			System.out.println("ganacia mensual "+can);
			c = c+1;
		}
		System.out.println("Saldo a un año es: "+can);
	}
}
