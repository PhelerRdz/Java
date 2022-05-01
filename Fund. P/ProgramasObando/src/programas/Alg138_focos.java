import java.util.Scanner;

public class Alg138_focos {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double blancos;
		double color;
		double cont;
		double focos;
		double rojos;
		double verdes;
		verdes = 0;
		blancos = 0;
		rojos = 0;
		System.out.println("Inroduzca la cantidad de focos:");
		focos = sc.nextDouble();
		for (cont=1;cont<=focos;cont++) {
			System.out.println("Foco No. "+cont);
			System.out.println("Seleccione el valor de color.");
			System.out.println("    1.- verde");
			System.out.println("    2.- blanco");
			System.out.println("    3.- rojo");
			color = sc.nextDouble();
			if (color==1) {
				verdes = verdes+1;
			}
			if (color==2) {
				blancos = blancos+1;
			}
			if (color==3) {
				rojos = rojos+1;
			}
		}
		System.out.println("Focos verdes : "+verdes);
		System.out.println("Focos blancos : "+blancos);
		System.out.println("Focos rojos : "+rojos);
	}
}
