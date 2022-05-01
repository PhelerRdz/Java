package tablero.de.robots;

import java.util.Random;

public class Tablero implements InterfazTablero{
    Random rnd = new Random();

    @Override
    public void InsertarRobot(Robot matrriz[][]) {
        int aleatorio = 1+rnd.nextInt(3);
        System.out.println(aleatorio);
    }

    @Override
    public void ImprimirTodos(Robot matriz[][]) {
    }

    @Override
    public void CuantosRobotsHay(Robot matriz[][]) {
    }
}
