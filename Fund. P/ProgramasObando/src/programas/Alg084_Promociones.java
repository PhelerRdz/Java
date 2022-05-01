import java.util.Scanner;

public class Alg084_Promociones {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double bo;
		double d;
		double tc;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Octogésimo Cuarto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca el total de compra: ");
		tc = sc.nextDouble();
		System.out.println("Introduzca el color de la bola: ");
                System.out.println("1 = Blanca ");
                System.out.println("2 = Verde ");
                System.out.println("3 = Amarilla ");
                System.out.println("4 = Azul ");
                System.out.println("5 = Otra ");
		bo = sc.nextDouble();
		if (bo==1) {
			d = 120;
		} else {
			if (bo==2) {
				d = tc*0.10;
			} else {
				if (bo==3) {
					d = tc*0.25;
				} else {
					if (bo==4) {
						d = tc*0.50;
					} else {
						d = tc;
					}
				}
			}
		}
		System.out.println("El total de compra es de: "+(tc-d));
	}
}
