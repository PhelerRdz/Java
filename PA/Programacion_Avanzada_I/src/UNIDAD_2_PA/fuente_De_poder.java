package UNIDAD_2_PA;
public class fuente_De_poder {
    private String ID;
    private String MARCA;
    private String MODELO;
    private int WATTS;
    private double COSTO;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public int getWATTS() {
        return WATTS;
    }

    public void setWATTS(int WATTS) {
        this.WATTS = WATTS;
    }

    public double getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(double COSTO) {
        this.COSTO = COSTO;
    }

    @Override
    public String toString() {
        return "fuente_De_poder{" + "ID=" + ID + ", MARCA=" + MARCA + ", MODELO=" + MODELO + ", WATTS=" + WATTS + ", COSTO=" + COSTO + '}';
    }

    public fuente_De_poder() {
    }

    public fuente_De_poder(String ID, String MARCA, String MODELO, int WATTS, double COSTO) {
        this.ID = ID;
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.WATTS = WATTS;
        this.COSTO = COSTO;
    }
    
}
