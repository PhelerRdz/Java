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

package Unidad3_MetodosEspeciales.Ejemplo1;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Alumno implements Comparable<Alumno> {
    
    private int ID;
    private String nombre;    
    private int cal1;
    private int cal2;
    private int cal3;
    private double promedio;    

    public Alumno() {
    }

    public Alumno(int ID) {
        this.ID = ID;
    }

    public Alumno(int ID, String nombre, int cal1, int cal2, int cal3) {
        this.ID = ID;
        this.nombre = nombre;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
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

    public double getPromedio() {
        return promedio;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "(" + ID + ") " + nombre + ". AVG: " + promedio;
    }
    
    public void calcularPromedio(){
    
        promedio = (cal1+cal2+cal3)/3;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
    //Método para Ordenamiento Natural
    /*
    El ordenamiento natural de los objetos, es aquel que consiste 
    en ordenarlos a trvés del atributo que permite diferenciar a 
    los distintos objetos.
    */

    /*
    SIEMPRE DEVUELVE UN VALOR IGUAL, MAYOR O MENOR A CERO 
    SEGÚN EL RESULTADO DE LA COMPARACIÓN...
    
    NOTA: DEBE DEVOLVER CERO SI Y SOLO SI, EQUALS 
    DEVUELVE TRUE EN LA MISMA COMPARACIÓN.
    */
    @Override
    public int compareTo(Alumno al) {
        return this.getID()-al.getID(); //numericas
        
        /*
        this    otro
        10       12      -2   
        12       10       2
        10       10       0 
        
        
        */
        
        //return this.getNombre().compareTo(al.getNombre()); //String
    }
        
    
    
}
