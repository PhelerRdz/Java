/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 * 
 * EQUIPO
 * 
 * INTEGRANTES:
 * NOMBRE1
 * NOMBRE2
 * 
 * CONTACTO EQUIPO: 
 */

package Unidad2.ArreglosUnidimensionales;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class p16_PasoValorReferencia {     
//Ambitos
    
    static class Prueba{
        private int value;        

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }       
        
    }
    
    private static int v;
    
    public static void main(String[] args) {
        
    int a = 10;    
        v = 5;
    
        System.out.println("Prueba 0");
        System.out.println("valor : " + v);    
        ModificarNumero(v);
        System.out.println("valor : " + v);    
        
        System.out.println("\nPrueba 1");
        System.out.println("a : " + a);    
        ModificarNumero(a);
        System.out.println("a : " + a);
        
        System.out.println("\nPrueba 2");
        System.out.println("a : " + a);    
        CuadradoNumero(a);
        System.out.println("a : " + a);
        
        System.out.println("\nPrueba 3");
        System.out.println("a : " + a);    
        a = CuadradoNumero(a);
        System.out.println("a : " + a);
                
        
        int numeros[] = new int[]{12};
        System.out.println("\nPrueba 4");
        System.out.println("Primer Valor: " + numeros[0]);
        ModificarArreglo(numeros);
        System.out.println("Primer Valor: " + numeros[0]);
        
        //arreglo[0] = 15...
        
        System.out.println("\nPrueba 5");
        System.out.println("Primer Valor: " + numeros[0]);
        ModificarArregloV2(numeros);
        System.out.println("Primer Valor: " + numeros[0]);
        
        System.out.println("\nPrueba 6");
        Prueba pp = new Prueba();        
        System.out.println(pp.getValue());
        ModificarObjeto(pp);
        System.out.println(pp.getValue());
        
        /*
            CUANDO SE ENVÍA COMO ARGUMENTO EL VALOR DE UNA VARIABLE
            DE TIPO DE DATO PRIMITIVO, ENTONCES LA MODIFICACIÓN 
        QUE SUFRA EN EL MÉTODO NO SURTIRÁ EFECTO EN LA VARIABLE ENVIADA
        UNA VEZ QUE EL MÉTODO TERMINE.
        
           SIN EMBARGO, SI SE ENVÍA UN ARREGLO DE CUALQUIER TIPO O 
        UN OBJETO, LA MODIFICACIÓN SUFRIDA EN EL MÉTODO AFECTARÁ 
        AL ARREGLO U OBJETO ENVIADO UNA VEZ QUE EL MÉTODO TERMINO.
        ESTO DEBIDO A QUE SE ENVÍA LA LOCALIDAD DE MEMORIA DE ESTOS 
        EN LUGAR DE LA COPIA DE SU VALOR TAL COMO OCURRE EN EL CASO ANTERIOR.
        */
    }
    
    public static void ModificarNumero(int n){
            n = 20;  
            //a = 12; 
            v = 15;
    }

    private static int CuadradoNumero(int n) {
        return n * n;
    }
    
    
    private static void ModificarArreglo(int[] nums) {
        nums[0] = 15;
    }

    private static int[] ModificarArregloV2(int[] numeros) {
        int temp[] = numeros.clone();
        temp[0]= 8;
        return temp;
    }
    
    private static void ModificarObjeto(Prueba objeto) {
        objeto.setValue(25);
    }
    

    

    
    
    
    
}
