import java.util.Scanner;

public class Alg101_CostDesc {
    	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double costo;
		double descuento;
		double precio;
		descuento = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Centésimo Primero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de precio:");
		precio = sc.nextDouble();
		if (precio>=200) {
			descuento = precio*0.15;
		}
		if (precio>100 && precio<200) {
			descuento = precio*0.12;
		}
		if (precio<100) {
			descuento = precio*0.1;
		}
		costo = precio-descuento;
		System.out.println("Valor de costo: "+costo);
		System.out.println("Valor de descuento: "+descuento);
	}
}
