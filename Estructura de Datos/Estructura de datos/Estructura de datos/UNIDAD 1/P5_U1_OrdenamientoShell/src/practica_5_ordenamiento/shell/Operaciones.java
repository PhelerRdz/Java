/**@author 2183330170 Zubiri Valdez Hedson Leonardo Zubiri*/
package practica_5_ordenamiento.shell;

public class Operaciones {
    
    public static void shellClaseOrderBySaldo(Cliente []A,int orden){
        int salto,i; Cliente aux;
        boolean cambio;
        int N = A.length;
        for (salto = N/2; salto!=0; salto/=2) {
            cambio=true;
            while (cambio) {
                cambio=false;
                for (i = salto; i < N; i++) {
                    switch (orden) {
                        case 1:
                            //Ascendente
                            if (A[i-salto].saldo > A[i].saldo) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        case 2:
                            //Descendente
                            if (A[i-salto].saldo < A[i].saldo) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        default:
                            System.out.println("Opcion no Valida");;
                    }
                    
                }
            }
        }
    }
    public static void shellClaseOrderByTel(Cliente []A,int orden){
        int salto,i; Cliente aux;
        boolean cambio;
        int N = A.length;
        for (salto = N/2; salto!=0; salto/=2) {
            cambio=true;
            while (cambio) {
                cambio=false;
                for (i = salto; i < N; i++) {
                    switch (orden) {
                        case 1:
                            //Ascendente
                            if (A[i-salto].telefono > A[i].telefono) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        case 2:
                            //Descendente
                            if (A[i-salto].saldo < A[i].telefono) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        default:
                            System.out.println("Opcion no Valida");;
                    }
                    
                }
            }
        }
    }
    
    public static void shellClaseOrderByNombre(Cliente []A,int orden){
        int salto,i; Cliente aux; int a;
        boolean cambio;
        int N = A.length;
        for (salto = N/2; salto!=0; salto/=2) {
            cambio=true;
            while (cambio) {
                cambio=false;
                for (i = salto; i < N; i++) {
                    switch (orden) {
                        case 1:
                            //Ascendente
                            a=A[i-salto].nombre.compareTo(A[i].nombre);
                            if (a>0) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        case 2:
                            //Descendente
                            a=A[i-salto].nombre.compareTo(A[i].nombre);
                            if (a<0) {
                                aux=A[i];
                                A[i]=A[i-salto];
                                A[i-salto]=aux;
                            }
                            break;
                        default:
                            System.out.println("Opcion no Valida");;
                    }
                    
                }
            }
        }
    }
    
     public static void shellSortSaldo( Cliente b[ ],int orden){
        if (orden==1) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&tmp.saldo<b[j-k].saldo; j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        } else if (orden==2) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&tmp.saldo>b[j-k].saldo; j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        }      
    }
        
    public static void shellSortTel( Cliente b[ ],int orden){
        if (orden==1) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&tmp.telefono<b[j-k].telefono; j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        } else if (orden==2) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&tmp.telefono>b[j-k].telefono; j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        }      
    }
    
    public static void shellSortNombre( Cliente b[ ],int orden){
        if (orden==1) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&(tmp.nombre.compareTo(b[j-k].nombre)>0); j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        } else if (orden==2) {
            for(int k= b.length/2; k>0; k=k==2?1:(int)( k/2.2)){
            for(int i=k;i<b.length; i++ ){
            Cliente tmp =b[i];
            int j;
                for(j=i; j>=k&&(tmp.nombre.compareTo(b[j-k].nombre)<0); j-=k){
                b[j]=b[j-k];
                }
                b[j]=tmp;
            }
          }
        }      
    }
    
    public static void imprimirArreglo(Cliente A[]){
        for (int i = 0; i < A.length; i++) {
        System.out.println(" "+A[i].nombre + "  $"+A[i].saldo+"  "+A[i].telefono);
        }
    }
    
    public static void shellSort (Cliente a[],int cualShell,int tipoOrden, int parametroOrden){
        switch(cualShell){
            case 1: 
                switch(parametroOrden){
                    case 3: 
                        shellClaseOrderByNombre(a, tipoOrden);
                        break;
                    case 4: 
                        shellClaseOrderBySaldo(a, tipoOrden);
                        break;
                    case 5: 
                        shellClaseOrderByTel(a, tipoOrden);
                        break;
                }
                break;
            case 2:
                switch(parametroOrden){
                    case 3: 
                        shellSortNombre(a, tipoOrden);
                        break;
                    case 4: 
                        shellSortSaldo(a, tipoOrden);
                        break;
                    case 5: 
                        shellSortTel(a, tipoOrden);
                        break;
                }
                break;
        }
    }
}
