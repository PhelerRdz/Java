import java.util.Scanner;

public class Alg140_articulos {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double art;
		double cont;
		double costo;
		double descuento;
		double precio;
		double ptodo;
		ptodo = 0;
		System.out.println("Introduzca la cantidad de articulos:");
		art = sc.nextDouble();
		for (cont=1;cont<=art;cont++) {
			System.out.println("Articulo No. "+cont);
			System.out.println("Ingrese el valor de precio:");
			precio = sc.nextDouble();
			descuento = precio*0.1;
			if (precio>=200) {
				descuento = precio*0.15;
			}
			if (precio>100 && precio<200) {
				descuento = precio*0.12;
			}
			costo = precio-descuento;
			ptodo = ptodo+costo;
			System.out.println("Costo: "+costo);
			System.out.println("Descuento: "+descuento);
		}
		System.out.println("Pago por todo : "+ptodo);
	}
}
