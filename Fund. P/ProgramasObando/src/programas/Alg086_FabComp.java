import java.util.Scanner;

public class Alg086_FabComp {
    public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		double comp;
		double precio;
		double recio;
		recio = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Octogésimo Sexto Algoritmo            |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Introduzca la Cantidad de Computadoras adquiridas: ");
		comp = sc.nextDouble();
		if ((comp>=5)) {
			if ((comp>=10)) {
				precio = (11000*comp)-((11000*comp)*0.40);
			} else {
				precio = (11000*comp)-((11000*comp)*0.20);
			}
		} else {
			precio = (11000*comp)-((11000*comp)*0.10);
		}
		System.out.println("El Pago Final es de: "+precio);
	}
}
