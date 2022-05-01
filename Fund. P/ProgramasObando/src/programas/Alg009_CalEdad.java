import java.util.Scanner;

public class Alg009_CalEdad {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double anoac;
		String anocac;
		double añoac;
		double edd;
		double fnac;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                  Mi Noveno Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduze el Año en que Naciste");
		fnac = sc.nextDouble();
		System.out.println("Introduea el Año Actual");
		anoac = sc.nextDouble();
		edd = anoac-fnac;
		System.out.println("Tu Edad en el Año Actual "+anoac+" van a ser o es: "+edd+" Años");
	}
}
