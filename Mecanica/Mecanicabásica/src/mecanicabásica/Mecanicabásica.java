package mecanicabásica;
import java.util.Scanner;
public class Mecanicabásica {

    
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int n,i,j,opc;
        do{
            System.out.println("MENU");
            System.out.println("1.- Calcular las componentes x,y dados los vectores y el angulo, además de la resultante y el ángulo");
            System.out.println("2.- Determinar la resultante y el angulo dadas las componentes rectangulares");
            System.out.println("Elige una opcion: ");
            opc=dato.nextInt();
        }while(opc<1 || opc>2);
        double x,y,RCS,anguloradianes,sumax=0,sumay=0,parteEntera,resultante;
        if(opc==1)
        {
            System.out.println("Cuantos vectores con su respectivo angulo va a capturar: ");
            n=dato.nextInt();
            double arr[][]=new double [n][4];
            for(i=0; i<n; i++)
                for(j=0; j<2; j++)
                {
                    arr[i][j]=dato.nextDouble();
                }

            for(i=0; i<n; i++)
            {
                anguloradianes=Math.toRadians(arr[i][1]);
                x=arr[i][0] * Math.cos(anguloradianes);
                y=arr[i][0]*Math.sin(anguloradianes);
                RCS=x/Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
                RCS = Math.round(RCS);
                arr[i][2] = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1));
                sumax+=RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1));
                RCS = y/Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                RCS = Math.round(RCS); 
                arr[i][3] = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                sumay+=RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
            }
            
            parteEntera = Math.floor(sumax);
            sumax=(sumax-parteEntera)*Math.pow(10, 2);
            sumax=Math.round(sumax);
            sumax=(sumax/Math.pow(10, 2))+parteEntera;
            
            parteEntera = Math.floor(sumay);
            sumay=(sumay-parteEntera)*Math.pow(10, 2);
            sumay=Math.round(sumay);
            sumay=(sumay/Math.pow(10, 2))+parteEntera;
            System.out.println("");
            for(i=0; i<n; i++)
            {
                for(j=0; j<4; j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Σx= "+sumax);
            System.out.println("Σy= "+sumay);
            resultante=Math.sqrt((sumax*sumax)+(sumay*sumay));
            parteEntera = Math.floor(resultante);
            resultante=(resultante-parteEntera)*Math.pow(10, 1);
            resultante=Math.round(resultante);
            resultante=(resultante/Math.pow(10, 1))+parteEntera;
            System.out.println("R= "+resultante);
        }
        else
        {
            System.out.println("Cuantas coordenadas rectangulares x,y va a capturar:");
            n=dato.nextInt();
            double arr[][]=new double [n][2];
            for(i=0; i<n; i++)
                for(j=0; j<2; j++)
                {
                    arr[i][j]=dato.nextDouble();
                }
            for(i=0; i<n; i++)
            {
                sumax+=arr[i][0];
                sumay+=arr[i][1];

            }
            parteEntera = Math.floor(sumax);
            sumax=(sumax-parteEntera)*Math.pow(10, 2);
            sumax=Math.round(sumax);
            sumax=(sumax/Math.pow(10, 2))+parteEntera;
            
            parteEntera = Math.floor(sumay);
            sumay=(sumay-parteEntera)*Math.pow(10, 2);
            sumay=Math.round(sumay);
            sumay=(sumay/Math.pow(10, 2))+parteEntera;
            resultante=Math.sqrt((sumax*sumax)+(sumay*sumay));
            parteEntera = Math.floor(resultante);
            resultante=(resultante-parteEntera)*Math.pow(10, 1);
            resultante=Math.round(resultante);
            resultante=(resultante/Math.pow(10, 1))+parteEntera;
            double Phi = Math.atan2(sumay, sumax);
            double Theta = Math.toDegrees(Phi); 
            parteEntera = Math.floor(Theta);
            Theta=(Theta-parteEntera)*Math.pow(10, 1);
            Theta=Math.round(Theta);
            Theta=(Theta/Math.pow(10, 1))+parteEntera;
            System.out.println("(R,θ) = (" + resultante +"m ,"
                + " " + Theta+"°)");
        }
            
    }
    
}
