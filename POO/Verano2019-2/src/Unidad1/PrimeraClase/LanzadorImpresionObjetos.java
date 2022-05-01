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

package Unidad1.PrimeraClase;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class LanzadorImpresionObjetos {
    public static void main(String[] args) {
        Animal mascota;
        
        /*
        EL METODO "toString" SE MANDA LLAMAR DE 
        FORMA AUTOMÁTICA CUANDO SE IMPRIME UNA 
        VARIABLE DE TIPO OBJETO. 
        
        NOTA: PRESENTA "ERRORES" CUANDO LA CLASE
        DEL OBJETO NO TIENE DEFINIDO EL MÉTODO "toString".
        */
        
        mascota = new Animal("mascotaDefinitiva",
        "fifi", 1, "Loro", 3000);
        
        System.out.println("Mi mascota: " + mascota);
        
        System.out.println("");
        
        System.out.println("Mi mascota: " + mascota.toString());
        
    }
}
