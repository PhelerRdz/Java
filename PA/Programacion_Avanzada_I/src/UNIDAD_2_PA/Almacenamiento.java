package UNIDAD_2_PA;
public class Almacenamiento {
    private String MARCA;
    private String CAPACIDAD;
    private String TIPO;
    private double COSTO;
    private String ID;

    @Override
    public String toString() {
        return "Almacenamiento{" + "MARCA=" + MARCA + ", CAPACIDAD=" + CAPACIDAD + ", TIPO=" + TIPO + ", COSTO=" + COSTO + ", ID=" + ID + '}';
    }

    public Almacenamiento(String MARCA, String CAPACIDAD, String TIPO, double COSTO, String ID) {
        this.MARCA = MARCA;
        this.CAPACIDAD = CAPACIDAD;
        this.TIPO = TIPO;
        this.COSTO = COSTO;
        this.ID = ID;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getCAPACIDAD() {
        return CAPACIDAD;
    }

    public void setCAPACIDAD(String CAPACIDAD) {
        this.CAPACIDAD = CAPACIDAD;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public double getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(double COSTO) {
        this.COSTO = COSTO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Almacenamiento() {
    }
    
}
