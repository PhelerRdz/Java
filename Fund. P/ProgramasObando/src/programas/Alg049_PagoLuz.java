
import java.util.Scanner;

public class Alg049_PagoLuz {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double lecac;
		double lecan;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Cuadragésimo Noveno Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la lectura anterior");
		lecan = sc.nextDouble();
		System.out.println("Ingresa la lectura actual");
		lecac = sc.nextDouble();
		tot = ((lecac-lecan)*0.15)*1.1;
		System.out.println("El pago de la luz es de: "+tot);
	}
}
