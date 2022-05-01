import java.util.Scanner;

public class Alg012_ValorAbsoluto {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int absolut;
		int num;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                Mi Duodécimo Algoritmo               |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca El Numero Para Conseguir el Numero Absoluto: |x| ");
		num = sc.nextInt();
		absolut = (num^2)^(1/2);
		System.out.println("El valor Absoluto es: |"+absolut+"|");
	}
}
