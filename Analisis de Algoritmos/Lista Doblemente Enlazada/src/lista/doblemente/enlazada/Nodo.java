package lista.doblemente.enlazada;

public class Nodo {
    private Nodo next;
    private  Nodo back;
    private  String fact;

    public Nodo(Nodo sig, Nodo ant, String dat) {
        next = sig;
        back = ant;
        fact = dat;
    }
    
    public Nodo getNext(){
        return next;
    }

    public Nodo getBack() {
        return back;
    }

    public String getFact() {
        return fact;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
    
}
