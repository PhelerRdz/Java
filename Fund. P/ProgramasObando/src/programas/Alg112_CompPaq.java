import java.util.Scanner;

public class Alg112_CompPaq {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double dinero_recibido;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|         Mi Centésimo Décimo Segundo Algoritmo       |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de dinero recibido:");
		dinero_recibido = sc.nextDouble();
		if (dinero_recibido>=50000) {
			System.out.println("Paquete A");
		}
		if (dinero_recibido>=20000 && dinero_recibido<50000) {
			System.out.println("Paquete B");
		}
		if (dinero_recibido>=10000 && dinero_recibido<20000) {
			System.out.println("Paquete C");
		}
		if (dinero_recibido<10000) {
			System.out.println("Paquete D");
		}
	}
}
