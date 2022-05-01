import java.util.Scanner;

public class Alg145_Colores2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double amarillo;
		double azul;
		double contador;
		double digito;
		double nautos;
		double roja;
		double rosa;
		double verde;
		contador = 1;
		amarillo = 0;
		rosa = 0;
		roja = 0;
		verde = 0;
		azul = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Cuadragésimo Quinto Algoritmo     |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Escriba la cantidad de autos que entraron a la ciudad");
		nautos = sc.nextDouble();
		while (contador<=nautos) {
			System.out.println("Escriba el ultimo digito de la placa del auto "+contador);
			digito = sc.nextDouble();
			if (((digito==1) || (digito==2))) {
				amarillo = 1+amarillo;
			} else {
				if (((digito==3) || (digito==4))) {
					rosa = rosa+1;
				} else {
					if (((digito==5) || (digito==6))) {
						roja = roja+1;
					} else {
						if (((digito==7) || (digito==8))) {
							verde = verde+1;
						} else {
							if (((digito==9) || (digito==0))) {
								azul = azul+1;
							} else {
							}
						}
					}
				}
			}
			System.out.println("Amarillo "+amarillo);
			System.out.println("Rojos "+roja);
			System.out.println("Rosas "+rosa);
			System.out.println("Verde "+verde);
			System.out.println("Azules "+azul);
			contador = contador+1;
		}
	}
}
