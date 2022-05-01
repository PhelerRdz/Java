/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_metodoshell;

/**
 *
 * @author Pheler
 */
public class Clientes {
    public Integer Saldo;
    public String Nombre, Telefono;

    public Clientes() {
    }
    public Clientes(Integer Saldo, String Nombre, String Telefono) {
        this.Saldo = Saldo;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public Integer getSaldo() {
        return Saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setSaldo(Integer Saldo) {
        this.Saldo = Saldo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
