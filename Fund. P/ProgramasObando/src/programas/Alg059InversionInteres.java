import java.util.Scanner;

public class Alg059InversionInteres {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double capi= 0.0;
		double inte;
		double inve;
		double porc;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Noveno Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa tu inversión");
		inve = sc.nextDouble();
		System.out.println("Ingresa el porcentaje de interes");
		porc = sc.nextDouble();
		inte = inve*porc;
		if (inte>7000) {
                    capi = inte+inve;
		}
		System.out.println("Incluyendo los interes, tienes: "+capi);
	}
}
