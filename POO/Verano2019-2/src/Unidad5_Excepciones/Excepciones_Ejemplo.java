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
public class Excepciones_Ejemplo {
        
    public void metodo1() throws NumberFormatException, SecurityException{
        System.out.println("metodo 1");
        metodo2();
    }
    
    public void metodo2() throws NumberFormatException
    {
        System.out.println("metodo 2");
        metodo3();                
        
        /*
        try{        
            metodo3();                
        }
        catch(NumberFormatException ex){
            System.out.println("Error");            
        }
        */
    }
    
    public void metodo3() throws NumberFormatException{
        System.out.println("metodo 3");
        metodo4();
    }
    
    public void metodo4() throws NumberFormatException{
        System.out.println("metodo 4");
        throw new NumberFormatException();
    }
    
}
