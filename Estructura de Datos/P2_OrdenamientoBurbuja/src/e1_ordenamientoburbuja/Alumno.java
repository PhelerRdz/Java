package e1_ordenamientoburbuja;

public class Alumno {
    private String nombre;
    private double calificacion;

    public Alumno() {}
    public Alumno(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
    public void Seteado(Alumno a){
         this.nombre = a.getNombre();
         this.calificacion = a.getCalificacion();
    }
}
