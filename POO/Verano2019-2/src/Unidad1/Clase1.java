/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Clase1 {
    
    public static void main(String[] args) {
        Saludar();
        System.out.println("Suma: " + Suma(2, 5));
        
        double sum = Suma(4,6);
        System.out.println("sum: " + sum);
        
        int[] califs = new int[]{5, 7, 7, 7, 5, 6, 6};
        double prom = Average(califs);
        System.out.println("AVG:" + prom);        
        
        if (prom >= 6 ) {
            System.out.println("APPROVE");
        }else {
            System.out.println("SEE YOU IN NEXT SEMESTER");
        }
        
    }
    
    public static void Saludar(){
        System.out.println("Hola!!");
    }
    
    public static double Suma(double a, double b){
        double s;
        s = a+b;
        return s; 
    }
    
    public static double Average(int[] nums){
        double avg = 0;
        for (int i = 0; i < nums.length; i++) {
            avg = avg + nums[i];
        }
        avg = avg / nums.length;
        
        return avg;
    }
    
}


