
import java.util.Scanner;


public class Alg117_Tabla {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double contador;
		double ta;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|        Mi Centésimo Décimo Septimo Algoritmo        |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("De que tabla quieres imrpimir: ");
		ta = sc.nextDouble();
		for (contador=0;contador<=10;contador+=1) {
			System.out.println(ta+"x"+contador+"="+(ta*contador));
		}
	}
}
