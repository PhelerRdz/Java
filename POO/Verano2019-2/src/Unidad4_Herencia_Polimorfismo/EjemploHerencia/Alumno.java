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

package Unidad4_Herencia_Polimorfismo.EjemploHerencia;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Alumno extends Persona{
    
    private long matricula;
    private int cal1;
    private int cal2;
    private int cal3;
    
    public Alumno(){
        super(); //ejecuta el constructor vacio de la clase padre
    }
    
    public Alumno(long matricula){
        this.matricula = matricula;
    }
    
    public Alumno(long matricula, String curp){
        super(curp); //ejecuta constructor del padre con el identificador
        this.matricula = matricula;        
    }

    public Alumno(long matricula, int cal1, int cal2, int cal3, String curp, String nombre, int edad, double estatura) {
        super(curp, nombre, edad, estatura); //ejecuta constructor completo de la clase padre
        this.matricula = matricula;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getCal1() {
        return cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }
    
    
    
    
    
}
