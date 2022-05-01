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
package Unidad5_Excepciones;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Main_Excepciones {

    public static void main(String[] args) {

        Excepciones_Ejemplo ex;
        ex = new Excepciones_Ejemplo();

        try {
            ex.metodo1();
        } catch (NumberFormatException e){
            
            System.out.println("Error de Seguridad");
            
        }  catch (SecurityException  e) {
            
            //System.out.println(e.toString());
            System.out.println("Error de Formato");
            
        } catch (Exception e) {
            
            //System.out.println(er.toString());
            System.out.println("Error");
            
        }
        finally {
            
            System.out.println("Fin Método");
            
        }

    }
}
