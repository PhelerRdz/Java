
package proyecto_unidad2;

import java.util.Scanner;

public class Proyecto_unidad2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        persona datos=new persona();
        persona[] array=new persona[20];
        int opc=0,tope=-1;
        do
        {
            System.out.println("Opciones");
            System.out.println("1. Agregar persona");
            System.out.println("2. Atender persona");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Salir");
            System.out.println("Digite su opcion: ");
            opc=Integer.parseInt(leer.nextLine());
            switch(opc)
            {
                case 1: 
                    if(tope<19)
                    {
                        System.out.println("Ingrese el nombre de la persona");
                        datos.NOMBRE=leer.nextLine();
                        while(datos.NOMBRE.length()<1)
                        {
                            System.out.println("No se ingreso la información esperada, vuelva a intentarlo");
                            datos.NOMBRE=leer.nextLine();
                        }
                        System.out.println("Ingrese el tipo de tarjeta");
                        System.out.println("1. Platinum, 2. Gold, 3. Ejecutiva, 4. Ninguna");
                        datos.TARJETA=Integer.parseInt(leer.nextLine());
                        while(datos.TARJETA<1 && datos.TARJETA>4)
                        {
                            System.out.println("No se ingreso la informacion esperada, vuelva a intentarlo");
                            System.out.println("Ingrese el tipo de tarjeta");
                            System.out.println("Platinum, Gold, Ejecutiva, Ninguna");
                            datos.TARJETA=Integer.parseInt(leer.nextLine());
                        }
                        System.out.println("Que tramite va a realizar");
                        System.out.println("1. Retirar dinero");
                        System.out.println("2. Tramite con mi cuenta bancaria");
                        System.out.println("3. Atención al cliente");
                        System.out.println("4. Apertura de cuenta");
                        System.out.println("5. Otros");
                        datos.TRAMITE=Integer.parseInt(leer.nextLine());
                        while(datos.TRAMITE>5 && datos.TRAMITE<1)
                        {
                            System.out.println("No se ingreso la información esperada, vuelva a intentarlo");
                            datos.TRAMITE=Integer.parseInt(leer.nextLine());
                        }
                        System.out.println("De cuanto tiempo dispone para esperar");
                        datos.TIEMPO=Integer.parseInt(leer.nextLine());
                        while(datos.TIEMPO<=0)
                        {
                            System.out.println("No se ingresó la informacion esperada, vuelva a intentarlo");
                            datos.TIEMPO=Integer.parseInt(leer.nextLine());
                        }
                        System.out.println("Le recordamos que en este banco las atenciones duran 5 minutos, esperamos comprenda que esto es para mejorar la calidad en el servicio, por su comprensión muchas gracias");
                        tope++;
                        array[tope]=datos;
                        datos=null;
                        datos=new persona();
                    }
                    else
                        System.out.println("Lo sentimos, ya no hay turnos disponibles, vuelva mas tarde");
                break;
                case 2: 
                    if(tope>-1)
                    {
                        System.out.println("Que tipo de tarjeta voy a atender");
                        System.out.println("1. PLATINUM, 2. GOLD, 3. EJECUTIVA, 4. NINGUNA");
                        int atender=Integer.parseInt(leer.nextLine());
                        while(atender<1 && atender>4)
                        {
                            System.out.println("No se ingreso la informacion esperada, vuelva a intentarlo");
                            System.out.println("Ingrese el tipo de tarjeta");
                            System.out.println("Platinum, Gold, Ejecutiva, Ninguna");
                            atender=Integer.parseInt(leer.nextLine());
                        }
                        int atender_tramite;
                        System.out.println("Que tramite voy a atender");
                        System.out.println("1. Retirar dinero");
                        System.out.println("2. Tramite con mi cuenta bancaria");
                        System.out.println("3. Atención al cliente");
                        System.out.println("4. Apertura de cuenta");
                        System.out.println("5. Otros");
                        atender_tramite=Integer.parseInt(leer.nextLine());
                        while(atender_tramite<1 && atender_tramite>5)
                        {
                            System.out.println("No se ingreso la información esperada, vuelva a intentarlo");
                            atender_tramite=Integer.parseInt(leer.nextLine());
                        }
                        System.out.println("Cuantas personas puedo atender en dicho tramite");
                        int cantidad=Integer.parseInt(leer.nextLine());
                        while(cantidad<1)
                        {
                            System.out.println("Cantidad de personas por atender, no valida, vuelva a intentarlo");
                            cantidad=Integer.parseInt(leer.nextLine());
                        }
                        int flag=1;
                        int i=0;
                        while(flag==1){
                            if(array[i].TARJETA==atender && array[i].TRAMITE==atender_tramite && cantidad>0)
                            {
                                System.out.println("Se esta atendiendo a la persona:");
                                    System.out.println("NOMBRE: "+array[i].NOMBRE+" TARJETA "+array[i].TARJETA);
                                for (int j = i; j < tope; j++) {
                                    array[j]=array[j+1];
                                }
                                array[tope]=null;
                                tope--;
                                i=0;
                                cantidad--;
                            }
                            else
                                i++;
                            if(i>tope)
                                flag=0;
                        }
                        cantidad=0;
                        for (i = 0; i <=tope; i++) {
                            array[i].TIEMPO=array[i].TIEMPO-5;
                            if(array[i].TIEMPO<=0)
                            {
                                System.out.println("La persona "+array[i].NOMBRE +" ya se canso de esperar y se va");
                                for (int j = i; j < tope; j++) {
                                    array[j]=array[j+1];
                                }
                                array[tope]=null;
                                tope--;
                                i=i-1;
                            }
                        }
                    }
                    else
                        System.out.println("No hay gente por atender");
                break;
                case 3:
                    if(tope>-1)
                    {
                        System.out.println("Personas que quedan en la fila");
                        for (int i = 0; i <=tope; i++) {
                            System.out.println("Nombre " + array[i].NOMBRE + " Tipo de tarjeta "+array[i].TARJETA + " id de tramite " + array[i].TRAMITE + " tiempo de paciencia/espera " + array[i].TIEMPO);
                        }
                    }
                    else
                        System.out.println("No hay personas en la fila");
                break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de atención al cliente, hasta mañana");
                break;
                default: 
                    System.out.println("Opción no válida, se volvera a mostrar el menu");
                break;
            }
        }while(opc!=4);
    }
    
}
