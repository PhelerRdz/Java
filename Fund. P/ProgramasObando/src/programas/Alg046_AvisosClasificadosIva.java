import java.util.Scanner;

public class Alg046_AvisosClasificadosIva {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double numc;
		double nump;
		double prec;
		double tamc;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Cuadragésimo Sexto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa número de palabras");
		nump = sc.nextDouble();
		System.out.println("Ingresa el tamaño en centimetros ");
		tamc = sc.nextDouble();
		System.out.println("Ingresa el numero de colores");
		numc = sc.nextDouble();
		prec = (nump*20+tamc*15+numc*25)*1.16;
		System.out.println("El costo del aviso sería de: "+prec);
	}
}
