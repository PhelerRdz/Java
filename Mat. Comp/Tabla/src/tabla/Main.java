
package tabla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la formula");
        String form=sc.nextLine();
        System.out.println(form.split(")"));
    }
}
