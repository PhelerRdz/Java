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
public class LanzadorAplicacion {
    
    public static void main(String[] args) {
        /*
        Se pueden crear variables (declaración) del tipo de dato de una clase.
        a estas variables se les conoce como "objetos" de la clase.
        
        En este sentido, a una clase se le conoce también como
        un tipo de dato abstracto
        */
        
        Animal animal1; //objeto Animal
        Animal animal2; //objeto Animal
        
        Animal animal4, animal3; //objetos Animal
        
        Animal animales[]; //arreglo de objetos Animal
        
        /*
        A UN OBJETO NO SE LE PUEDE ASGINAR UN VALOR DIRECTAMENTE.
        ES NECESARIO PREVIAMENTE REALIZAR UNA INSTANCIACIÓN 
        (CREACIÓN DE MEMORIA PARA UN OBJETO).
        
        NOTA. ES POSIBLE ASIGNAR A UN OBJETO UNA INSTANCIA
        DE LA CLASE DIRECTAMENTE OBTENIDA DESDE OTRO CONTEXTO.
       
        
        LA INSTANCIACIÓN DE UN OBJETO SE REALIZA MEDIANTE
        LA PALABRA RESERVADA "new" Y UN MÉTODO ESPECIAL
        NOMBRADO "CONSTRUCTOR". 
        
        por defectO TODA clase cuenta con un constructor 
        vacio que permite la instanciación de objetos de 
        dicha clase. Sin embargo, este constructor no 
        asigna los valores iniciales con base en los deseados 
        por el usuario, simplemente usa la memoria.
        
        EL CONSTRUCTOR DE UNA CLASE SIEMPRE LLEVA EL NOMBRE
        DE LA CLASE
        
        SE RECOMIENDA CREAR CONSTRUCTORES PERSONALIZADOS PARA
        LAS DIFERENTES ACTIVIDADES QUE SE REALICEN CON LA CLASE.
        */
        /*
        DEPURAR: 
        EN PROGRAMACIÓN ES EL PROCESO DE EJECUCIÓN PASO A PASO
        PARA CORROBORAR EL ADECUADO FUNCIONAMIENTO DE UN 
        PROGRAMA. SE REALIZA CON EL PROPOSITO DE IDENTIFICAR
        Y CORREGIR ERRORES. 
        */
        
        animal1 = new Animal(); //instanciado el objeto        
        
        animal2 = new Animal("poo21815", "Sarmiento", 1, "Perro", 5000);
        
        animales = new Animal[5]; //instanciado un arreglo        
        animales[0] = new Animal(); //instanciación del primer
        //objeto Animal del arreglo animales
                
        //INSTANCIAR UN OBJETO Y UN ARREGLO, NO ES LO MISMO..!!!!
        
        /*
        Asignación
        */
        
    }
    
}
