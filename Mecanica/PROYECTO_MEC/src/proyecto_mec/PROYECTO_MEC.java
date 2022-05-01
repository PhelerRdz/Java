/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mec;

import java.util.Scanner;

/**
 *
 * @author Salvador Segura
 */
public class PROYECTO_MEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidad=0;
        String unidades="";
        double tiempo=0;
        String segs="";
        String angulo="";
        System.out.println("MENU PRINCIPAL");
        System.out.println("MOVIMIENTO HORIZONTAL");
        System.out.println("TIRO PARABOLICO");
        System.out.println("CAIDA LIBRE");
        int opc;
        String unidadsalida="";
        double gravedad=0;
        System.out.println("SELECCIONE UNA OPCION");
        Scanner dato=new Scanner(System.in);
        opc=dato.nextInt();
        switch(opc)
        {
            case 1: System.out.println("INGRESE LA VELOCIDAD INICIAL");
                    velocidad=dato.nextDouble();
                    System.out.println("INGRESE LAS UNIDADES");
                    unidades=dato.next();
                    System.out.println("INGRESE EL TIEMPO: ");
                    tiempo=dato.nextDouble();
                    segs=dato.next();
                    if(unidades.equals("m/s"))
                    {
                        unidadsalida="m";
                        gravedad=-9.8;
                    }
                    else
                        if(unidades.equals("ft/s"))
                        {
                            unidadsalida="ft";
                            gravedad=-32;
                        }
                    
                    double x=tiempo*velocidad;
                    double y=tiempo*tiempo*gravedad/2;
                    double desp=Math.sqrt((x*x)+(y*y));
                    double RCS = x/Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    double Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
                    System.out.println("Desplazamiento en x");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));
                    RCS = y/Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                    System.out.println("Desplazamiento en Y");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));
                    RCS = desp/Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
                    System.out.println("Desplazamiento Resultante");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));

                    double Phi = Math.atan2(Math.abs(y), Math.abs(x));
                    double Theta = Math.toDegrees(Phi); 
                    RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    if(x<0 && y>0)
                        Theta=180.0-Theta;
                    else
                        if(x<0 && y<0)
                            Theta+=180.0;
                        else
                            if(x>0 && y<0)
                                Theta=360.0-Theta;
                    System.out.println("Angulo del desplazamiento");
                    System.out.println(Double.toString(Theta)+"°");
                    System.out.println("Velocidad en x");
                    System.out.println(velocidad+" "+unidades);
                    double vy=gravedad*tiempo;
                    RCS = vy/Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    vy = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1));
                    System.out.println("Velocidad en Y");
                    System.out.println(Double.toString(vy)+" "+unidades);
                    x=velocidad;
                    double velocidadf=Math.sqrt((x*x)+(vy*vy));
                    RCS = velocidadf/Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
                    System.out.println("Velocidad resultante");
                    System.out.println((Double.toString(Result)+" "+unidades));

                    Phi = Math.atan2(Math.abs(vy), Math.abs(x));
                    Theta = Math.toDegrees(Phi); 
                    RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    if(x<0 && y>0)
                        Theta=180.0-Theta;
                    else
                        if(x<0 && vy<0)
                            Theta+=180.0;
                        else
                            if(x>0 && y<0)
                                Theta=360.0-Theta;
                    System.out.println("Angulo de la velocidad");
                    System.out.println(Double.toString(Theta)+"°");
                break;
                
            case 2: System.out.println("INGRESE LA VELOCIDAD INICIAL");
                    velocidad=dato.nextDouble();
                    System.out.println("INGRESE LAS UNIDADES");
                    unidades=dato.next();
                    System.out.println("INGRESE EL TIEMPO: ");
                    tiempo=dato.nextDouble();
                    segs=dato.next();
                    System.out.println("INGRESE EL ANGULO");
                    angulo=dato.next();
                    if(unidades.equals("m/s"))
                    {
                        unidadsalida="m";
                        gravedad=-9.8;
                    }
                    else
                        if(unidades.equals("ft/s"))
                        {
                            unidadsalida="ft";
                            gravedad=-32;
                        }
                    int indgrados=angulo.length()-1;
                    System.out.println(indgrados);
                    double grados=Double.parseDouble(angulo.substring(0, indgrados));
                    double AnguloRadianes = Math.toRadians(grados);  
                    double voy=velocidad;
                    velocidad=velocidad*Math.cos(AnguloRadianes);
                    voy=voy*Math.sin(AnguloRadianes);
                    x=tiempo*velocidad;
                    y=(tiempo*tiempo*gravedad/2)+(voy*tiempo);
                    desp=Math.sqrt((x*x)+(y*y));
                    RCS = x/Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
                    System.out.println("Desplazamiento en X");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));
                    RCS = y/Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                    System.out.println("Desplazamiento en Y");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));
                    RCS = desp/Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
                    System.out.println("Desplazamiento Resultante");
                    System.out.println((Double.toString(Result)+" "+unidadsalida));
                    Phi = Math.atan2(Math.abs(y), Math.abs(x));
                    Theta = Math.toDegrees(Phi); 
                    RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    if(x<0 && y>0)
                        Theta=180.0-Theta;
                    else
                        if(x<0 && y<0)
                            Theta+=180.0;
                        else
                            if(x>0 && y<0)
                                Theta=360.0-Theta;
                    System.out.println("Angulo del desplazamiento");
                    System.out.println(Double.toString(Theta)+"°");
                    RCS = velocidad/Math.pow(10,Math.floor(Math.log10(Math.abs(velocidad)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    velocidad = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(velocidad)))-(3-1));
                    System.out.println("Velocidad en x");
                    System.out.println(velocidad+" "+unidades);
                    vy=(gravedad*tiempo)+voy;
                    RCS = vy/Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    vy = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
                    System.out.println("Velocidad en Y");
                    System.out.println(Double.toString(vy)+" "+unidades);
                    x=velocidad;
                    velocidadf=Math.sqrt((x*x)+(vy*vy));
                    RCS = velocidadf/Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
                    System.out.println("Velocidad Resultante");
                    System.out.println((Double.toString(Result)+" "+unidades));
                    Phi = Math.atan2(Math.abs(vy), Math.abs(x));
                    Theta = Math.toDegrees(Phi); 
                    RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
                    if(x<0 && y>0)
                        Theta=180.0-Theta;
                    else
                        if(x<0 && vy<0)
                            Theta+=180.0;
                        else
                            if(x>0 && y<0)
                                Theta=360.0-Theta;
                    System.out.println("Angulo de la velocidad");
                    System.out.println(Double.toString(Theta)+"°");
                    tiempo=(-2*voy)/(-9.81);
                    RCS = tiempo/Math.pow(10,Math.floor(Math.log10(Math.abs(tiempo)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    tiempo = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(tiempo)))-(3-1)); 
                    System.out.println("Tiempo de caida");
                    System.out.println(Double.toString(tiempo));
                    double rangox=velocidad*tiempo;
                    RCS = rangox/Math.pow(10,Math.floor(Math.log10(Math.abs(rangox)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    rangox = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(rangox)))-(3-1));
                    System.out.println("Rango");
                    System.out.println(Double.toString(rangox));
                    double altmax=(tiempo*tiempo*gravedad/2)+(voy*tiempo);
                    RCS = altmax/Math.pow(10,Math.floor(Math.log10(Math.abs(altmax)))-(3-1)); 
                    RCS = Math.round(RCS); 
                    altmax = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(altmax)))-(3-1)); 
                    System.out.println("Altura maxima");
                    System.out.println(Double.toString(altmax));
                break;
            case 3:
                System.out.println("INGRESE LA ALTURA");
                double altura=dato.nextDouble();
                System.out.println("INGRESE LAS UNIDADES");
                unidades=dato.next();
                System.out.println("INGRESE EL TIEMPO");
                tiempo=dato.nextDouble();
                segs=dato.next();
                if(unidades.equals("m"))
                {
                    unidadsalida="m";
                    gravedad=9.8;
                }
                else
                    if(unidades.equals("ft"))
                    {
                        unidadsalida="ft";
                        gravedad=32;
                    }
                y=tiempo*tiempo*gravedad/2;
                 RCS = y/Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                RCS = Math.round(RCS); 
                y = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
                System.out.println("Desplazamiento en y");
                System.out.println((Double.toString(y)+" "+unidadsalida));
                vy=gravedad*tiempo;
                RCS = vy/Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
                RCS = Math.round(RCS); 
                vy = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
                System.out.println("Velocidad en y");
                System.out.println(Double.toString(vy)+" "+unidades);
                double tiempocaida=Math.sqrt((2*altura)/gravedad);
                RCS = tiempocaida/Math.pow(10,Math.floor(Math.log10(Math.abs(tiempocaida)))-(3-1)); 
                RCS = Math.round(RCS); 
                tiempocaida = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(tiempocaida)))-(3-1)); 
                System.out.println("Tiempo de caida");
                System.out.println((Double.toString(tiempocaida)+" S"));
            break;
        }
    }
    
}
