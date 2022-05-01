import java.util.Scanner;

public class Alg068_CompraRefacciones {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cantinv;
		double costopza;
		double credito;
		double inte;
		double numpza;
		double prestamo;
		double totcomp;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Sexagésimo Octavo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el costo de la pieza");
		costopza = sc.nextDouble();
		System.out.println("Ingresa el numero de piezas");
		numpza = sc.nextDouble();
		totcomp = costopza*numpza;
		if (totcomp>500000) {
			cantinv = totcomp*.55;
			prestamo = totcomp*.3;
			credito = totcomp*.15;
		} else {
			cantinv = totcomp*.7;
			credito = totcomp*.3;
			prestamo = 0;
		}
		inte = credito*.2;
		System.out.println("Cantidad invertida: "+cantinv+", préstamo: "+prestamo+", crédito: "+credito+", interés: "+inte);
	}
}
