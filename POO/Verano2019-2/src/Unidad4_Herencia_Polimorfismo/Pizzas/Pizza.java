/*
 *UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 *FACULTAD DE INGENIERIA "ARTURO NARRO SILLER"
 *CURSOE DE VERANO 2019 - 2
 *PROGRAMACION ORIENTADA A OBJETOS
 *PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 *CONTACTO
 *NOMBRE: RODRIGUEZ ESPINOSA JORGE LUIS
 *MATRICULA: 2191330020
 *EQUIPO 5:
 *RODRIGUEZ ESPINOSA JORGE LUIS
 *ROSALES GARCIA RICARDO JAVIER
*/

package Unidad4_Herencia_Polimorfismo.Pizzas;


public class Pizza {
    private String numPizza;
    private int Masa;
    private String Nombre;
    private String NomServicio;

    public Pizza() {
    }

    public Pizza(String numPizza, int Masa, String Nombre, String NomServicio) {
        this.numPizza = numPizza;
        this.Masa = Masa;
        this.Nombre = Nombre;
        this.NomServicio = NomServicio;
    }

    public Pizza(String numPizza) {
        this.numPizza = numPizza;
    }

    public String getNumPizza() {
        return numPizza;
    }

    public int getMasa() {
        return Masa;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNomServicio() {
        return NomServicio;
    }

    public void setNumPizza(String numPizza) {
        this.numPizza = numPizza;
    }

    public void setMasa(int Masa) {
        this.Masa = Masa;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNomServicio(String NomServicio) {
        this.NomServicio = NomServicio;
    }
    
    
    
}
