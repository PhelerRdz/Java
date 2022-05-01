import java.util.Scanner;

public class Alg097_SueldoMensual {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double horas_trabajadas;
		double pago_por_hora;
		double sueldo_semanal;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Nonagésimo Septimo Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de horas trabajadas:");
		horas_trabajadas = sc.nextDouble();
		System.out.println("Ingrese el valor de pago por hora:");
		pago_por_hora = sc.nextDouble();
		sueldo_semanal = horas_trabajadas*pago_por_hora;
		if (horas_trabajadas>40) {
			sueldo_semanal = sueldo_semanal+(horas_trabajadas-40)*pago_por_hora;
		}
		System.out.println("Valor de sueldo semanal: "+sueldo_semanal);
	}
}
