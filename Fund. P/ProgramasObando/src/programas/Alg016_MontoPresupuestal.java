import java.util.Scanner;

public class Alg016_MontoPresupuestal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dinero;
		double gineco;
		double pedia;
		double trauma;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|              Mi Décimo Sexto Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca La Cantidad De Dinero Del Hospital: ");
		dinero = sc.nextDouble();
		gineco = dinero*.40;
		trauma = dinero*.30;
		pedia = dinero*.30;
		System.out.println("Ginecolo: "+gineco+" mxn. Traumato: "+trauma+" mxn. Pediatría: "+pedia+" y el total $$: "+dinero);
	}
}
