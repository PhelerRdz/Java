package UNIDAD_2_PA;
public class Memoria {
    private String ID;
    private String MARCA;
    private String DIMENSIÓN;
    private double COSTO;
    private String CAPACIDAD;
    private String GENERACIÓN;

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

    public String getCAPACIDAD() {
        return CAPACIDAD;
    }

    public void setCAPACIDAD(String CAPACIDAD) {
        this.CAPACIDAD = CAPACIDAD;
    }

    public String getGENERACIÓN() {
        return GENERACIÓN;
    }

    public void setGENERACIÓN(String GENERACIÓN) {
        this.GENERACIÓN = GENERACIÓN;
    }

    @Override
    public String toString() {
        return "Memoria{" + "ID=" + ID + ", MARCA=" + MARCA + ", DIMENSI\u00d3N=" + DIMENSIÓN + ", COSTO=" + COSTO + ", CAPACIDAD=" + CAPACIDAD + ", GENERACI\u00d3N=" + GENERACIÓN + '}';
    }

    public Memoria() {
    }

    public Memoria(String ID, String MARCA, String DIMENSIÓN, double COSTO, String CAPACIDAD, String GENERACIÓN) {
        this.ID = ID;
        this.MARCA = MARCA;
        this.DIMENSIÓN = DIMENSIÓN;
        this.COSTO = COSTO;
        this.CAPACIDAD = CAPACIDAD;
        this.GENERACIÓN = GENERACIÓN;
    }
    
}
