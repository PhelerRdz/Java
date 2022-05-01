import java.util.Scanner;

public class Alg075_ProgramaSAR {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double porcdep;
		double salario;
		double sar;
		double sueldo;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Septuagésimo Quinto Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el salario");
		salario = sc.nextDouble();
		System.out.println("Ingrese el porcentaje depositado");
		porcdep = sc.nextDouble();
		sar = salario*porcdep;
		sueldo = salario-sar;
		System.out.println("El dinero depositado para SAR es de: "+sar);
		System.out.println("El sueldo es de: "+sueldo);
	}
}
