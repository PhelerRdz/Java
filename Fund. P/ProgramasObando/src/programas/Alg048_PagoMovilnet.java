import java.util.Scanner;

public class Alg048_PagoMovilnet {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double llam;
		double men;
		double tot;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|           Mi Cuadragésimo Octavo Algoritmo          |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingresa los minutos hablados");
		llam = sc.nextDouble();
		System.out.println("Ingresa los mensajes enviados");
		men = sc.nextDouble();
		tot = (llam*60*2.5)+(men*1.3);
		System.out.println("El pago para Movilnet es de: "+tot);
	}
}
