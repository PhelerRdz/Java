import java.util.Scanner;

public class Alg070_Supermercado {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double com;
		double desc;
		double num;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|              Mi Septuagésimo Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa tu compra:");
		com = sc.nextDouble();
		System.out.println("Toma un número");
		num = sc.nextDouble();
		if (num>=74) {
			desc = com*.2;
		} else {
			desc = com*.15;
		}
		System.out.println("Tu descuento es de: "+desc);
	}
}
