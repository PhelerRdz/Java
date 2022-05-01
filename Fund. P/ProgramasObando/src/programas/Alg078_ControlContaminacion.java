import java.util.Scanner;

public class Alg078_ControlContaminacion {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double gandia;
		double imeca;
		double multa;
		double perd;
		double perdtot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Septuagésimo Octavo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa las ganancias diarias");
		gandia = sc.nextDouble();
		System.out.println("Ingresa la puntuacion IMECA");
		imeca = sc.nextDouble();
		if (imeca>170) {
			perd = gandia*7;
			multa = perd*.5;
			perdtot = perd+multa;
		} else {
			perdtot = 0;
		}
		System.out.println("Perdidas totales: "+perdtot);
	}
}
