package e1_ordenamientoburbuja;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno aux = new Alumno();
        Alumno alumno1 = new Alumno("Fernando", 10);
        Alumno alumno2 = new Alumno("Yeni", 9.2);
        Alumno alumno3 = new Alumno("CarloS", 8.2);
        Alumno alumno4 = new Alumno("Jorge", 7.9);
        Alumno[] array = new Alumno[4];
        array[0] = alumno4;
        array[1] = alumno2;
        array[2] = alumno1;
        array[3] = alumno3;
        for (Alumno a : array) {
            System.out.println(a);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getNombre().compareTo(array[j].getNombre()) > 0) {
                    aux.Seteado(array[i]);
                    array[i].Seteado(array[j]);
                    array[j].Seteado(aux);
                }
            }
        }
        System.out.println("ORDEN ASCENDENTE POR NOMBRE");
        for (Alumno ar1 : array) {
            System.out.println(ar1);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getCalificacion() > array[j].getCalificacion()) {
                    aux.Seteado(array[i]);
                    array[i].Seteado(array[j]);
                    array[j].Seteado(aux);
                }
            }
        }
        System.out.println("\nORDEN DESCENDENTE POR CALIFICACION");
        for (Alumno array1 : array) {
            System.out.println(array1);
        }
    }
}
