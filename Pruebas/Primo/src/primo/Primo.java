package primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=sc.nextInt();
        boolean EsPrimo=true;
        for (int i=2;i<=Math.sqrt(cont);i++){
            if (cont%i==0){
                EsPrimo=false;
                break;
            }
        }
        if (EsPrimo){
            System.out.println("Primo");
        }else{
            System.out.println("No es Primo");
        }
    }
}
