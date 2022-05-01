package UNIDAD_2_PA;
public class P02_Docente {
    private String MATRICULA;
    private String NOMBRE;
    private String APELLIDO_P;
    private String APELLIDO_M;
    private int HORAS;
    private double SALARIO_HORA;
    private int N_MATERIAS;
    private String TIPO;
    
    private final String PTC = "Profesor Tiempo Completo";
    private final String PMT = "Profesor Medio Tiempo";
    private final String PT = "Profesor Temporal";
    private final int MT = 10;

    public P02_Docente() {
    }

    public P02_Docente(String MATRICULA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, int HORAS, double SALARIO_HORA, int N_MATERIAS) {
        this.MATRICULA = MATRICULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.HORAS = HORAS;
        this.SALARIO_HORA = SALARIO_HORA;
        this.N_MATERIAS = N_MATERIAS;
        if (Integer.compare(this.HORAS * this.N_MATERIAS, MT) == 0) {
            this.TIPO = this.PMT;
        } else if (Integer.compare(this.HORAS * this.N_MATERIAS, MT) > 0) {
            this.TIPO = this.PTC;
        } else if (Integer.compare(this.HORAS * this.N_MATERIAS, MT) < 0) {
            this.TIPO = this.PT;
        }
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(String MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_P() {
        return APELLIDO_P;
    }

    public void setAPELLIDO_P(String APELLIDO_P) {
        this.APELLIDO_P = APELLIDO_P;
    }

    public String getAPELLIDO_M() {
        return APELLIDO_M;
    }

    public void setAPELLIDO_M(String APELLIDO_M) {
        this.APELLIDO_M = APELLIDO_M;
    }

    public int getHORAS() {
        return HORAS;
    }

    public void setHORAS(int HORAS) {
        this.HORAS = HORAS;
    }

    public double getSALARIO_HORA() {
        return SALARIO_HORA;
    }

    public void setSALARIO_HORA(double SALARIO_HORA) {
        this.SALARIO_HORA = SALARIO_HORA;
    }

    public int getN_MATERIAS() {
        return N_MATERIAS;
    }

    public void setN_MATERIAS(int N_MATERIAS) {
        this.N_MATERIAS = N_MATERIAS;
    }
    
    public double getSALARIO_TOTAL() {
        return this.SALARIO_HORA * this.HORAS * this.N_MATERIAS;
    }
    
    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }
    
    @Override
    public String toString() {
        return this.MATRICULA + " "
                + this.NOMBRE + " "
                + this.APELLIDO_P + " "
                + this.APELLIDO_M + " "
                + this.HORAS + " "
                + this.SALARIO_HORA + " "
                + this.N_MATERIAS + " "
                + this.TIPO;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!(obj instanceof P02_Docente)) {
            return false;
        }
        final P02_Docente other = (P02_Docente) obj;
        if (this.MATRICULA.compareTo(other.getMATRICULA()) == 0) {
            return false;
        }
        if (this.NOMBRE.compareTo(other.getNOMBRE()) == 0 &&
                this.APELLIDO_P.compareTo(other.getAPELLIDO_P()) == 0 &&
                this.APELLIDO_M.compareTo(other.getAPELLIDO_M()) == 0) {
            return false;
        }
        
        return true;
    }   
}
