package matematicascomp;

import java.util.Scanner;

public class MatematicasComp {

    public static void main(String[] args) {
        MatematicasComp conversion = new MatematicasComp();
        int cifra;
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("*      Integrantes del Programa:      *");
        System.out.println("*    Carlos Eduardo Espejel Pliego    *");
        System.out.println("*    Luis Fernando Ortega Resendiz    *");
        System.out.println("*       Fernando Martinez Reyes       *");
        System.out.println("*    Jorge Luis Rodriguez Espinosa    *");
        System.out.println("*-------------------------------------*");
        System.out.println("*               Materia               *");
        System.out.println("*   Matematicas Para La Computacion   *");
        System.out.println("*               Maestra               *");
        System.out.println("*  Mayra Guadalupe  Treviño Berrones  *");
        System.out.println("***************************************");
        System.out.println("");
        System.out.println("Conversiones de numeros Decimales-Binarios-Octales-Hexadecimales");
        System.out.println("");
        System.out.println("Que tipo de numero Ingresaras:");
        System.out.println("1.- Decimal");
        System.out.println("2.- Binario");
        System.out.println("3.- Octal");
        System.out.println("4.- Hexadecimal");
        System.out.println("5.- Salir del Programa");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Ingresa un numero Decimal: ");
                cifra = sc.nextInt();
                System.out.print("\nbinario:\t");
                binario(cifra);
                System.out.print("\noctal:\t\t");
                octal(cifra);
                String hexadecimal = Integer.toHexString(cifra);
                System.out.printf("\nHexadecimal:\t" + hexadecimal);
                break;
            case 2:
                System.out.println("Ingresa un numero Binario: ");
                sc.nextLine();
                String valor;
                valor = sc.nextLine();
                bin_dec(valor);
                bin_oct(valor);
                bin_hex(valor);
                break;
            case 3:
                System.out.println("Ingresa un numero Octal: ");
                sc.nextLine();
                cifra = sc.nextInt();
                System.out.print(conversion.octaToDecimal(cifra));
                System.out.print(conversion.octaToHexa(cifra));
                System.out.print(conversion.octaToBinario(cifra));
                break;
            case 4:
                System.out.println("Ingresa un numero Hexadecimal: ");
                String numero;
                sc.nextLine();
                numero = sc.nextLine();
                System.out.println("Decimal:" + getDecimal(numero));
                int numHex = Integer.parseInt(numero, 16);
                String binary = Integer.toBinaryString(numHex);
                System.out.println("Binario: " + binary);
                int decnum,
                 l = 1,
                 j;
                int octnum[] = new int[100];
                decnum = getDecimal(numero);
                while (decnum != 0) {
                    octnum[l++] = decnum % 8;
                    decnum = decnum / 8;
                }
                System.out.print("Octal : ");
                for (j = l - 1; j > 0; j--) {
                    System.out.print(octnum[j]);
                }
                System.out.println("");
                break;
            case 5:
                System.out.println("Muchas Gracias por usar el programa");
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void binario(int N) {
        if (N == 1) {
            System.out.print("1");
        } else {
            binario(N / 2);
            System.out.print(N % 2);
        }
    }

    public static void octal(int N) {
        if (N < 8) {
            System.out.print(N);
        } else {
            octal(N / 8);
            System.out.print(N % 8);
        }
    }

    public static int getDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void bin_dec(String valor) {
        int dec = Integer.parseInt(valor, 2);
        System.out.print("\nDecimal:\t" + dec);
    }

    public static void bin_hex(String valor) {
        int dec = Integer.parseInt(valor, 2);
        valor = Integer.toHexString(dec);
        System.out.print("\nHexadecimal:\t" + valor);
    }

    public static void bin_oct(String valor) {
        int dec = Integer.parseInt(valor, 2);
        valor = Integer.toOctalString(dec);
        System.out.print("\noctal:\t\t" + valor);
    }

    public String binary(String hexa) {
        int numHex = Integer.parseInt(hexa, 16);
        String binary = Integer.toBinaryString(numHex);
        return binary;
    }

    public int octaToDecimal(int octal) {
        System.out.print("\nDecimal:\t");
        Integer numero = 0;
        try {
            numero = Integer.valueOf(String.valueOf(octal), 8);
        } catch (NumberFormatException e) {
            System.out.print("\nERROR : El numero " + octal + "  no es octal");
        }
        return numero;
    }

    public String octaToHexa(int octal) {
        System.out.print("\nHexadecimal:\t");
        Integer numero = 0;
        try {
            numero = Integer.valueOf(String.valueOf(octal), 8);
        } catch (NumberFormatException e) {
            System.out.print("\nERROR : El numero " + octal + "  no es octal");
        }
        return Integer.toHexString(numero);
    }

    public String octaToBinario(int octal) {
        System.out.print("\nBinario:\t");
        Integer numero = 0;
        try {
            numero = Integer.valueOf(String.valueOf(octal), 16);
        } catch (NumberFormatException e) {
            System.out.print("\nERROR : El numero " + octal + "  no es octal");
        }
        return Integer.toBinaryString(numero);
    }
}
