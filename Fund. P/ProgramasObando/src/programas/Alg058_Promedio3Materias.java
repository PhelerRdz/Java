import java.util.Scanner;

public class Alg058_Promedio3Materias {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double exa;
		double fis;
		double mat;
		double prom;
		double qui;
		double tar;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Quincuagésimo Octavo Algoritmo         |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Calificación del examen de matemáticas:");
		exa = sc.nextDouble();
		System.out.println("Calificación de tareas de matemáticas:");
		tar = sc.nextDouble();
		mat = (exa*.9)+(tar/.3);
		System.out.println("Promedio de matemáticas: "+mat);
		System.out.println("Calificación del examen de física:");
		exa = sc.nextDouble();
		System.out.println("Calificación de tareas de física:");
		tar = sc.nextDouble();
		fis = (exa*.8)+(tar/.1);
		System.out.println("Promedio de física: "+fis);
		System.out.println("Calificación del examen de química:");
		exa = sc.nextDouble();
		System.out.println("Calificación de tareas de química:");
		tar = sc.nextDouble();
		qui = (exa*.85)+(tar/.2);
		System.out.println("Promedio de química: "+qui);
		prom = (fis+mat+qui)/3;
		System.out.println("Promedio general: "+prom);
	}
}
