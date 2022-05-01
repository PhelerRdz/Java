import java.util.Scanner;

public class Alg071_Pulsaciones {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double edad;
		double numpul;
		double sexo;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Septuagésimo Primero Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa la edad:");
		edad = sc.nextDouble();
		System.out.println("¿Masculino(1) o femenino(2)?");
		sexo = sc.nextDouble();
		if (sexo == 1) {
			numpul = (210-edad)/10;
		} else {
			numpul = (220-edad)/10;
		}
		System.out.println("Pulsacion estimada: "+numpul);
	}
}
