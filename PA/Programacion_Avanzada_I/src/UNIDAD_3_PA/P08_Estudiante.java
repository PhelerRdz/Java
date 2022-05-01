/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;

/**
 *
 * @author GuillermoToledano
 */
public class P08_Estudiante {
    private String Matricula;
    private String Nombre;
    private String Apaterno;
    private String Amaterno;
    private String Carrera;
    private String Semestre;
    private int Long;

    public P08_Estudiante() {
    }

    public P08_Estudiante(String Matricula, String Nombre, String Apaterno, String Amaterno, String Carrera, String Semestre) {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }
    
    public int getLong() {
        return Long;
    }

    public void setLong(int Long) {
        this.Long = Long;
    }

    @Override
    public String toString() {
        return Matricula + " " + Nombre + " " + Apaterno + " " + Amaterno + " " 
                + Carrera + " " + Semestre;
    }
       
}
