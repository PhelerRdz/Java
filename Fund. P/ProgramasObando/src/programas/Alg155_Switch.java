import java.util.Scanner;

public class Alg155_Switch {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String dat;
		double dat2;
		double dat3;
		double dat4;
		double dat5;
		double lados;
		int opc;
		String resp;
		resp = "S";
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Quincuagésimo Quinto Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("En que medida daras los datos: (cm,km,mm...)");
		dat = sc.next();
		while (resp.equals("S")) {
			System.out.println("Elige la figura que desees saber sus propiedades");
			System.out.println("0.- Circulo");
			System.out.println("1.- Cuadrado");
			System.out.println("2.- Triangulo");
			System.out.println("3.- Poligono Regular");
			opc = sc.nextInt();
			switch (opc) {
			case 0:
				System.out.println("Introduzca el valor del radio");
				dat2 = sc.nextDouble();
				System.out.println("Area: "+(3.14159*(dat2*dat2))+" "+dat+"2");
				System.out.println("Perimetro: "+(2*3.14159*dat2)+" "+dat);
				System.out.println("Area de la Esfera: "+(4*3.14159*(dat2*dat2))+" "+dat+"2");
				System.out.println("Volumen de la esfera: "+((4*3.14159*(dat2*dat2*dat2))/3)+" "+dat+"3");
				break;
			case 1:
				System.out.println("Introduzca el valor de uno de los lados:");
				dat2 = sc.nextDouble();
				System.out.println("Area: "+(dat2*dat2)+" "+dat+"2");
				System.out.println("Perimetro: "+(4*dat2)+" "+dat);
				System.out.println("Area del cubo: "+(6*(dat2*dat2))+" "+dat+"2");
				System.out.println("Volumen del cubo: "+(dat2*dat2*dat2)+" "+dat+"3");
				break;
			case 2:
				System.out.println("Introduzca el valor de la base: ");
				dat2 = sc.nextDouble();
				System.out.println("Introduzca el valor de el lado Num 2: ");
				dat3 = sc.nextDouble();
				System.out.println("Introduzca el valor de el lado Num 3: ");
				dat4 = sc.nextDouble();
				System.out.println("Introduzca el valor de la Altura: ");
				dat5 = sc.nextDouble();
				System.out.println("Area: "+((dat2*dat5)/2)+" "+dat+"2");
				System.out.println("Perimetro: "+(dat2+dat3+dat4)+" "+dat);
				break;
			case 3:
				System.out.println("Cuantos lados tiene el Poligono: ");
				lados = sc.nextDouble();
				System.out.println("Introduzca el valor de la Apotema: ");
				dat3 = sc.nextDouble();
				System.out.println("Introduzca El valor de uno de los Lados: ");
				dat2 = sc.nextDouble();
				System.out.println("Area: "+((lados*dat2)*dat3/2)+" "+dat+"2");
				System.out.println("Perimetro: "+(lados*dat2)+" "+dat);
				break;
			default:
				System.out.println("Introduzca un numero de la tabla anterior");
			}
			System.out.println("Quieres Regresar al menu? (S o N)");
			resp = sc.next();
		}
	}
}
