package UNIDAD_2_PA;
public class P03_Procesador {
    private String MARCA;
    private String MODELO;
    private String GENERACION;
    private double GHz;
    private int CORES;
    private int THREADS;
    private boolean APU;
    private double COST;

    public P03_Procesador() {
    }

    public P03_Procesador(String MARCA, String MODELO, String GENERACION, double GHz, int CORES, int THREADS, boolean APU, double COST) {
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.GENERACION = GENERACION;
        this.GHz = GHz;
        this.CORES = CORES;
        this.THREADS = THREADS;
        this.APU = APU;
        this.COST = COST;
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

    public String getGENERACION() {
        return GENERACION;
    }

    public void setGENERACION(String GENERACION) {
        this.GENERACION = GENERACION;
    }

    public double getGHz() {
        return GHz;
    }

    public void setGHz(double GHz) {
        this.GHz = GHz;
    }

    public int getCORES() {
        return CORES;
    }

    public void setCORES(int CORES) {
        this.CORES = CORES;
    }

    public int getTHREADS() {
        return THREADS;
    }

    public void setTHREADS(int THREADS) {
        this.THREADS = THREADS;
    }

    public boolean isAPU() {
        return APU;
    }

    public void setAPU(boolean APU) {
        this.APU = APU;
    }

    public double getCOST() {
        return COST;
    }

    public void setCOST(double COST) {
        this.COST = COST;
    }
    
    @Override
    public String toString() {
        return this.MARCA + " " + this.MODELO;
    }
}
