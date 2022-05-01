package operadoreslogicos;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool;
        
        System.out.println("\t\t&&\t||\t^");
        
        System.out.print("true*true\t");
        bool =true&&true;
        System.out.print(bool+"\t");
        bool =true||true;
        System.out.print(bool+"\t");
        bool =true^true;
        System.out.println(bool+"\t");
        
        System.out.print("true*false\t");
        bool =true&&false;
        System.out.print(bool+"\t");
        bool =true||false;
        System.out.print(bool+"\t");
        bool =true^false;
        System.out.println(bool+"\t");
        
        System.out.print("false*true\t");
        bool =false&&true;
        System.out.print(bool+"\t");
        bool =false||true;
        System.out.print(bool+"\t");
        bool =false^true;
        System.out.println(bool+"\t");
        
        System.out.print("false*false\t");
        bool =false&&false;
        System.out.print(bool+"\t");
        bool =false||false;
        System.out.print(bool+"\t");
        bool =false^false;
        System.out.println(bool+"\t");
        
        System.out.println("\n\t!");
        bool =!true;
        System.out.print("true\t");
        System.out.println(bool);
        bool =!false;
        System.out.print("false\t");
        System.out.println(bool);
    }
}
