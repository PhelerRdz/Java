import java.util.Scanner;

public class Alg074_BienesRaices {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double costo;
		double enganche;
		double ingreso;
		double resto;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Septuagésimo Cuarto Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduce el costo de la casa");
		costo = sc.nextDouble();
		System.out.println("Introduce tus ingresos");
		ingreso = sc.nextDouble();
		if (ingreso<8000) {
			enganche = costo*.15;
			resto = (costo-enganche)/120;
		} else {
			enganche = costo*.3;
			resto = (costo-enganche)/84;
		}
		System.out.println("El enganche es de: "+enganche);
		System.out.println("Los pagos parciales serán de: "+resto);
	}
}
