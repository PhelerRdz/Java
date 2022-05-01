
package tuprograma;

import java.util.Scanner;

public class TuPrograma {
    public static void main(String[] args) {
        Scanner stv=new Scanner(System.in);
        int anual,anualpasa,mes,dia,bis4,bis100,eldia=0,bis400,M=0;
        
        System.out.println("Deme el año,mes y dia");
        anual=stv.nextInt();
        mes=stv.nextInt();
        dia=stv.nextInt();
        if (anual<2000) {
            anualpasa=2000-anual;
            
        } else {
            anualpasa=anual-2000;
        }
        if (anual<=2000) {
            if (mes<2) {
                eldia=eldia+1;
            }
            
        } else {
        }
        bis4=anualpasa/4;
        bis100=anualpasa/100;        
        bis400=anualpasa/400;
        eldia=(anualpasa+(bis4-bis100+bis400))%7;
        System.out.println((anualpasa+(bis4-bis100+bis400)));
        System.out.println("\n"+(bis4-bis100+bis400));
        System.out.println("es"+eldia);
        
       
        int bis = 0;
        if (anual % 4 == 0) {
            bis = 1;
            if (anual % 100 == 0) {
                bis = 0;
                if (anual % 400 == 0) {
                    bis = 1;
                }
            } else {
                bis = 1;
            }
        } else {
            bis = 0;
        }
        if (bis==1) {
            switch (mes) {
                case 1:
                case 4:
                case 7:
                    M += 0;
                    break;
                case 2:
                case 8:
                    M += 3;
                    break;
                case 3:
                case 11:
                    M += 4;
                    break;
                case 5:
                    M += 2;
                    break;
                case 6:
                    M += 5;
                    break;
                case 9:
                case 12:
                    M += 6;
                    break;
                case 10:
                    M += 1;
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            switch (mes) {
                case 1:
                case 10:
                    M += 0;
                    break;
                case 2:
                case 3:
                    M += 3;
                case 11:
                    break;
                case 4:
                case 7:
                    M += 6;
                    break;
                case 5:
                    M += 1;
                    break;
                case 6:
                    M += 4;
                    break;
                case 8:
                    M += 2;
                    break;
                case 9:
                case 12:
                    M += 5;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }

}
