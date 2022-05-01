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
public class Animal {

    //ATRIBUTOS 
    /*LOS ATRIBUTOS DEBEN SER "PRIVATE"
        DEBIDO AL CONCEPTO DE ENCAPSULAMIENTO.
    
        ÚNICAMANETE EN CIERTOS CASOS ESTO CAMBIA..
    */
    
    private String clave;
    private String nombre;
    private int edad;
    private String especie;
    private double peso;
    
    //MÉTODOS
    
    //CONSTRUCTOR
    
    //constructor vacio sin valores de inicialización
    //public Animal(){}
    
    //constructor vacio CON VALORES DE INICIALIZACIÓN
    public Animal(){
    clave = "vacio";
    nombre = "Solo Vino";
    edad = 2;
    especie = "Perro";
    peso = 4000;
    }
    
    //constructor con todos los atributos
    public Animal(String clave, String nombre, int edad, String especie, double peso){
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }
    
    //constructor con solo la clave
    public Animal(String claveAnimal){
        clave = claveAnimal;
    }
    
    /*se puede tener tantos constructores diferentes como se desee
    
    COMUNMENTE SE MANEJAN 3:
    
    -CONSTRUCTOR VACIO
    -CONSTRUCTOR CON LA CLAVE QUE IDENTIFICA A CADA OBJETO
    -COSTRUCTOR CON TODOS LOS ATRIBUTOS
    */
 
    /*
    para realizar una impresión en cadena de caracteres    
    de un objeto, se recomienda el empleo del método
    "toString". NO OBSTANTE, PUERE GENERAR SU PROPIO MÉTODO
    SI ASÍ LO DESEA.
*/
    
    @Override
    public String toString(){
        String texto = "\nNombre Mascota: " + nombre +
                       "\nEspecie: " + especie + 
                       "\nEdad: " + edad +
                       "\nPeso: " + peso +
                       "\nClave Mascota: " + clave;
        
        return texto;
    }
    
    
    //GETTERS O ACCESORES
    /*
    LOS GETTERS NOS PERMITEN CONOCER EL VALOR QUE 
    POSEE ALGUNO DE LOS ATRIBUTOS DEL OBJETO
    */
    //GENERALMENTE EN EL NOMBRE DEL MÉTODO LLEVAN LA PALABRA
    //"get". NO OBSTANTE NO ES NECESARIO QUE EL NOMBRE DEL 
    //MÉTODO SEA ESCRITO ASÍ, ESTO DEPENDE DEL PROGRAMADOR.
    //OTRAS OPCIÓN VALIDA PUEDE SER: obtenerClave
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getClave(){
        return clave;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    
    /*
    SETTERS O MUTADORES
    
    PERMITEN LA MODIFICACIÓN DE UN ATRIBUTO DEL OBJETO DE LA CLASE
    */
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    
    public void setEspecie(String esp){
        especie = esp;       
    }
    
    /*
    COMUNMENTE LA CLAVE O ATRIBUTO QUE SERÁ EMPLEADO
    PARA GARANTIZAR QUE UN OBJETO SEA ÚNICO, NO DEBERÍA 
    DE SER MODIFICABLE UNA VEZ QUE EL OBJETO HA SIDO GENERADO.
    */
    
    
    
}
