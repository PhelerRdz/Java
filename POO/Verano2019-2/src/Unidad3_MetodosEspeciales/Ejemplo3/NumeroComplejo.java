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

package Unidad3_MetodosEspeciales.Ejemplo3;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class NumeroComplejo implements Comparable<NumeroComplejo> {

    //ID => obtenido apartir de una combinación de atributos..
    private double parte_real;
    private double parte_imaginaria;

    public NumeroComplejo() {
    }

    public NumeroComplejo(double parte_real, double parte_imaginaria) {
        this.parte_real = parte_real;
        this.parte_imaginaria = parte_imaginaria;
    }

    public double getParte_real() {
        return parte_real;
    }

    public double getParte_imaginaria() {
        return parte_imaginaria;
    }

    public void setParte_real(double parte_real) {
        this.parte_real = parte_real;
    }

    public void setParte_imaginaria(double parte_imaginaria) {
        this.parte_imaginaria = parte_imaginaria;
    }

    //Z = a+bi
    @Override
    public String toString() {
        return "Z = " + parte_real + " + " + parte_imaginaria + "i";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.parte_real) ^ (Double.doubleToLongBits(this.parte_real) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.parte_imaginaria) ^ (Double.doubleToLongBits(this.parte_imaginaria) >>> 32));
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
        final NumeroComplejo other = (NumeroComplejo) obj;
        if (Double.doubleToLongBits(this.parte_real) != Double.doubleToLongBits(other.parte_real)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parte_imaginaria) != Double.doubleToLongBits(other.parte_imaginaria)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(NumeroComplejo t) {
        
        String aux = parte_real+"+"+parte_imaginaria;
        String aux2 = t.getParte_real()+"+"+ t.getParte_imaginaria();
        
        return aux.compareTo(aux2);
        
    }
    
    public void suma(NumeroComplejo z){
        this.parte_real = this.parte_real + z.getParte_real();
        this.parte_imaginaria = this.parte_imaginaria + z.getParte_imaginaria();
        
    }
    
    
    
    
    
}
