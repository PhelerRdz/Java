package UNIDAD_2_PA;
public class P02_Docente_Test {

    public static void main(String[] args) {

        P02_Docente M1 = new P02_Docente();
        M1.setMATRICULA("2113330259");
        M1.setNOMBRE("Guillermo");
        M1.setAPELLIDO_P("Toledano");
        M1.setAPELLIDO_M("Villalobos");
        M1.setHORAS(8);
        M1.setSALARIO_HORA(100);
        M1.setN_MATERIAS(2);
        M1.setTIPO("Profesor Medio Tiempo");

        System.out.println(M1.toString());
        System.out.println("Salario: $" + (M1.getSALARIO_HORA() * M1.getHORAS() * M1.getN_MATERIAS()));
        System.out.println("Salario: $" + M1.getSALARIO_TOTAL());
        
        String Mat = "2113330258";
        String Nom = "Random";
        String App = "Random";
        String Apm = "Random";
        int Hrs = 12;
        double SHr = 100;
        int Mts = 3;
        P02_Docente M2 = new P02_Docente(Mat, Nom, App, Apm, Hrs, SHr, Mts);
        System.out.println(M2.toString());
    }
}
