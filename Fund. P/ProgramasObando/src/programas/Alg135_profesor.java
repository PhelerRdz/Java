public class Alg135_profesor {
    public static void main(String args[]) {
		double anio;
		double cont;
		double ini;
		double reci;
		for (cont=1;cont<=6;cont++) {
			System.out.println("===============");
			System.out.println("Año Numero: "+cont);
			ini = 1500;
			anio = cont;
			reci = ini*Math.pow((1.1),(anio));
			System.out.println("Valor de salario inicial: "+ini);
			System.out.println("Valor de salario recibido: "+reci);
		}
	}
}
