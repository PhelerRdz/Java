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
public class p6_BusquedaSecuencial {
    public static void main(String[] args) {
        /*
        
        CONSISTE EN LA BÚSQUEDA DE UN VALOR DENTRO DE UN VECTOR
        COMO RESULTADO PUEDEN OBTENERSE DOS POSIBILIDADES:
        
            - EL NÚMERO SE ENCUENTRA
                EXISTEN TRES VARIANTES POSIBLES CUANDO SE ENCUENTRA
                EL NÚMERO:
                    - RETORNAR EL NÚMERO (POCO USADA)
                    - RETORNAR LA POSICIÓN DEL NÚMERO (MÁS COMÚN)
                            EXISTEN DOS VARIANTES A ESTA ÚLTIMA:
                                -RETORNAR SOLO EL ÍNDICE DE LA PRIMERA APARICIÓN 
                                 DEL NÚMERO (MÁS COMÚN)
                                -RETORNAR LOS ÍNDICES DE TODAS LAS 
                                 APARICIONES DEL NÚMERO
                    -RETORNAR UN VALOR BOOLEANO QUE INDICA LA APARICIÓN DEL NÚMERO
            - EL NÚMERO NO SE ENCUENTRA
                    SE PUEDE INDICAR POR RETORNAR:
                        - UN VALOR BOOLEANO
                        - O UN -1
        
        FUNCIONAMIENTO:
        
            CONSISTE EN REALIZAR UN RECORRIDO (DE DERECHA A IZQUIERDA
            O IZQUIERDA A DERECHA) EN EL ARREGLO PREGUNTANDO EN CADA
            ITERACIÓN SI EL VALOR BÚSCADO COINDICE CON EL ELEMENTO DE 
            LA POSICIÓN ACTUAL.
            
            SI ENCUENTRA EL VALOR, EFECTÚA EL PROCIMIENTO ANTES DESCRITO.
        
        INCONVENIENTES:
            
            EN EL PEOR DE LOS CASOS, DEBE RECORRER TODO EL ARREGLO 
            PARA ENCONTRAR EL VALOR O PARA DARSE CUENTA QUE NO EXISTE EN EL 
            ARREGLO.
                    
        */
        
         int []numeros = new int[]{6,7,9,2,3,0,5,10,7,8};
        
         int valorBuscar = 7;
         //Falta agregar Lectura de Scanner
         int indice = busquedaSecuencial(valorBuscar, numeros);
         System.out.println("Resultado Busqueda: " + indice );
         
    }    
    
    public static int busquedaSecuencial(int dato, int[] numeros){        
        
        for (int i = 0; i < numeros.length-1; i++) {
            if (dato == numeros[i]) {
                return i;
            }
        }
        
        return -1;
    }
    
}
