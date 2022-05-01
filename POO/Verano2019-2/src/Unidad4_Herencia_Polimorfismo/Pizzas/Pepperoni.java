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


public class Pepperoni extends Pizza{
    private int numpedido;
    private int precio;
    private String queso;
    private int rebanadas;
    private String ingrincipal;

    public Pepperoni() {
        super();
    }

    public Pepperoni(int numpedido, String numPizza) {
        super(numPizza);
        this.numpedido = numpedido;
    }

    public Pepperoni(int numpedido, int precio, String queso, int rebanadas, String ingrincipal, String numPizza, int Masa, String Nombre, String NomServicio) {
        super(numPizza, Masa, Nombre, NomServicio);
        this.numpedido = numpedido;
        this.precio = precio;
        this.queso = queso;
        this.rebanadas = rebanadas;
        this.ingrincipal = ingrincipal;
    }
    
    
}
