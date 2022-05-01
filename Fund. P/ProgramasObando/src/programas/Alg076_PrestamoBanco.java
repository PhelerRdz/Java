import java.util.Scanner;

public class Alg076_PrestamoBanco {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double hipoteca;
		double inv;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Septuagésimo Sexto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de la hipoteca");
		hipoteca = sc.nextDouble();
		if (hipoteca<=1000000) {
			inv = hipoteca*.5;
		} else {
			inv = hipoteca*.1;
		}
		System.out.println("Tiene: "+inv);
	}
}
