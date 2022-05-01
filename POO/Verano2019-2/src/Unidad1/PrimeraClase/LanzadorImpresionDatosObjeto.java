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
public class LanzadorImpresionDatosObjeto {
    public static void main(String[] args) {
        
        //declaración
        Animal mascotaAlex;
        Animal mascotaRubisel;
        
        //instanciación 
        mascotaAlex = new Animal("mascota1","jake", 1, "Perro", 3000);
        mascotaRubisel = new Animal("mascota2","pedro", 2, "Gato", 5000);
                 
        //
        //System.out.println(mascota);
        
        System.out.println("Mascota de Alex");
        System.out.println("El nombre de la mascota es: " + mascotaAlex.getNombre());        
        System.out.println("El peso de la mascota es: " + mascotaAlex.getPeso() + " gramos.");
        
        System.out.println("");
        
        System.out.println("Mascota de Rubisel");
        System.out.println("El nombre de la mascota es: " + mascotaRubisel.getNombre());        
        System.out.println("El peso de la mascota es: " + mascotaRubisel.getPeso() + " gramos.");
        
    }
}
