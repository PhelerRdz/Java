package vectores;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vectores {

    private final float magnitud;
    private final float direccion;

    public Vectores(float magnitud, float direccion) {
        this.magnitud = magnitud;
        this.direccion = direccion;
    }

    public float getMagnitud() {
        return magnitud;
    }

    public float getDireccion() {
        return direccion;
    }

    public static void main(String[] args) {
        ImageIcon lock = new ImageIcon("src/vectores/atomo1.png");
        float magnitud, direccion, xresult = 0, yresult = 0;
        String result;
        result = JOptionPane.showInputDialog(null, 
                "Introduzca la Cantidad de vectores a ingresar", "Cantidad", 
                JOptionPane.INFORMATION_MESSAGE);
        Vectores vector[] = new Vectores[Integer.parseInt(result)];
        float ejex[] = new float[Integer.parseInt(result)];
        float ejey[] = new float[Integer.parseInt(result)];
        for (int i = 0; i < vector.length; i++) {
            result = JOptionPane.showInputDialog(null, 
                    "Introduzca la Magnitud del vector Numero " + (i + 1) + ":"
                    , "Introduciendo", JOptionPane.INFORMATION_MESSAGE);
            magnitud = Float.parseFloat(result);
            System.out.println("Magnitud Introducida en el Vector Numero "
                    + (i + 1) + " es de: " + magnitud);
            result = JOptionPane.showInputDialog(null, 
                    "Introduzca el Sentido del vector Numero " + (i + 1) + ":"
                    , "Introduciendo", JOptionPane.INFORMATION_MESSAGE);
            direccion = Float.parseFloat(result);
            System.out.println("Direccion Introducida en el Vector Numero "
                    + (i + 1) + " es de: " + direccion);
            vector[i] = new Vectores(magnitud, direccion);
            ejex[i] = (float) (vector[i].getMagnitud() * Math.cos(Math.toRadians(vector[i].getDireccion())));
            ejey[i] = (float) (vector[i].getMagnitud() * Math.sin(Math.toRadians(vector[i].getDireccion())));
            xresult += ejex[i];
            System.out.println(ejex[i]);
            yresult += ejey[i];
            System.out.println(ejey[i]);
        }
        System.out.println(xresult);
        System.out.println(yresult);
        float FuerzaResult = (float) Math.sqrt((double) (Math.pow(xresult, 2) + Math.pow(yresult, 2)));
        
        float AnguloResult = (float) Math.toDegrees(Math.atan(yresult / xresult));
        if (xresult < 0 && yresult > 0) {
            AnguloResult = 180 - AnguloResult;
        } else if (xresult < 0 && yresult < 0) {
            AnguloResult += 180;
        } else if (xresult > 0 && yresult < 0) {
            AnguloResult = 360 - AnguloResult;
        }
        
        String message = "La Fuerza Resultante es de: " + FuerzaResult + " N\n"
                + "El Angulo Resultante es de:  " + AnguloResult + "°";
        JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.QUESTION_MESSAGE, lock);
    }

}
