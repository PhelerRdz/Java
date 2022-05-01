/*
 * UNIVERSIDAD AUTÓNOMA DE TAMAULIPAS
 * FACULTAD DE INGENENIERÍA "ARTURO NARRO SILLER"
 * CURSO DE VERANO 2019 - 2 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * PROFESOR: MCC. GARCÍA RUIZ ALEJANDRO H.
 * CONTACTO: ahgarcia@docentes.uat.edu.mx
 * 
 * EQUIPO
 * 
 * INTEGRANTES:
 * NOMBRE1
 * NOMBRE2
 * 
 * CONTACTO EQUIPO: 
 */

package Unidad3_MetodosEspeciales.Ejemplo3;

import java.util.Comparator;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class OrdenarPorParteReal implements Comparator<NumeroComplejo>{

    @Override
    public int compare(NumeroComplejo t, NumeroComplejo t1) {
        return Double.compare(t.getParte_real(), t1.getParte_real());
    }

}
