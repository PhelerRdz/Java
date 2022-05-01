/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_metodoshell;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pheler
 */
public class Main {

    private static Clientes[] array = {
        new Clientes(4000, "Sandra", "8334430586"),
        new Clientes(5000, "Jorge", "8334430587"),
        new Clientes(7000, "Luis", "8334432735"),
        new Clientes(1000, "Luisa", "8332345723"),
        new Clientes(2000, "Ruth", "8334912387"),
        new Clientes(8000, "Carlos", "8334136564"),
        new Clientes(3000, "Karla", "8333251323"),
        new Clientes(9000, "Eduardo", "8331213156")
    };

    public static void main(String[] args) {
        Clientes cliente = new Clientes(null, null, null);
        Scanner sc = new Scanner(System.in);
        String nombre, telefono;
        int saldo, salto, i;
        boolean cambios;
        System.out.println("Por que Propiedad deseas ordenar el arreglo:"
                + "\n1.- Nombre"
                + "\n2.- Telefono"
                + "\n3.- Saldo");
        int var = sc.nextInt();
        switch (var) {
            case 1:
                System.out.println("Como lo quieres Ordenado Por:"
                        + "\n1.- Ascendente"
                        + "\n2.- Descendente");
                var = sc.nextInt();
                switch (var) {
                    case 1:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getNombre().compareTo(array[i].getNombre()) > 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getNombre().compareTo(array[i].getNombre()) < 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                System.out.println("Como lo quieres Ordenado Por:"
                        + "\n1.- Ascendente"
                        + "\n2.- Descendente");
                var = sc.nextInt();
                switch (var) {
                    case 1:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getTelefono().compareTo(array[i].getTelefono()) > 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getTelefono().compareTo(array[i].getTelefono()) < 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                System.out.println("Como lo quieres Ordenado Por:"
                        + "\n1.- Ascendente"
                        + "\n2.- Descendente");
                var = sc.nextInt();
                switch (var) {
                    case 1:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getSaldo().compareTo(array[i].getSaldo()) > 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        for (salto = array.length / 2; salto != 0; salto /= 2) {
                            cambios = true;
                            while (cambios) {
                                cambios = false;
                                for (i = salto; i < array.length; i++) {
                                    if (array[i - salto].getSaldo().compareTo(array[i].getSaldo()) < 0) {
                                        Clientes aux = array[i];
                                        array[i] = array[i - salto];
                                        array[i - salto] = aux;
                                        cambios = true;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        for (Clientes c : array) {
            System.out.println(c.getNombre() + "\t" + c.getTelefono() + "\t" + c.getSaldo());
        }

    }
}
