package matriz.caracol;

import java.util.Scanner;

public class MatrizCaracol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Renglon: ");int R=sc.nextInt();
        System.out.println("Columnas: ");int C=sc.nextInt();
        int r=0,c=0,ur=R-1,pr=0,uc=C-1,pc=0,cant=R*C,quehago=1;
        int [][]matriz= new int[R][C];
        for (int interador = 1; interador <=cant; interador++){
            matriz[r][c]=interador;
            switch (quehago) {
                case 1:
                    if (c<uc) {
                        c++;
                    }else{
                        quehago=2;
                        r++;
                        pr++;
                    }
                    break;
                case 2:
                    if (r<ur) {
                        r++;
                    }else{
                        quehago=3;
                        c--;
                        uc--;
                    }
                    break;
                case 3:
                    if (c>pc) {
                        c--;
                    }else{
                        quehago=4;
                        r--;
                        ur--;
                    }
                    break;
                case 4:
                    if (r>pr) {
                        r--;
                    }else{
                        quehago=1;
                        c++;
                        pc++;
                    }
                    break;
            }
        }
        for (r = 0; r < R; r++) {
            for (c = 0; c < C; c++) {
                System.out.print("["+matriz[r][c]+"]\t");
            }
            System.out.println("");
        }
    }
}
