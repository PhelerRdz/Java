/*
 *UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 *FACULTAD DE INGENIERIA "ARTURO NARRO SILLER"
 *CURSOE DE VERANO 2019 - 2
 *PROGRAMACION ORIENTADA A OBJETOS
 *PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 *CONTACTO
 *NOMBRE: RODRIGUEZ ESPINOSA JORGE LUIS
 *MATRICULA: 2191330020
 *EQUIPO 5:
 *RODRIGUEZ ESPINOSA JORGE LUIS
 *ROSALES GARCIA RICARDO JAVIER
 */
package Unidad4_Herencia_Polimorfismo.Pizzas.UsoHerencia;

import Unidad4_Herencia_Polimorfismo.Pizzas.CarnesFrias;
import Unidad4_Herencia_Polimorfismo.Pizzas.Hawaiana;
import Unidad4_Herencia_Polimorfismo.Pizzas.Pepperoni;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Pepperoni pep1;
        Hawaiana haw1;
        CarnesFrias can1;

        pep1 = new Pepperoni(0, 0, "null", 0, "null", "null", 0, "null", "null");
        haw1 = new Hawaiana(0, 0, "null", 0, "null", "null", 0, "null", "null");
        can1 = new CarnesFrias(0, 0, "null", 0, "null", "null", 0, "null", "null");
        
        do {
            System.out.println("***************************************************");
            System.out.println("Elige una opción: ");
            System.out.println("1.- Editar Pepperoni");
            System.out.println("2.- Editar Hawaiana");
            System.out.println("3.- Editar Carnes Frias");
            System.out.println("4.- Salir del Menu Principal/Cerrar Programa");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("***************************************************");
                        System.out.println("Elige tu opcion deseada:");
                        System.out.println("1.- Ingresar Numero Pedido del Pepperoni");
                        System.out.println("2.- Ingresar Precio del Pepperoni");
                        System.out.println("3.- Ingresar Queso del Pepperoni");
                        System.out.println("4.- Ingresar Rebanadas del Pepperoni");
                        System.out.println("5.- Ingresar Ingrediente Principal del Pepperoni");
                        System.out.println("6.- Ingresar Nombre del Pepperoni");
                        System.out.println("7.- Ingresar Edad del Pepperoni");
                        System.out.println("8.- Ingresar Estatura del Pepperoni");
                        System.out.println("9.- Regresar al Menu Principal");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese la Nueva Matricula del Pepperoni");
                                prof.setMatricula(sc.nextLong());
                                System.out.println("Matricula Actualizada***!");
                                break;
                            case 2:
                                System.out.println("Ingrese el Nuevo Sueldo del Pepperoni");
                                break;
                            case 3:
                                System.out.println("Ingrese la Nueva Materia del Pepperoni");
                                break;
                            case 4:
                                System.out.println("Ingrese el Nuevo Nivel del Pepperoni");
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("Error:: Opcion no existente!!");
                        }
                    } while (op!=9);
                    break;
                case 2:
                    do {
                        System.out.println("Elige tu opcion deseada:");
                        System.out.println("1.- Ingresar Matricula del Hawaiana");
                        System.out.println("2.- Ingresar Sueldo del Hawaiana");
                        System.out.println("3.- Ingresar Materia del Hawaiana");
                        System.out.println("4.- Ingresar Nivel del Hawaiana");
                        System.out.println("5.- Ingresar CURP del Hawaiana");
                        System.out.println("6.- Ingresar Nombre del Hawaiana");
                        System.out.println("7.- Ingresar Edad del Hawaiana");
                        System.out.println("8.- Ingresar Estatura del Hawaiana");
                        System.out.println("9.- Regresar al Menu Principal");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("Error:: Opcion no existente!!");
                        }
                    } while (op!=9);
                    break;
                case 3:
                    do {
                        System.out.println("Elige tu opcion deseada:");
                        System.out.println("1.- Ingresar Matricula del Carnes Frias");
                        System.out.println("2.- Ingresar Sueldo del Carnes Frias");
                        System.out.println("3.- Ingresar Materia del Carnes Frias");
                        System.out.println("4.- Ingresar Nivel del Carnes Frias");
                        System.out.println("5.- Ingresar CURP del Carnes Frias");
                        System.out.println("6.- Ingresar Nombre del Carnes Frias");
                        System.out.println("7.- Ingresar Edad del Carnes Frias");
                        System.out.println("8.- Ingresar Estatura del Carnes Frias");
                        System.out.println("9.- Regresar al Menu Principal");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("Error:: Opcion no existente!!");
                        }
                    } while (op!=9);
                    break;
                case 4:
                    System.out.println("Gracias por usar el Programa");
                    break;
                default:
                    System.out.println("Error 404!!!!!");
            }
        } while (op != 4);
    }

}
