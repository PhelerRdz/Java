package UNIDAD_2_PA;
public class Tarjeta_madre {
    private String ID;
    private String MARCA;
    private String MODELO;
    private String DIMENSIÓN;
    private double COSTO;

    public Tarjeta_madre() {
    }

    public Tarjeta_madre(String ID, String MARCA, String MODELO, String DIMENSIÓN, double COSTO) {
        this.ID = ID;
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.DIMENSIÓN = DIMENSIÓN;
        this.COSTO = COSTO;
    }

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

    public String getDIMENSIÓN() {
        return DIMENSIÓN;
    }

    public void setDIMENSIÓN(String DIMENSIÓN) {
        this.DIMENSIÓN = DIMENSIÓN;
    }

    public double getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(double COSTO) {
        this.COSTO = COSTO;
    }

    @Override
    public String toString() {
        return "Tarjeta_madre{" + "ID=" + ID + ", MARCA=" + MARCA + ", MODELO=" + MODELO + ", DIMENSI\u00d3N=" + DIMENSIÓN + ", COSTO=" + COSTO + '}';
    }
    
}
