/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_busquedasecuencial;

import java.util.Scanner;

/**
 *
 * @author Pheler
 */
public class P7_BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color, modelo, buscar;
        Integer asientos,cont = null;
        boolean band = false;
        System.out.println("Dame la cantidad de carros a ingresar");
        Integer cant = Integer.parseInt(sc.nextLine());
        Autos[] autos = new Autos[cant];
        System.out.println("Llenando...");
        for (int i = 0; i < autos.length; i++) {
            System.out.println("Dame que Color tiene el carro No. " + (i + 1));
            color = sc.nextLine();
            System.out.println("Dame que Numero de Asientos tiene el carro No. " + (i + 1));
            asientos = Integer.parseInt(sc.nextLine());
            System.out.println("Dame que Modelo tiene el carro No. " + (i + 1));
            modelo = sc.nextLine();
            autos[i] = new Autos(color, asientos, modelo);
        }
        System.out.println("Llenado.");
        System.out.println("Elige en que opcion desea buscar...");
        System.out.println("1.- Modelo");
        System.out.println("2.- Numero de Asientos");
        int var = Integer.parseInt(sc.nextLine());
        switch (var) {
            case 1:
                System.out.println("Introduzca que es lo que desee buscar?");
                buscar = sc.nextLine();
                for (int i = 0; i < autos.length; i++) {
                    String Factor=(autos[i].getModelo()).substring(0, buscar.length());
                    if (buscar.compareTo(Factor) == 0) {
                        System.out.println(autos[i]);
                        band = true;
                        cont++;
                    }
                }
                break;
            case 2:
                System.out.println("Introduzca que es lo que desee buscar?");
                buscar = sc.nextLine();
                for (int i = 0; i < autos.length; i++) {
                    if (Integer.parseInt(buscar) == autos[i].getNoasientos()) {
                        System.out.println(autos[i]);
                        band = true;
                        cont++;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
        if (band) {
            System.out.println("Se encontraron "+(cont)+" veces el factor: "+buscar);
        }else System.out.println("No se encontro ningun elemento con el factor: "+buscar);

    }
}
