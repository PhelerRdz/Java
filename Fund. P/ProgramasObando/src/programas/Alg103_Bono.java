import java.util.Scanner;

public class Alg103_Bono {
    	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double antiguedad;
		double bono_mensual;
		double bono_por_antiguedad;
		double bono_por_sueldo;
		double sueldo;
		bono_por_antiguedad = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Centésimo Tercero Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de antiguedad:");
		antiguedad = sc.nextDouble();
		System.out.println("Ingrese el valor de sueldo:");
		sueldo = sc.nextDouble();
		if (antiguedad>2 && antiguedad<5) {
			bono_por_antiguedad = sueldo*0.2;
		}
		if (antiguedad>=5) {
			bono_por_antiguedad = sueldo*0.3;
		}
		bono_por_sueldo = 0;
		if (sueldo<=1000) {
			bono_por_sueldo = sueldo*0.25;
		}
		if (sueldo>1000 && sueldo<=3500) {
			bono_por_sueldo = sueldo*0.15;
		}
		if (sueldo>3500) {
			bono_por_sueldo = sueldo*0.1;
		}
		if (bono_por_antiguedad>bono_por_sueldo) {
			bono_mensual = bono_por_antiguedad;
		} else {
			bono_mensual = bono_por_sueldo;
		}
		System.out.println("Valor de bono mensual: "+bono_mensual);
		System.out.println("Valor de bono por antiguedad: "+bono_por_antiguedad);
		System.out.println("Valor de bono por sueldo: "+bono_por_sueldo);
	}

}
