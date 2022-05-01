import java.util.Scanner;

public class Alg067_VentaCamisas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double numcam;
		double prec;
		double totcomp;
		double totpag;
		totpag = 0.0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Sexagésimo Séptimo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la cantidad de camisas compradas");
		numcam = sc.nextDouble();
		System.out.println("Ingresa el total de compra");
		prec = sc.nextDouble();
		totcomp = numcam*prec;
		if (numcam>=3) {
			totpag = totcomp-totcomp*.2;
		} else {
			totpag = totpag-totpag*.1;
		}
		System.out.println("El total a pagar es de: "+totpag);
	}
}
