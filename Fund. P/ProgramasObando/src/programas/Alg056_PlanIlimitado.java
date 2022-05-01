import java.util.Scanner;

public class Alg056_PlanIlimitado {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double men;
		double seg;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Quincuagésimo Sexto Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese los segundos realizados");
		seg = sc.nextDouble();
		System.out.println("Ingrese los mensajes realizados");
		men = sc.nextDouble();
		tot = ((((seg-1500)/60)*1.2)+men*5)+450;
		System.out.println("El costo sería de: "+tot);
	}
}
