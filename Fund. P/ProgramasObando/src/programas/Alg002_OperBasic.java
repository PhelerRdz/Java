import java.util.Scanner;

public class Alg002_OperBasic {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double divi;
		double multi;
		double num1;
		double num2;
		double resta;
		double suma;
		System.out.println("****************************************************");
		System.out.println("|        Universidad Autonoma de Tamaulipas        |");
		System.out.println("|    Facultad de Ingenieria: Arturo Narro Siller   |");
		System.out.println("|      Ingenieria en Sistemas Computacionales      |");
		System.out.println("|           Fundamentos de Programacion            |");
		System.out.println("|              Mi Segundo Algoritmo                |");
		System.out.println("|          Desarrollador: Jorge Rodriguez          |");
		System.out.println("****************************************************");
		System.out.println("Introduzca el Digito No° 1: ");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el Digito No° 2: ");
		num2 = sc.nextDouble();
		suma = num1+num2;
		resta = num1-num2;
		multi = num1*num2;
		divi = num1/num2;
		System.out.println("Numero Introducidos: "+num1+" y "+num2);
		System.out.println("Sumados son: "+suma+" Restados son: "+resta+" Mulriplicados son: "+multi+" Divididos son: "+divi);
	}
}
