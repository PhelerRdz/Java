import java.util.Scanner;

public class Alg044_Vacunabebe {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double dosis;
		double edad;
		double peso;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Cuadragésimo Cuarto Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa el peso del bebé");
		peso = sc.nextDouble();
		System.out.println("Ingresa la edad del bebé");
		edad = sc.nextDouble();
		dosis = ((peso+10)/(10*edad))+8;
		System.out.println("La dosis que se debe aplicar es de: "+dosis);
	}
}
