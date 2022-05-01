package p1_jorgeclase;

import java.util.Scanner;

public class Automoviles {

    private Integer NumCarro;
    private String Modelo;
    private String Color;

    public Automoviles() {
    }

    public Automoviles(Integer NumCarro, String Modelo, String Color) {
        this.NumCarro = NumCarro;
        this.Modelo = Modelo;
        this.Color = Color;
    }

    public Integer getNumCarro() {
        return NumCarro;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setNumCarro(Integer NumCarro) {
        this.NumCarro = NumCarro;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    //Realizar un programa que ordene los Objetos dentro de un array por las 
    //propiedades Modelo, Color(LAS ELIJIRA EL USUARIO)
    public static void main(String[] args) {
        // [tipo_de_dato] [] nombre = new [tipo_de_dato] [tamaño]
        /*
            Variables Primitivas:
                int,double,float,boolean,char,long,short...
            Variables Modernas:
                String,Integer,Double,Float,Char,Long,Short
        
                La diferencia es de: las modernas son clases con metodos internos..
         */
        Scanner sc = new Scanner(System.in);
        Automoviles[] vehiculos = new Automoviles[5];
        vehiculos[0] = new Automoviles(1, "ASDER", "Verde");
        vehiculos[1] = new Automoviles(2, "SEDAN", "Rojo");
        vehiculos[2] = new Automoviles(3, "ATOS", "Amarillo");
        vehiculos[3] = new Automoviles(4, "DELORIAN", "Morado");
        vehiculos[4] = new Automoviles(5, "RANGER", "Azul");
        System.out.println("Como lo quieres Ordenar:");
        System.out.println("MODELO o COLOR");
        String op = sc.nextLine();
        op = op.toUpperCase();
        switch (op) {
            case "MODELO":
                System.out.println("ASCENDENTE o DESCENDENTE");
                op = sc.nextLine();
                op = op.toUpperCase();
                switch (op) {
                    case "ASCENDENTE":
                        for (int i = 0; i < vehiculos.length - 1; i++) {
                            for (int j = 0; j < vehiculos.length - 1; j++) {
                                if (vehiculos[j].getModelo().compareTo(vehiculos[j + 1].getModelo()) > 0) {
                                    Automoviles aux = vehiculos[j];
                                    vehiculos[j] = vehiculos[j + 1];
                                    vehiculos[j + 1] = aux;
                                }
                            }
                        }
                        break;
                    case "DESCENDENTE":
                        for (int i = 0; i < vehiculos.length - 1; i++) {
                            for (int j = 0; j < vehiculos.length - 1; j++) {
                                if (vehiculos[j].getModelo().compareTo(vehiculos[j + 1].getModelo()) < 0) {
                                    Automoviles aux = vehiculos[j];
                                    vehiculos[j] = vehiculos[j + 1];
                                    vehiculos[j + 1] = aux;
                                }
                            }
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "COLOR":
                System.out.println("ASCENDENTE o DESCENDENTE");
                op = sc.nextLine();
                op = op.toUpperCase();
                switch (op) {
                    case "ASCENDENTE":
                        for (int i = 0; i < vehiculos.length - 1; i++) {
                            for (int j = 0; j < vehiculos.length - 1; j++) {
                                if (vehiculos[j].getColor().compareTo(vehiculos[j + 1].getColor()) > 0) {
                                    Automoviles aux = vehiculos[j];
                                    vehiculos[j] = vehiculos[j + 1];
                                    vehiculos[j + 1] = aux;
                                }
                            }
                        }
                        break;
                    case "DESCENDENTE":
                        for (int i = 0; i < vehiculos.length - 1; i++) {
                            for (int j = 0; j < vehiculos.length - 1; j++) {
                                if (vehiculos[j].getColor().compareTo(vehiculos[j + 1].getColor()) < 0) {
                                    Automoviles aux = vehiculos[j];
                                    vehiculos[j] = vehiculos[j + 1];
                                    vehiculos[j + 1] = aux;
                                }
                            }
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                System.out.println("WE estas ciego escribe como te lo indico... prro.");
                throw new AssertionError();
        }
        Impresion(vehiculos);
    }

    //METODO IMPRESION
    public static void Impresion(Automoviles[] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Numero de Carro=" + NumCarro + ", Modelo=" + Modelo + ", Color=" + Color;
    }

}
