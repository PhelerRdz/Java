import java.util.Scanner;

public class Alg079_AutoTerreno {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double crecimientoanual;
		double devaluacionanual;
		double devaluacionauto3;
		double factauto;
		double factterreno;
		double terreno3anios;
		double valauto;
		double valterreno;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Septuagésimo Noveno Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el factor de devaluacion del auto");
		factauto = sc.nextDouble();
		System.out.println("Ingresa el factor de crecimiento de valor del terreno");
		factterreno = sc.nextDouble();
		System.out.println("Ingresa el valor del auto");
		valauto = sc.nextDouble();
		valterreno = valauto;
		crecimientoanual = valterreno*factterreno;
		devaluacionanual = valauto*factauto;
		terreno3anios = crecimientoanual*3;
		devaluacionauto3 = devaluacionanual*3;
		if (devaluacionauto3<(terreno3anios/2)) {
			System.out.println("Comprar auto");
		} else {
			System.out.println("Comprar terreno");
		}
	}
}
