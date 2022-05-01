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
package troturaBattleShip;

import java.util.Scanner;

public class IniciarJuego {

    public void Start() {

        System.out.println("Iniciando Juego......"
                + "\n..."
                + "\n.."
                + "\n."
                + "\nTablero Inicial");
        char[][] Tablero = new char[10][10];
        int [] Ejes = new int []{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Tablero[i][j] = '-';
            }
        }
        MostrarTablero(Tablero, Ejes);
        ElegirLugares(Tablero, Ejes);

    }

    public void MostrarTablero(char Array[][], int Array2[]) {
        System.out.print("[ ] ");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + Array2[i] + "] ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + Array2[i] + "] ");
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + Array[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public void ElegirLugares(char Array[][], int Array2[]) {
        int cont = 0, var, X, Y;
        boolean case1 = true, case2 = true, case3 = true, case4 = true;
        Scanner sc = new Scanner(System.in);

        while (cont != 4) {
            System.out.println("====================================");
            MostrarTablero(Array, Array2);
            System.out.println("====================================");
            System.out.println("Valor de contador" + cont);
            System.out.println("Que Barco quieres Colocar");
            System.out.println("4.- Oasis Of The Seas(Longitud 4)");
            System.out.println("3.- Titanic (Longitud 3)");
            System.out.println("2.- USS America (Longitud 2)");
            System.out.println("1.- Mini 230 (Longitud 1)");
            var = sc.nextInt();
            switch (var) {
                case 1:
                    if (case1) {
                        System.out.println("Dame una cordenada X [1-10]");
                        X = sc.nextInt() - 1;
                        System.out.println("Dame una cordenada Y [1-10]");
                        Y = sc.nextInt() - 1;
                        if (Array[X][Y] != 'B') {
                            Array[X][Y] = 'B';
                            cont++;
                            case1 = false;
                        }
                    } else {
                        System.out.println("Ya Colocaste El Barco Mini 230");
                    }
                    break;
                case 2:
                    if (case2) {
                        for (int i = 0; i < 2; i++) {

                            System.out.println("Dame una cordenada X [1-10]");
                            X = sc.nextInt() - 1;
                            System.out.println("Dame una cordenada Y [1-10]");
                            Y = sc.nextInt() - 1;
                            if (Array[X][Y] != 'B') {
                                Array[X][Y] = 'B';
                                if (i == 1) {
                                    case2 = false;
                                    cont++;
                                }
                            } else {
                                System.out.println("La cordenada que introdujiste "
                                        + "ya esta ocupada por un barco");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Ya Colocaste El USS America");
                    }
                    break;
                case 3:
                    if (case3) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Dame una cordenada X [1-10]");
                            X = sc.nextInt() - 1;
                            System.out.println("Dame una cordenada Y [1-10]");
                            Y = sc.nextInt() - 1;
                            if (Array[X][Y] != 'B') {
                                Array[X][Y] = 'B';
                                if (i == 2) {
                                    case3 = false;
                                    cont++;
                                }
                            } else {
                                System.out.println("La cordenada que introdujiste "
                                        + "ya esta ocupada por un barco");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Ya Colocaste El Titanic");

                    }
                    break;
                case 4:

                    if (case4) {
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Dame una cordenada X [1-10]");
                            X = sc.nextInt() - 1;
                            System.out.println("Dame una cordenada Y [1-10]");
                            Y = sc.nextInt() - 1;
                            if (Array[X][Y] != 'B') {
                                Array[X][Y] = 'B';
                                if (i == 3) {
                                    case4 = false;
                                    cont++;
                                }
                            } else {
                                System.out.println("La cordenada que introdujiste "
                                        + "ya esta ocupada por un barco");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Ya Colocaste El Oasis Of The Seas");

                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
