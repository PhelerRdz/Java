/**@author 2183330170 Zubiri Valdez Hedson Leonardo Zubiri*/
package proyecto_1_u3_listas_enlazadas;

public class Operador {
    String nombre; int id;
    int numClientesAtendidos;
    boolean ocupado=false;
    Cliente primerAtendido=null,ultimoAtendido=null;
    
    Operador(String nombre,int id){
        this.nombre=nombre;
        this.id=id;
    }
}
