/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 * 
 * EQUIPO
 * 
 * INTEGRANTES:
 * NOMBRE1
 * NOMBRE2
 * 
 * CONTACTO EQUIPO: 
 */

package Unidad3_MetodosEspeciales.Ejemplo4;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class Pregunta implements Comparable<Pregunta> {

    private int ID;
    private String enunciado;
    private String respA;
    private String respB;
    private String respC;

    public Pregunta() {
    }

    public Pregunta(int ID) {
        this.ID = ID;
    }

    public Pregunta(int ID, String enunciado, String respA, String respB, String respC) {
        this.ID = ID;
        this.enunciado = enunciado;
        this.respA = respA;
        this.respB = respB;
        this.respC = respC;
    }

    public int getID() {
        return ID;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespA() {
        return respA;
    }

    public String getRespB() {
        return respB;
    }

    public String getRespC() {
        return respC;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setRespA(String respA) {
        this.respA = respA;
    }

    public void setRespB(String respB) {
        this.respB = respB;
    }

    public void setRespC(String respC) {
        this.respC = respC;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.ID;
        return hash;
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
        final Pregunta other = (Pregunta) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pregunta: "+ enunciado + "\n"
                + "Posibles Respuestas: "
                + "\n1.- " + respA + 
                  "\n2.- " + respB + 
                  "\n3.- " + respC;
    }

    @Override
    public int compareTo(Pregunta t) {
        return this.ID-t.getID();
    }
    
    
    
    
}
