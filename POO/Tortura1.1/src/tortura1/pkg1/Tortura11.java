/*
 *UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 *FACULTAD DE INGENIERIA "ARTURO NARRO SILLER"
 *CURSOR DE VERANO 2019 - 2
 *PROGRAMACION ORIENTADA A OBJETOS
 *PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 *CONTACTO
 *NOMBRE: RODRIGUEZ ESPINOSA JORGE LUIS
 *MATRICULA: 2191330020
 *EQUIPO 5:
 *RODRIGUEZ ESPINOSA JORGE LUIS
 *ROSALES GARCIA RICARDO JAVIER
 */
package tortura1.pkg1;

import java.util.Scanner;
import java.util.Random;

public class Tortura11 {

    Scanner sc = new Scanner(System.in);
    int numSecreto, numIntentos = 0, numPensado = 0, fallos, aciertos, op1, op2, cont;
    Random rnd = new Random();
    String respuesta = "";
    String[] burlas = new String[]{"Intenta de nuevo",
        "Buuu, Otra vez tonto!!", "Erí tremendo licuado de Verga", "Te estoy ganando humano inepto",
        "Pajabrava estas pal´perro", "Basura!!!!", "JAJAJAJAJA", "Suicidate", "Tremendo muerde almohadas",
        "Eres mas inutil de lo que esperaba JAJAJA"};

    public void intentarAcertarNumSecreto() {
        fallos = 0;
        aciertos = 0;
        numSecreto = rnd.nextInt(91) + 10;
        for (int i = 0; i < 10; i++) {
            System.out.print("¿Qué número estoy pensando?: ");
            numPensado = sc.nextInt();
            System.out.println("=="+numSecreto+"==");
            if (numPensado != numSecreto) {
                fallos++;
                System.out.print(burlas[i]);
                if ((numSecreto - numPensado) < 20) {
                    cont++;
                    if (cont == 1) {
                        System.out.println("  (Estas cerca)");
                    } else if (cont == 2) {
                        op1 = numSecreto;
                        System.out.println("  (Te Equivocaste, ¡RaNdOmIzEr! Te queda 1 vez mas)");
                        if (numSecreto > 50) {
                            numSecreto = rnd.nextInt(20) + 10;
                        } else {
                            
                            numSecreto = rnd.nextInt(30) + 70;
                        }
                    } else if (cont == 3) {
                        System.out.println("  (Estas cerca)");
                    } else if (cont == 4) {
                        op2 = numSecreto;
                        System.out.println("  (Te Equivocaste, ¡RaNdOmIzEr! No te quedan mas veces)");
                        
                        if (op1 > op2) {
                            numSecreto = rnd.nextInt((op1+10) - (op2-10))+(op2-10);
                        }else{
                            numSecreto = rnd.nextInt((op2+10) - (op1-10))+(op1-10);
                        }
                        
                    } else if (cont == 5) {
                        System.out.println("  (Estas cerca)");
                    } else if (cont == 6) {
                        System.out.println(" Perdiste no te quedan mas Randomizers...");
                        break;
                    }
                    System.out.println("=="+numSecreto+"==");
                } else {
                    System.out.println("  (Estas Lejos)");
                    System.out.println("=="+numSecreto+"==");
                }
            } else {
                System.out.println("Has acertado");
                System.out.println("Has acertado y has fallado " + fallos + " veces.");
                break;
            }
        }
    }

    public void mostrarArray() {
        System.out.print("La Solucion era: ");
        System.out.println(numSecreto);
    }

    public static void main(String[] args) {
        Tortura11 tortura = new Tortura11();

        tortura.intentarAcertarNumSecreto();
        tortura.mostrarArray();
    }
}
