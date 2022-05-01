package poo_u1_09_operacionesfracciones;


public class POO_U1_09_OperacionesFracciones {
    public static void main(String[] args) {
        Fraccion A=new Fraccion(2,3);
        Fraccion B=new Fraccion(6,3);
        Fraccion resultado=A.suma(B);
        System.out.println("Fraccion resultado: "+resultado.getNumerador()+"/"+resultado.getDenominador());
        Fraccion resultado1=A.multipliacion(B);
        System.out.println("Fraccion resultado: "+resultado1.getNumerador()+"/"+resultado1.getDenominador());
        Fraccion resultado2=A.division(B);
        System.out.println("Fraccion resultado: "+resultado2.getNumerador()+"/"+resultado2.getDenominador());
    }

}
