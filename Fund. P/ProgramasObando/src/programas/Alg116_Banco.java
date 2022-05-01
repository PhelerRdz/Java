import java.util.Scanner;

public class Alg116_Banco {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double compras_realizadas;
		double intereses;
		double multa;
		double pago_del_corte_anterior;
		double pago_minimo;
		double pago_para_no_generar_intereses;
		double saldo_actual;
		double saldo_anterior;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Centésimo Décimo Sexto Algoritmo        |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.print("Ingrese el valor de compras realizadas:");
		compras_realizadas = sc.nextDouble();
		System.out.print("Ingrese el valor de pago del corte anterior:");
		pago_del_corte_anterior = sc.nextDouble();
		System.out.print("Ingrese el valor de saldo anterior:");
		saldo_anterior = sc.nextDouble();
		if (saldo_anterior*0.15>pago_del_corte_anterior) {
			intereses = saldo_anterior*0.12;
			multa = 200;
		} else {
			intereses = 0;
			multa = 0;
		}
		saldo_actual = saldo_anterior+compras_realizadas-pago_del_corte_anterior+intereses+multa;
		pago_minimo = saldo_actual*0.15;
		pago_para_no_generar_intereses = saldo_actual*0.85;
		System.out.println("Valor de intereses: "+intereses);
		System.out.println("Valor de multa: "+multa);
		System.out.println("Valor de pago minimo: "+pago_minimo);
		System.out.println("Valor de pago para no generar intereses: "+pago_para_no_generar_intereses);
		System.out.println("Valor de saldo actual: "+saldo_actual);
	}
}
