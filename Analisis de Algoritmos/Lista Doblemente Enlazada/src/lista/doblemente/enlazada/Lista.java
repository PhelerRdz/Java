package lista.doblemente.enlazada;

public class Lista {
    private Nodo start;
    private Nodo end;
    
    public Lista(){
        start=null;
        end=null;
    }
    
    public void insertStart(String fact){
        if (start == null) {
            start = new Nodo(null,null,fact);
            end = start;
        }else{
            Nodo nuevo = new Nodo(start,null,fact);
            start.setBack(nuevo);
            start=nuevo;
        }
    }
    
    public void insertEnd(String fact){
        if (start == null) {
            end = new Nodo(null,null,fact);
            start = end;
        }else{
            Nodo nuevo = new Nodo(null,end,fact);
            end.setNext(nuevo);
            end=nuevo;
        }
    }
    public String DeleteStart(){
        String fact = start.getFact();
        start = start.getNext();
        if (start!=null) {
            start.setBack(null);
        }else{
            end=null;
        }
        return fact;
    }
    public String DeleteEnd(){
        String fact = end.getFact();
        end = end.getBack();
        if (end!=null) {
            end.setNext(null);
        }else{
            start=null;
        }
        return fact;
    }
    public void ToShowFront(){
        Nodo temp = start;
        while(temp!=null){
            System.out.println(temp.getFact());
            temp = temp.getNext();
        }
    }
    public void ToShowBack(){
        Nodo temp = end;
        while(temp!=null){
            System.out.println(temp.getFact());
            temp = temp.getBack();
        }
    }
    public Boolean Search(String fact){
        Nodo temp = start;
        while(temp!=null){
            if (temp.getFact().equals(fact)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    
}
