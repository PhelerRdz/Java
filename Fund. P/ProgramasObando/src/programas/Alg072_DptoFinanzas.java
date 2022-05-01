import java.util.Scanner;

public class Alg072_DptoFinanzas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cuota;
		double monto;
		String sexo;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Septuagésimo Segundo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el monto de la fianza");
		monto = sc.nextDouble();
		if (monto<50000) {
			cuota = monto*.03;
		} else {
			cuota = monto*.02;
		}
		System.out.println("La cuota es de: "+cuota);
	}
}
