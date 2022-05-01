package lista.doblemente.enlazada;

public class Main {
    public static void main(String[] args){
        Lista list = new Lista();
        
        list.insertStart("a");
        list.insertEnd("b");
        list.insertEnd("c");
        
        list.ToShowBack();
    }
}
