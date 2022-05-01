/**@author 2183330170 Zubiri Valdez Hedson Leonardo Zubiri*/
package practica.pkg6;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {
    @SuppressWarnings("empty-statement")
    public int[] leer(String nombreArchivo){
        String dato; int []array = null; 
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            
            System.out.println("Archivo Encontrado");
            
            String temp = "";
            String [] arreglo;
            String x="";
            
            while (temp!=null) {
               temp=buffer.readLine();
                if (temp!=null) {
                    x+=temp;
                } 
            }
                if (x=="") {
                    x=null;
                }
                System.out.println(x);
                arreglo = x.split(",");
                
                
                System.out.println(arreglo.length+" Elementos");
                if (arreglo!=null) {
                    array = new int[arreglo.length];
                    for (int i = 0; i < arreglo.length; i++) {
                        array[i] = Integer.valueOf(arreglo[i]);
                    }
                }
            
            buffer.close();
            r.close();
        } catch (Exception e) {
            
        }   
        
    return array;
        
    }
    
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos texto", "txt");
    public String seleccionar(){
        //Creamos selector de apertura

        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        chooser.setCurrentDirectory(new java.io.File("."));

        //Titulo que llevara la ventana

        chooser.setDialogTitle("Ordenacion datos Archivo.txt");

        //Elegiremos archivos del directorio

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        chooser.setAcceptAllFileFilterUsed(false);

        //Si seleccionamos algún archivo retornaremos su directorio

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().toString();
        //Si no seleccionamos nada retornaremos No seleccion

        } else {

           return "No seleccion ";

        }
    }
}
