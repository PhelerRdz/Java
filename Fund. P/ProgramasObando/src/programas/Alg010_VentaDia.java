import java.util.Scanner;

public class Alg010_VentaDia {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double aimp;
		double dia1;
		double dia2;
		double dia3;
		double dia4;
		double dia5;
		double dia6;
		double dia7;
		double imp;
		double vt;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|                  Mi Décimo Algoritmo                |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca la Venta del Dia No. 1: ");
		dia1 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 2: ");
		dia2 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 3: ");
		dia3 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 4: ");
		dia4 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 5: ");
		dia5 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 6: ");
		dia6 = sc.nextDouble();
		System.out.println("Introduzca la Venta del Dia No. 7: ");
		dia7 = sc.nextDouble();
		vt = dia1+dia2+dia3+dia4+dia5+dia6+dia7;
		aimp = vt-(vt*.16);
		imp = vt*.16;
		System.out.println("El Precio Antes Del Impuesto es: "+aimp+"mxn. , el impuesto es: "+imp+"mxn. , y la venta total es: "+vt+"mxn. ");
	}
}
