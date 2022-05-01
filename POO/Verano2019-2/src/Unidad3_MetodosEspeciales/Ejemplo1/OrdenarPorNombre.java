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

package Unidad3_MetodosEspeciales.Ejemplo1;

import java.util.Comparator;

/**
 *
 * @author Alejandro_GarciaRuiz
 */
public class OrdenarPorNombre implements Comparator<Alumno>{

    @Override
    public int compare(Alumno al1, Alumno al2) {
        return al1.getNombre().compareTo(al2.getNombre());
    }

}
