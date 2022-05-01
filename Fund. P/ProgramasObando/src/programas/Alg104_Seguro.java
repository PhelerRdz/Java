import java.util.Scanner;

public class Alg104_Seguro {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cargos;
		double costo_de_la_poliza;
		double cuota;
		double edad;
		double padece_enfermedad;
		double tipo_de_poliza;
		double toma_alcohol;
		double utiliza_lentes;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Centésimo Cuarto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de edad:");
		edad = sc.nextDouble();
		System.out.println("Seleccione el valor de tipo de poliza.");
		System.out.println("    1.- A cobertura amplia");
		System.out.println("    2.- B daños a terceros");
		tipo_de_poliza = sc.nextDouble();
		if (tipo_de_poliza<1 || tipo_de_poliza>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		System.out.println("Seleccione el valor de toma alcohol.");
		System.out.println("    1.- si");
		System.out.println("    2.- no");
		toma_alcohol = sc.nextDouble();
		if (toma_alcohol<1 || toma_alcohol>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		System.out.println("Seleccione el valor de utiliza lentes.");
		System.out.println("    1.- si");
		System.out.println("    2.- no");
		utiliza_lentes = sc.nextDouble();
		if (utiliza_lentes<1 || utiliza_lentes>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		System.out.println("Seleccione el valor de padece enfermedad.");
		System.out.println("    1.- si");
		System.out.println("    2.- no");
		padece_enfermedad = sc.nextDouble();
		if (padece_enfermedad<1 || padece_enfermedad>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		if (tipo_de_poliza==1) {
			cuota = 1200;
		} else {
			cuota = 950;
		}
		cargos = 0;
		if (toma_alcohol==1) {
			cargos = cargos+cuota*0.1;
		}
		if (utiliza_lentes==1) {
			cargos = cargos+cuota*0.05;
		}
		if (padece_enfermedad==1) {
			cargos = cargos+cuota*0.05;
		}
		if (edad>40) {
			cargos = cargos+cuota*0.2;
		} else {
			cargos = cargos+cuota*0.1;
		}
		costo_de_la_poliza = cuota+cargos;
		System.out.println("Valor de cargos: "+cargos);
		System.out.println("Valor de costo de la poliza: "+costo_de_la_poliza);
		System.out.println("Valor de cuota: "+cuota);
	}
}
