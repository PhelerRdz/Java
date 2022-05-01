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

package Unidad3_MetodosEspeciales.Ejemplo2;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Computadora 
       implements Comparable<Computadora> {

    //atributos                  Abstracción-Encapsulamiento
    private int NoSerie;
    private String modelo;
    private String marca;
    private int capacidad;
    private String procesador;
    private int ram;
    
    // Constructors
    //Vacio
    public Computadora() {
    }
    //con ID
    public Computadora(int NoSerie) {
        this.NoSerie = NoSerie;
    }
    //con todos los atributos
    public Computadora(int NoSerie, String modelo, String marca, int capacidad, String procesador, int ram) {
        this.NoSerie = NoSerie;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.procesador = procesador;
        this.ram = ram;
    }
    
    //Getters

    public int getNoSerie() {
        return NoSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }
    
    
    //Setters

    public void setNoSerie(int NoSerie) {
        this.NoSerie = NoSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    //toString 
    //REPRESENTACIÓN EN CADENA DE CARACTERES(STRING) DE UN OBJETO
    @Override
    public String toString() {
        return "(" + NoSerie + ") Modelo: " + modelo + ", Marca: " + marca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.NoSerie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //checa que sea el mismo objeto
            return true;
        }
        if (obj == null) { //checa que el segundo objeto sea null
            return false;
        }
        if (getClass() != obj.getClass()) { //checa que sean de diferente clase
            return false;
        }
        final Computadora other = (Computadora) obj;
        if (this.NoSerie != other.NoSerie) {
            return false;
        }
        return true;
    }

    
    @Override
    public int compareTo(Computadora t) {
        return this.NoSerie-t.getNoSerie();
        
        //Enteros  -- int  long, byte short, char
        //a - b
            
        //Reales -- double
        //Double.compare(a,b);
        
        //String
        //a.compareTo(b);
        
    }
    
    
    
    
    
    
    
    
    
}
