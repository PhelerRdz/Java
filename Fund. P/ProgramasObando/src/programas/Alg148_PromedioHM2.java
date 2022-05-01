import java.util.Scanner;

public class Alg148_PromedioHM2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double c;
		double conth;
		double contm;
		double edad;
		double edades;
		double na;
		double nump;
		double prom;
		double promh;
		double promm;
		String sexo;
		double sumah;
		double sumam;
		c = 1;
		prom = 0;
		promh = 0;
		promm = 0;
		na = 0;
		edades = 0;
                sumah=0;
                conth=0;
                sumam=0;
                contm=0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Octavo Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca el Numero de personas que ingresara");
		nump = sc.nextDouble();
		while (c<=nump) {
			c = c+1;
			System.out.println("Introduzca H si es Hombre o M si es Mujer");
			sexo = sc.next();
			System.out.println("Escribir la edad de la persona");
			edad = sc.nextDouble();
			if (sexo.equals("H")) {
				sumah = sumah+edad;
				conth = conth+1;
			} else {
				if (sexo.equals("M")) {
					sumam = sumam+edad;
					contm = contm+1;
				}
			}
		}
		System.out.println("el promedio h es: "+(sumah/conth));
		System.out.println("el promedio m es: "+(sumam/contm));
	}
}
