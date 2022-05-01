import java.util.Scanner;

public class Alg019_Empresa {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dinerototal;
		double peoplea;
		double peopleb;
		double peoplec;
		double portj1;
		double portj2;
		double portj3;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Noveno Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Cantidad de Personas A: ");
		peoplea = sc.nextDouble();
		System.out.println("Cantidad de Personas B: ");
		peopleb = sc.nextDouble();
		System.out.println("Cantidad de Personas C: ");
		peoplec = sc.nextDouble();
		dinerototal = peoplea+peopleb+peoplec;
		portj1 = peoplea*100/dinerototal;
		portj2 = peopleb*100/dinerototal;
		portj3 = peoplec*100/dinerototal;
		System.out.println("El Porcentaje A: "+portj1+"% , el B es: "+portj2+"% y el C es: "+portj3+"% Total: "+dinerototal+" mxn.");
	}
}
