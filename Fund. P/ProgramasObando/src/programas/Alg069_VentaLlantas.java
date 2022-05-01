import java.util.Scanner;

public class Alg069_VentaLlantas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cant;
		double prec;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Sexagésimo Noveno Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la cantidad de llantas compradas");
		cant = sc.nextDouble();
		if (cant>=5) {
			prec = 700;
		} else {
			prec = 800;
		}
		System.out.println("El total a pagar es: "+prec*cant);
	}
}
