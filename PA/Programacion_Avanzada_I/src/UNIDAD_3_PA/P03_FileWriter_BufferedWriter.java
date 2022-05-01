package UNIDAD_3_PA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P03_FileWriter_BufferedWriter {

    public static void main(String[] args) {
        P08_Estudiante student = null;
        File file = null;
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;
        file = new File("src/Recursos/Estudiantes.txt");
        try {
            if(file.exists() && file.isFile()) {
                student = new P08_Estudiante();
                filewriter = new FileWriter("src/Recursos/Estudiantes.txt", true);
                bufferedwriter = new BufferedWriter(filewriter);
                student.setMatricula("2113330259");
                student.setNombre("Guillermo");
                student.setApaterno("Toledano");
                student.setAmaterno("Villalobos");
                student.setCarrera("ISC");
                bufferedwriter.write(student.toString());
                bufferedwriter.newLine();
                bufferedwriter.close();
            }            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (filewriter != null) {
                try {
                    filewriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
