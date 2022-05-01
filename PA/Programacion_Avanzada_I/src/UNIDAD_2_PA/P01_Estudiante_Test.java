package UNIDAD_2_PA;
public class P01_Estudiante_Test {

    public static void main(String[] args) {
        String id = "2113330259";
        String name = "Guillermo";
        String last_name_p = "Toledano";
        String last_name_m = "Villalobos";
        char gen = 'M';
        String carrer = "ISC";
        String semester = "9";
        boolean scholarship = false;
        double average = 9.0;
        String email = "a2113330259@alumnos.uat.edu.mx";

        P01_Estudiante S1 = new P01_Estudiante();
        P01_Estudiante S2 = new P01_Estudiante(id, name, last_name_p, last_name_m, gen);
        P01_Estudiante S3 = new P01_Estudiante(id, name, last_name_p, last_name_m, gen, carrer, semester, email);
        P01_Estudiante S4 = new P01_Estudiante(id, name, last_name_p, last_name_m, gen, carrer, semester, scholarship, average, email);

        System.out.println("Student 1: " + S1.toString());
        System.out.println("Student 2: " + S2.toString());
        System.out.println("Student 3: " + S3.toString());
        System.out.println("Student 4: " + S4.toString());
        P01_Estudiante S5 = S4;
        System.out.println("Student 5: " + S5.toString());
        
        P01_Estudiante S6 = new P01_Estudiante(id, name, last_name_p, last_name_m, gen, carrer, semester, scholarship, average, email);
        if (S6 == S5) {
            System.out.println("Same reference!");
        } else {
            System.out.println("Different reference!");
        }
        if (S6.equals(S5)) {
            System.out.println("Same person!");
        } else {
            System.out.println("Not same!");
        }
        
        S5.setBECARIO(true);
        System.out.println("Student 4: " + S4.toString());
        System.out.println("Student 5: " + S5.toString());
        if (S6.equals(S5)) {
            System.out.println("Same person!");
        } else {
            System.out.println("Not same!");
        }
        S5 = new P01_Estudiante();
        if (S4 == S5) {
            System.out.println("Same reference!");
        } else {
            System.out.println("Different reference!");
        }
    }
}
