import java.util.Scanner;

public class Alg077_Reforestacion {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cedros;
		double hectareas;
		double ncedros;
		double noyamel;
		double npinos;
		double numhectareas;
		double oyamel;
		double pinos;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Septuagésimo Séptimo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el numero de hectareas");
		hectareas = sc.nextDouble();
		numhectareas = hectareas*10000;
		if (numhectareas>1000000) {
			pinos = numhectareas*.7;
			oyamel = numhectareas*.2;
			cedros = numhectareas*.1;
		} else {
			pinos = numhectareas*.5;
			oyamel = numhectareas*.2;
			cedros = numhectareas*.1;
		}
		npinos = (pinos/10)*8;
		noyamel = (oyamel/15)*15;
		ncedros = (cedros/18)*10;
		System.out.println("Pinos: "+npinos+", Oyamel: "+noyamel+", Cedros: "+ncedros);
	}
}
