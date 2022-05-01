/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 */

package Unidad1.Clases;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Television {

    private String marca;
    private long numero_serie;
    private String resolucion;
    private String modelo;
    private float pulgadas;

    public Television() {
    }

    public Television(String marca, long numero_serie, String resolucion, String modelo, float pulgadas) {
        this.marca = marca;
        this.numero_serie = numero_serie;
        this.resolucion = resolucion;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public Television(long numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getMarca() {
        return marca;
    }

    public long getNumero_serie() {
        return numero_serie;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumero_serie(long numero_serie) {
        this.numero_serie = numero_serie;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Datos de la Television" + 
                "marca: " + marca +
                "numero_serie: " + numero_serie + 
                "resolucion: " + resolucion + 
                "modelo: " + modelo + 
                "pulgadas: " + pulgadas;
    }
    
    
    
}
