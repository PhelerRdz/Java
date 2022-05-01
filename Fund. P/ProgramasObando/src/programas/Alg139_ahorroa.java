public class Alg139_ahorroa {
    public static void main(String args[]) {
		double ahorroa;
		double ahorrod;
		double cont;
		ahorroa = 0;
		for (cont=1;cont<=365;cont++) {
			System.out.println("Dia No. "+cont);
			ahorroa = ahorroa+0.01*Math.pow((3),(cont));
			ahorrod = ahorroa;
			System.out.println("Valor de ahorroa diario: "+ahorrod);
		}
		System.out.println("Valor de ahorroa anual : "+ahorroa);
	}
}
