package UNIDAD_2_PA;
public class P03_PC {
    private String ID;
    private String MARCA;
    private String MODELO;
    private String ANIO;
    private final double COST = 200;
    private P03_Procesador PROC;
    private Almacenamiento ALM;
    private Memoria MEMO;
    private Tarjeta_madre MADRE;
    private fuente_De_poder fuente;
    public P03_PC() {
        
    }

    public Almacenamiento getALM() {
        return ALM;
    }

    public void setALM(Almacenamiento ALM) {
        this.ALM = ALM;
    }

    public Memoria getMEMO() {
        return MEMO;
    }

    public void setMEMO(Memoria MEMO) {
        this.MEMO = MEMO;
    }

    public Tarjeta_madre getMADRE() {
        return MADRE;
    }

    public void setMADRE(Tarjeta_madre MADRE) {
        this.MADRE = MADRE;
    }

    public fuente_De_poder getFuente() {
        return fuente;
    }

    public void setFuente(fuente_De_poder fuente) {
        this.fuente = fuente;
    }

    public P03_PC(String ID, String MARCA, String MODELO, String ANIO, P03_Procesador PROC) {
        this.ID = ID;
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.ANIO = ANIO;
        this.PROC = PROC;
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

    public String getANIO() {
        return ANIO;
    }

    public void setANIO(String ANIO) {
        this.ANIO = ANIO;
    }

    public P03_Procesador getPROC() {
        return PROC;
    }

    public void setPROC(P03_Procesador PROC) {
        this.PROC = PROC;
    }
    

    
    @Override
    public String toString() {
        return this.ID + " " + this.MARCA + " " + this.MODELO + " " + this.ANIO + " " + this.PROC;
    }

    public double getCOST() {
        double cost = this.COST;
        System.out.println("Almacenamiento " + this.ALM.getCOSTO());
        System.out.println(" tarjeta madre " +this.MADRE.getCOSTO());
        System.out.println("memoria" + this.MEMO.getCOSTO());
        System.out.println("procesador "+ this.PROC.getCOST());
        System.out.println("Fuente de poder "+this.fuente.getCOSTO());
        cost += (this.PROC.getCOST()+this.ALM.getCOSTO()+this.MADRE.getCOSTO()+this.MEMO.getCOSTO()+this.fuente.getCOSTO());
        return cost;
    }
}
