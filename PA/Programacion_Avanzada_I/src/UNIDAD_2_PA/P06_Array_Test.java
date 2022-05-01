package UNIDAD_2_PA;

import UNIDAD_2_PA.P06_Array;
import UNIDAD_2_PA.P06_ArrayExceptions;

/**
 *
 * @author GuillermoToledano
 */
public class P06_Array_Test {

    public static void main(String[] args) throws P06_ArrayExceptions {
        P06_Array arr = new P06_Array(5);
        System.out.println("Array size: " + arr.length());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println("Elements in the array: " + arr.count());
        arr.display();
        arr.set(0, 60);
        arr.display();
        int aux = 0;
        aux = arr.get(0);
        System.out.println("Element found: " + aux);
        System.out.println("Index found: " + arr.index(70));
        System.out.println("Element removed: " + arr.remove(1));
        arr.display();
        arr.add(70);
        arr.display();
    }
}
