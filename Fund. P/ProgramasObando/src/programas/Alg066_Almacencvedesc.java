import java.util.Scanner;

public class Alg066_Almacencvedesc {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cve;
		String nomb;
		double predes;
		double preori;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Sexagésimo Sexto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el nombre del artículo");
		nomb = sc.nextLine();
		System.out.println("Ingresa la clave del artículo");
		cve = sc.nextDouble();
		System.out.println("Ingresa el precio original");
		preori = sc.nextDouble();
		if (cve==01) {
			predes = preori-preori*.1;
		} else {
			predes = preori-preori*.2;
		}
		System.out.println("Nombre: "+nomb+", clave: "+cve+", precio original: "+preori+", precio con descuento: "+predes);
	}

}
