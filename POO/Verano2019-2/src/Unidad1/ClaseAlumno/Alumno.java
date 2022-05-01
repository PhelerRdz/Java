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

package Unidad1.ClaseAlumno;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Alumno {

    //ATRIBUTOS
    private long matricula;
    private String nombre;
    private int semestre;
    private double promedio;
    private String carrera;
    
    //CONSTRUCTORES (3) vacio, completo y con clave única (matricula)
    
    /**
     * 
     */
    public Alumno(){
    
    }
    
    /**
     * ESTE ES UN CONSTRUCTOR CON TODOS LOS PARÁMETROS PARA
     * LA INSTANCIACIÓN DE UN OBJETO DE TIPO ALUMNO.
     * 
     * MÉTODO GENERADO EL DÍA 10 DE JUNIO DEL 2019
     * 
     * @param m MATRICULA
     * @param n NOMBRE
     * @param s SEMESTRE
     * @param p PROMEDIO
     * @param c CARRERA   
     * 
     */
    public Alumno(long m, String n, int s, double p, String c){
    
    }
    
    /**
     * 
     * @param m 
     */
    public Alumno(long m){
    
    }
    
    //GETTERS (1 por cada atributo de la clase.)
    /**
     * 
     * @return 
     */
    public long getMatricula(){
        return matricula;
    }
    
    
    //SETTERS (1 por cada atributo a expceción del de la clave única)
    /**
     * 
     * @param n 
     */
    public void setNombre(String n){
        nombre = n;
    }
    
    //TOSTRING
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Datos del Alumno : \n " +
               "Matricula: " + matricula + "\n" +
               "Nombre: " + nombre  + "\n";               
    }
    
}
