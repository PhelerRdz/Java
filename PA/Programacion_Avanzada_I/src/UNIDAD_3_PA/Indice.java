/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;

/**
 *
 * @author TerezaconZ
 */
public class Indice {
    
    private String Libro_1;
    private String Libro_2;
    private String Libro_3;
    private String Libro_4;
    private String Libro_5;
    private String Libro_6;
    
    public Indice(){
        
    }
    
    public Indice(String Libro_1, String Libro_2, String Libro_3, String Libro_4, String Libro_5, String Libro_6){
        
        this.Libro_1 = Libro_1;
        this.Libro_2 = Libro_2;
        this.Libro_3 = Libro_3;
        this.Libro_4 = Libro_4;
        this.Libro_5 = Libro_5;
        this.Libro_6 = Libro_6;
        
    }

    public String getLibro_1() {
        return Libro_1;
    }

    public void setLibro_1(String Libro_1) {
        this.Libro_1 = Libro_1;
    }

    public String getLibro_2() {
        return Libro_2;
    }

    public void setLibro_2(String Libro_2) {
        this.Libro_2 = Libro_2;
    }

    public String getLibro_3() {
        return Libro_3;
    }

    public void setLibro_3(String Libro_3) {
        this.Libro_3 = Libro_3;
    }

    public String getLibro_4() {
        return Libro_4;
    }

    public void setLibro_4(String Libro_4) {
        this.Libro_4 = Libro_4;
    }

    public String getLibro_5() {
        return Libro_5;
    }

    public void setLibro_5(String Libro_5) {
        this.Libro_5 = Libro_5;
    }

    public String getLibro_6() {
        return Libro_6;
    }

    public void setLibro_6(String Libro_6) {
        this.Libro_6 = Libro_6;
    }

    @Override
    public String toString() {
        return "Indice\n\n" + 
               "Libro 1: " + Libro_1 + 
               "\nLibro 2: " + Libro_2 + 
               "\nLibro 3: " + Libro_3 + 
               "\nLibro 4: " + Libro_4 + 
               "\nLibro 5: " + Libro_5 + 
               "\nLibro 6: " + Libro_6 +
               "\n";
    }
    
    
    
}
