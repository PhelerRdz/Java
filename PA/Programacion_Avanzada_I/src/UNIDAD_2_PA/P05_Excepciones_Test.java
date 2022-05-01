package UNIDAD_2_PA;

import UNIDAD_2_PA.P05_Excepciones;
import java.util.Scanner;

/**
 *
 * @author GuillermoToledano
 * Practice 05 Exceptions
 */
public class P05_Excepciones_Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        name = name.trim();
        try {
            if (name.isEmpty()) {
                throw new P05_Excepciones("Empty string!");
            }
            if (isAlphanumeric(name)) {
                throw new P05_Excepciones("Only letters!");
            }
        } catch (P05_Excepciones exs) {
            System.out.println(exs.getMessage());
        }
        System.out.println("Continua la ejecución...");
    }

    public static boolean isAlphanumeric(String name) {
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (!(Character.isLetter(ch))
                    || Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}
