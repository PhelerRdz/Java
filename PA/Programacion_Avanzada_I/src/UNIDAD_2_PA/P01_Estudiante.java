package UNIDAD_2_PA;
import java.util.Objects;
public class P01_Estudiante {

    // Atributos
    private String MATRICULA;
    private String NOMBRE;
    private String APELLIDO_P;
    private String APELLIDO_M;
    private char GENERO;
    private String CARRERA;
    private String SEMESTRE;
    private boolean BECARIO;
    private double PROMEDIO;
    private String CORREO;
    
    // Constructor predeterminado
    public P01_Estudiante() {
    }

    // Constructor inicualizador
    public P01_Estudiante(String MATRICULA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, char GENERO) {
        this.MATRICULA = MATRICULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.GENERO = GENERO;
    }

    public P01_Estudiante(String MATRICULA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, char GENERO, String CARRERA, String SEMESTRE, String CORREO) {
        this.MATRICULA = MATRICULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.GENERO = GENERO;
        this.CARRERA = CARRERA;
        this.SEMESTRE = SEMESTRE;
        this.CORREO = CORREO;
    }

    public P01_Estudiante(String MATRICULA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, char GENERO, String CARRERA, String SEMESTRE, boolean BECARIO, double PROMEDIO, String CORREO) {
        this.MATRICULA = MATRICULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.GENERO = GENERO;
        this.CARRERA = CARRERA;
        this.SEMESTRE = SEMESTRE;
        this.BECARIO = BECARIO;
        this.PROMEDIO = PROMEDIO;
        this.CORREO = CORREO;
    }

    // Setter & Getters
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

    public char getGENERO() {
        return GENERO;
    }

    public void setGENERO(char GENERO) {
        this.GENERO = GENERO;
    }

    public String getCARRERA() {
        return CARRERA;
    }

    public void setCARRERA(String CARRERA) {
        this.CARRERA = CARRERA;
    }

    public String getSEMESTRE() {
        return SEMESTRE;
    }

    public void setSEMESTRE(String SEMESTRE) {
        this.SEMESTRE = SEMESTRE;
    }

    public boolean isBECARIO() {
        return BECARIO;
    }

    public void setBECARIO(boolean BECARIO) {
        this.BECARIO = BECARIO;
    }

    public double getPROMEDIO() {
        return PROMEDIO;
    }

    public void setPROMEDIO(double PROMEDIO) {
        this.PROMEDIO = PROMEDIO;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    @Override
    public String toString() {
        return this.MATRICULA + "\t"
                + this.NOMBRE + "\t"
                + this.APELLIDO_P + "\t"
                + this.APELLIDO_M + "\t" 
                + this.GENERO + "\t"
                + this.CARRERA + "\t"
                + this.SEMESTRE + "\t"
                + this.BECARIO + "\t"
                + this.PROMEDIO + "\t"
                + this.CORREO;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final P01_Estudiante other = (P01_Estudiante) obj;
        if (this.GENERO != other.GENERO) {
            return false;
        }
        if (this.BECARIO != other.BECARIO) {
            return false;
        }
        if (Double.doubleToLongBits(this.PROMEDIO) != Double.doubleToLongBits(other.PROMEDIO)) {
            return false;
        }
        if (!Objects.equals(this.MATRICULA, other.MATRICULA)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE, other.NOMBRE)) {
            return false;
        }
        if (!Objects.equals(this.APELLIDO_P, other.APELLIDO_P)) {
            return false;
        }
        if (!Objects.equals(this.APELLIDO_M, other.APELLIDO_M)) {
            return false;
        }
        if (!Objects.equals(this.CARRERA, other.CARRERA)) {
            return false;
        }
        if (!Objects.equals(this.SEMESTRE, other.SEMESTRE)) {
            return false;
        }
        if (!Objects.equals(this.CORREO, other.CORREO)) {
            return false;
        }
        return true;
    }    
}
