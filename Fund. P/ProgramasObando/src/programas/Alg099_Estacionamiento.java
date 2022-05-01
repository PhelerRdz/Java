import java.util.Scanner;

public class Alg099_Estacionamiento {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cobro;
		double horas;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Nonagésimo Noveno Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de horas:");
		horas = sc.nextDouble();
		cobro = 0;
		if (horas<=2) {
			cobro = horas*5;
		}
		if (horas>2 && horas<=5) {
			cobro = 2*5+(horas-3)*4;
		}
		if (horas>5 && horas<=10) {
			cobro = 2*5+3*4+(horas-5)*3;
		}
		if (horas>10) {
			cobro = 2*5+3*4+3*5+(horas-10)*2;
		}
		System.out.println("Valor de cobro: "+cobro);
	}
}
