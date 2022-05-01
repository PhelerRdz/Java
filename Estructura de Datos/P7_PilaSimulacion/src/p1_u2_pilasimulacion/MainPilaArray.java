package p1_u2_pilasimulacion;

import javax.swing.JOptionPane;

public class MainPilaArray {

    public static PilaArray Pila;

    public static void main(String[] ARGUMENTOS) {
        int MAX;
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL TAMAÑO DE LA PILA"));
        Pila = new PilaArray(MAX);
        MenuPila();
    }

    public static void MenuPila() {
        int Opcion;
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"
                    + "2. ELIMINAR DATOS\n"
                    + "3. OBSERVAR DATOS\n"
                    + "4. VACIAR PILA\n"
                    + "5. SALIR\n"
                    + "--------------------------------------------------------\n"
                    + "INGRESE LA OPCION [1 - 5]", "MENU PILA", JOptionPane.QUESTION_MESSAGE));
            switch (Opcion) {
                case 1:
                    Pila.InsertarPila();
                    break;
                case 2:
                    Pila.EliminarPila();
                    break;
                case 3:
                    Pila.MostrarPila();
                    break;
                case 4:
                    Pila.VaciarPila();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA \n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true);
    }
}
