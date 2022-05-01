/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpractico;

/**
 *
 * @author Salvador Segura
 */
public class inventario {
    public String PRODUCTO;
    public int CANTIDAD;
    
    public inventario(){
    }

    @Override
    public String toString() {
        return "PRODUCTO: " + PRODUCTO + ", CANTIDAD: " + CANTIDAD;
    }
    
}
