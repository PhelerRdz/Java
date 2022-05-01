import java.util.Scanner;

public class Alg073_ColegiaturaDesc {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cole;
		double cost;
		double desc;
		double mate;
		double prom;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Septuagésimo Tercero Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el promedio del ultimo periodo");
		prom = sc.nextDouble();
		System.out.println("Ingresa el numero de materias");
		mate = sc.nextDouble();
		System.out.println("Ingresa el costo de una materia");
		cost = sc.nextDouble();
		cole = mate*cost;
		if (prom>=9) {
			desc = cole*.3;
			System.out.println("La colegiatura es de: "+(cole-desc));
		} else {
			System.out.println("La colegiatura es de: "+(cole*1.1));
		}
	}
}
