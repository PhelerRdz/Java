import java.util.Scanner;

public class Alg114_Vacunas {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double edad;
		double sexo;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|         Mi Centésimo Décimo Cuarto Algoritmo        |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de edad:");
		edad = sc.nextDouble();
		System.out.println("Seleccione el valor de sexo.");
		System.out.println("    1.- mujer");
		System.out.println("    2.- hombre");
		sexo = sc.nextDouble();
		if (sexo<1 || sexo>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		if ((sexo==2 && edad>=16 && edad<70) || edad<16) {
			System.out.println("A");
		}
		if (sexo==1 && edad>=16 && edad<70) {
			System.out.println("B");
		}
		if (edad>70) {
			System.out.println("C");
		}
	}
}
