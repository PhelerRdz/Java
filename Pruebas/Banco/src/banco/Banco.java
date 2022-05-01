package banco;

import java.util.Scanner;

public class Banco {
    //Parametros
    private String Nombre;
    private double Monto;
    private int Edad;
    private int id;
    
    //Constructor
    public  Banco (){
       
    }
    
    public Banco(int id, String nombre, double monto, int edad){
        this.id = id;
        this.Nombre=nombre;
        this.Monto=monto;
        this.Edad=edad;
    }

    //Getters
    public String getNombre() {
        return Nombre;
    }

    public double getMonto() {
        return Monto;
    }

    public int getEdad() {
        return Edad;
    }
    
    public int getid() {
        return id;
    }
    
    //Setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    //Clase Principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(estatura(sc.nextInt()));
    }
    
    private static String estatura(int est){
        if (est<170) {
            return "Estatura Baja";
        }else if (est<180) {
            return "Estatura Mediana";
        }
        return "Estatura Alta";
    }
}
