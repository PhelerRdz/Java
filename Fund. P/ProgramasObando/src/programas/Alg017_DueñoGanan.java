import java.util.Scanner;

public class Alg017_DueñoGanan {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double valordganancia;
		double valorreal;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|             Mi Décimo Sétimo Algoritmo              |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("valor Del Producto: ");
		valorreal = sc.nextDouble();
		valordganancia = valorreal*1.30;
		System.out.println("Precio del producto: "+valordganancia);
	}
}
