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
public class Persona {
        private String curp;
        private String nombre;
        private int edad;
        private double estatura;        

    public Persona() {
    }

    public Persona(String curp) {
        this.curp = curp;
    }

    
    public Persona(String curp, String nombre, int edad, double estatura) {
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getCurp() {
        return curp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    
        
}
