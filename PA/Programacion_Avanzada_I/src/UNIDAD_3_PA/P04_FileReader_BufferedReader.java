package Unidad_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 *
 * @author GuillermoToledano
 */
public class P04_FileReader_BufferedReader {

    public static void main(String[] args) {
        File file;
        FileReader filereader = null;
        BufferedReader bufferedreader;
        file = new File("src/Recursos/Estudiantes.txt");
        try {
            if (file.exists() && file.isFile()) {
                String nLine;
                int count = 0;
                filereader = new FileReader("src/Recursos/Estudiantes.txt");
                bufferedreader = new BufferedReader(filereader);
                while ((nLine = bufferedreader.readLine()) != null) {
                    count++;
                    System.out.println("[" + count + "] " + nLine);
                }
                bufferedreader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (filereader != null) {
                try {
                    filereader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
