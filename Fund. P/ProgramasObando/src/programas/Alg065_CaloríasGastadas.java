import java.util.Scanner;

public class Alg065_CaloríasGastadas {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double act;
		double cg;
		double tie;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|            Mi Sexagésimo Quinto Algoritmo           |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese la actividad realizada(1 = Dormido || 2 = Otro)");
		act = sc.nextDouble();
		System.out.println("Ingrese los minutos en dicha actividad ()");
		tie = sc.nextDouble();
		if ( act==1) {
                    cg = 1.66*tie;
                } else {
                    cg = 1.08*tie;
                }
		System.out.println("Calorías gastadas: "+cg);
	}
}
