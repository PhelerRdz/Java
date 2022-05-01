import java.util.Scanner;

public class Alg115_GananciasPanta {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cargo_por_talla;
		double costo_de_la_tela;
		double ganancia;
		double ganancia_extra;
		double mano_de_obra;
		double metros_de_tela;
		double metro_de_tela;
		double modelo;
		double n_pantalones;
		double precio_final;
		double talla;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|          Mi Centésimo Décimo Quinto Algoritmo        |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingrese el valor de N pantalones:");
		n_pantalones = sc.nextDouble();
		System.out.println("Ingrese el valor de metro de tela:");
		metro_de_tela = sc.nextDouble();
		System.out.println("Seleccione el valor de modelo.");
		System.out.println("    1.- A");
		System.out.println("    2.- B");
		modelo = sc.nextDouble();
		if (modelo<1 || modelo>2) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		System.out.println("Seleccione el valor de talla.");
		System.out.println("    1.- 30");
		System.out.println("    2.- 32");
		System.out.println("    3.- 36");
		talla = sc.nextDouble();
		if (talla<1 || talla>3) {
			System.out.println("Valor incorrecto. Ingréselo nuevamente.: ");
		}
		if (modelo==1) {
			metros_de_tela = 1.5*n_pantalones;
		} else {
			metros_de_tela = 1.8*n_pantalones;
		}
		costo_de_la_tela = metros_de_tela*metro_de_tela;
		if (modelo==1) {
			mano_de_obra = costo_de_la_tela*0.8;
		} else {
			mano_de_obra = costo_de_la_tela*0.95;
		}
		if (talla==2 || talla==3) {
			cargo_por_talla = mano_de_obra*0.04;
		} else {
			cargo_por_talla = 0;
		}
		ganancia_extra = (costo_de_la_tela+mano_de_obra+cargo_por_talla)*0.3;
		precio_final = costo_de_la_tela+mano_de_obra+cargo_por_talla+ganancia_extra;
		ganancia = cargo_por_talla+ganancia_extra;
		System.out.println("Valor de cargo por talla: "+cargo_por_talla);
		System.out.println("Valor de costo de la tela: "+costo_de_la_tela);
		System.out.println("Valor de ganancia: "+ganancia);
		System.out.println("Valor de ganancia extra: "+ganancia_extra);
		System.out.println("Valor de mano de obra: "+mano_de_obra);
		System.out.println("Valor de metros de tela: "+metros_de_tela);
		System.out.println("Valor de precio final: "+precio_final);
	}
}
