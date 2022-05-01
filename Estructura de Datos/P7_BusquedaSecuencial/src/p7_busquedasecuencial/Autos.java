/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_busquedasecuencial;

/**
 *
 * @author jorge
 */
public class Autos {

    private final String Color;
    private final Integer Noasientos;
    private final String Modelo;

    public Autos(String Color, Integer Noasientos, String Modelo) {
        this.Color = Color;
        this.Noasientos = Noasientos;
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public Integer getNoasientos() {
        return Noasientos;
    }

    public String getModelo() {
        return Modelo;
    }

    
}
