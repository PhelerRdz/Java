/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_3_PA;

/**
 *
 * @author Angel
 */
public class Libro {
    
    // Atributos
    private String Autor;
    private String Titulo;
    private String Edicion;
    private String Editorial;
    private String Pais;
    private String ISBN;
    private int Numero_Pagina;

    // Constructor vacío
    public Libro() {
    }
    
    //Constructor lleno
    public Libro(String Autor, String Titulo, String Edicion, String Editorial, String Pais, String ISBN, int Numero_Pagina) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Edicion = Edicion;
        this.Editorial = Editorial;
        this.Pais = Pais;
        this.ISBN = ISBN;
        this.Numero_Pagina = Numero_Pagina;
    }

    // Getters y Setters
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_Pagina() {
        return Numero_Pagina;
    }

    public void setNumero_Pagina(int Numero_Pagina) {
        this.Numero_Pagina = Numero_Pagina;
    }
    
    //toString
    @Override
    public String toString() {
        return "Datos del Libro\n\n" + 
               "Autor: " + Autor + 
               "\nTitulo: " + Titulo + 
               "\nEdicion: " + Edicion + 
               "\nEditorial: " + Editorial + 
               "\nPais: " + Pais + 
               "\nISBN: " + ISBN + 
               "\nNumero de Paginas: " + Numero_Pagina;
    }
    
}
