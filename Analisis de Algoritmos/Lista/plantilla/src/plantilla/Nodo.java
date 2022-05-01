package plantilla;

public class Nodo {

    String Nombre;
    String Direccion;
    Nodo Izq, Der;

    public Nodo() {
    }

    public Nodo(String Nombre, String Direccion, Nodo Izq, Nodo Der) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Izq = Izq;
        this.Der = Der;
    }

    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }
}
