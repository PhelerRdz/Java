package poo_u1_09_operacionesfracciones;


public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(){
    }
    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int nummerador) {
        this.numerador = nummerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fraccion suma(Fraccion b){
        Fraccion resultado=new Fraccion();
        int nuevoDenominador;
        int nuevoNumerador;
        nuevoDenominador = this.denominador * b.getDenominador();
        nuevoNumerador=this.numerador*b.getDenominador() +b.getNumerador()*this.denominador;
        resultado.setDenominador(nuevoDenominador);
        resultado.setNumerador(nuevoNumerador);
        return resultado;
    }
    //multiplicacion a/b*c/d=ac/bd
    //division a/b%c/d=ad/bc
    public Fraccion multipliacion(Fraccion b){
        Fraccion resultado=new Fraccion();
        int nuevoDenominador;
        int nuevoNumerador;
        nuevoDenominador=this.denominador*b.getDenominador();
        nuevoNumerador=this.numerador*b.getNumerador();
        resultado.setDenominador(nuevoDenominador);
        resultado.setNumerador(nuevoNumerador);
        return resultado;
    }
    public Fraccion division(Fraccion b){
        Fraccion resultado=new Fraccion();
        int nuevoDenominador;
        int nuevoNumerador;
        nuevoDenominador=this.denominador*b.getNumerador();
        nuevoNumerador=this.numerador*b.getDenominador();
        resultado.setDenominador(nuevoDenominador);
        resultado.setNumerador(nuevoNumerador);
        return resultado;
    }
}
