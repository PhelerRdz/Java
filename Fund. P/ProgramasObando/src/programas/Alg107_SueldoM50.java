import java.util.Scanner;

public class Alg107_SueldoM50 {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double horas_trabajadas;
		double horas_trabajdas;
		double pago_por_hora;
		double sueldo_semanal;
		horas_trabajdas = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Centésimo Septimo Algoritmo           |");
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
		if (horas_trabajadas>45) {
			sueldo_semanal = sueldo_semanal+(horas_trabajadas-45)*pago_por_hora;
		}
		if (horas_trabajadas>50) {
			sueldo_semanal = 0;
			System.out.println("No está permitido.");
		}
		System.out.println("Valor de sueldo semanal: "+sueldo_semanal);
	}
}
